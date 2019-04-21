package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC37_VerifyBankAPIWhenSwiftCodeWithIncorrectSpecificChar extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC37_VerifyBankAPIWhenSwiftCodeWithIncorrectSpecificChar.class);
	
	private String caseFile = "bank/TC37_VerifyBankAPIWhenSwiftCodeWithIncorrectSpecificChar.json";
		
	@Test(groups = {"SwiftCode"})
	public void test_TC37_VerifyBankAPIWhenSwiftCodeWithIncorrectSpecificChar() throws ClientProtocolException, IOException{
		Log.info("------Testcase37, BankAPI, Swift Code 5th 6th isn't match bank country code------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
