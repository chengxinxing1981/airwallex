package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC06_VerifyBankAPIWhenBankCountryCodeIsCN extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC06_VerifyBankAPIWhenBankCountryCodeIsCN.class);
	
	private String caseFile = "bank/TC06_VerifyBankAPIWhenBankCountryCodeIsCN.json";
		
	@Test(groups = {"BankCountryCode"})
	public void test_TC06_VerifyBankAPIWhenBankCountryCodeIsCN() throws ClientProtocolException, IOException{
		Log.info("------Testcase06, BankAPI, Bank Country Code is CN------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
