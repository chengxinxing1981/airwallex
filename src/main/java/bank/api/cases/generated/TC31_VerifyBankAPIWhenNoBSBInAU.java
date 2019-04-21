package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC31_VerifyBankAPIWhenNoBSBInAU extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC31_VerifyBankAPIWhenNoBSBInAU.class);
	
	private String caseFile = "bank/TC31_VerifyBankAPIWhenNoBSBInAU.json";
		
	@Test(groups = {"BSB"})
	public void test_TC31_VerifyBankAPIWhenNoBSBInAU() throws ClientProtocolException, IOException{
		Log.info("------Testcase31, BankAPI, no bsb in AU------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
