package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC04_VerifyBankAPIWhenBankCountryCodeIsUS extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC04_VerifyBankAPIWhenBankCountryCodeIsUS.class);
	
	private String caseFile = "bank/TC04_VerifyBankAPIWhenBankCountryCodeIsUS.json";
		
	@Test(groups = {"BankCountryCode"})
	public void test_TC04_VerifyBankAPIWhenBankCountryCodeIsUS() throws ClientProtocolException, IOException{
		Log.info("------Testcase04, BankAPI, Bank Country Code is US------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
