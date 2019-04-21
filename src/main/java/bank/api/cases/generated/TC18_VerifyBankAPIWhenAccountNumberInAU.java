package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC18_VerifyBankAPIWhenAccountNumberInAU extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC18_VerifyBankAPIWhenAccountNumberInAU.class);
	
	private String caseFile = "bank/TC18_VerifyBankAPIWhenAccountNumberInAU.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC18_VerifyBankAPIWhenAccountNumberInAU() throws ClientProtocolException, IOException{
		Log.info("------Testcase18, BankAPI, Account Number in AU------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
