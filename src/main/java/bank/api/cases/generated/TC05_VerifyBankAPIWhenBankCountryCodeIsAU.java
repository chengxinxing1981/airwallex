package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC05_VerifyBankAPIWhenBankCountryCodeIsAU extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC05_VerifyBankAPIWhenBankCountryCodeIsAU.class);
	
	private String caseFile = "bank/TC05_VerifyBankAPIWhenBankCountryCodeIsAU.json";
		
	@Test(groups = {"BankCountryCode"})
	public void test_TC05_VerifyBankAPIWhenBankCountryCodeIsAU() throws ClientProtocolException, IOException{
		Log.info("------Testcase05, BankAPI, Bank Country Code is AU------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
