package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class ${className} extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(${className}.class);
	
	private String caseFile = "${filePath}";
		
	@Test(groups = {${group}})
	public void ${method}() throws ClientProtocolException, IOException{
		Log.info(${description});
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
