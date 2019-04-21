package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC07_VerifyBankAPIWhenBankCountryCodeIsNotAUCNUS extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC07_VerifyBankAPIWhenBankCountryCodeIsNotAUCNUS.class);
	
	private String caseFile = "bank/TC07_VerifyBankAPIWhenBankCountryCodeIsNotAUCNUS.json";
		
	@Test(groups = {"BankCountryCode"})
	public void test_TC07_VerifyBankAPIWhenBankCountryCodeIsNotAUCNUS() throws ClientProtocolException, IOException{
		Log.info("------Testcase07, BankAPI, Bank Country Code isn't US AU CN------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
