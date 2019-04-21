package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC08_VerifyBankAPIWhenNoBankCountryCode extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC08_VerifyBankAPIWhenNoBankCountryCode.class);
	
	private String caseFile = "bank/TC08_VerifyBankAPIWhenNoBankCountryCode.json";
		
	@Test(groups = {"BankCountryCode"})
	public void test_TC08_VerifyBankAPIWhenNoBankCountryCode() throws ClientProtocolException, IOException{
		Log.info("------Testcase08, BankAPI, No Bank Country Code------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
