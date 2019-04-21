package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC38_VerifyBankAPIWhenSwiftCodeSpecificChar extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC38_VerifyBankAPIWhenSwiftCodeSpecificChar.class);
	
	private String caseFile = "bank/TC38_VerifyBankAPIWhenSwiftCodeSpecificChar.json";
		
	@Test(groups = {"SwiftCode"})
	public void test_TC38_VerifyBankAPIWhenSwiftCodeSpecificChar() throws ClientProtocolException, IOException{
		Log.info("------Testcase38, BankAPI, Swift Code 5th 6th match bank country code------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
