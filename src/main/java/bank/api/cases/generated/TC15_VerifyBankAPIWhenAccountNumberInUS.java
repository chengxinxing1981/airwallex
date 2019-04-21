package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC15_VerifyBankAPIWhenAccountNumberInUS extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC15_VerifyBankAPIWhenAccountNumberInUS.class);
	
	private String caseFile = "bank/TC15_VerifyBankAPIWhenAccountNumberInUS.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC15_VerifyBankAPIWhenAccountNumberInUS() throws ClientProtocolException, IOException{
		Log.info("------Testcase15, BankAPI, Account Number in US------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
