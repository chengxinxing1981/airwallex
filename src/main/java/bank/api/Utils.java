package bank.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Utils {
	public static String loadDataFiles(String filePath) throws IOException {
		InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(filePath);
		if (inputStream == null) {
			return "";
		}
		StringBuilder result = new StringBuilder();
		try (InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
			BufferedReader reader = new BufferedReader(streamReader);
			for (String line; (line = reader.readLine()) != null;) {
				result.append(line);
			}
		}

		return result.toString();
	}

	public static String readFile(String filePath) throws IOException {
		StringBuilder contentBuilder = new StringBuilder();
		try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
			stream.forEach(s -> contentBuilder.append(s).append("\n"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contentBuilder.toString();
	}

}
