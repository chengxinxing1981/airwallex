package generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import bank.api.Utils;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

class TestCase {
	private String description;
	private String className;
	private String group;
	private String filePath;
	private String method;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
}

public class Generate {

	public List<String> findCases(String path) throws IOException, URISyntaxException {
		List<String> result = new ArrayList<>();
		File folder = new File(path);
		String[] filenames = folder.list();
		for (String f : filenames) {
			if (f.endsWith(".json")) {
				result.add(f);
			}
		}

		return result;
	}

	public void generate(String targetPath, String sourcePath)
			throws IOException, URISyntaxException, TemplateException {
		File templateFolder = new File(sourcePath + "bank/template/");

		String caseFolder = sourcePath + "bank/";
		List<String> files = findCases(caseFolder);
		for (String f : files) {
			TestCase testCase = new TestCase();
			String caseFileStr = Utils.readFile(caseFolder + f);
			Gson gson = new Gson();
			JsonObject jsonObj = gson.fromJson(caseFileStr, JsonObject.class);
			testCase.setGroup(jsonObj.get("group").toString());
			testCase.setDescription(jsonObj.get("description").toString());
			testCase.setClassName(f.replaceAll("\\.json", ""));
			testCase.setFilePath("bank/" + f);
			testCase.setMethod("test_" + testCase.getClassName());
			parse(templateFolder, testCase, targetPath);
		}

	}

	void parse(File templateFolder, TestCase testCase, String targetPath) throws IOException, TemplateException {
		// java.io.File.pathSeparator
		String targetFilePath = targetPath + File.separator + testCase.getClassName() + ".java";
		System.out.printf("Begin to generate %s \n", targetFilePath);
		File target = new File(targetFilePath);
		if (target.exists()) {
			System.out.printf("File %s already exist. Skip to generate\n", targetFilePath);
			return;
		}
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
		cfg.setDirectoryForTemplateLoading(templateFolder);
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		Template template = cfg.getTemplate("class.ftl");

		Map<String, Object> values = new HashMap<>();
		values.put("className", testCase.getClassName());
		values.put("description", testCase.getDescription());
		values.put("group", testCase.getGroup());
		values.put("filePath", testCase.getFilePath());
		values.put("method", testCase.getMethod());

		Writer file = new FileWriter(target);
		try {
			template.process(values, file);
			file.flush();
		} finally {
			file.close();
		}
		System.out.printf("Finish to generate %s \n", targetFilePath);

	}

	public static void main(String args[]) throws IOException, URISyntaxException, TemplateException {
		new Generate().generate(args[0], args[1]);
	}
}
