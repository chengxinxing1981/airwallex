package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC16_VerifyBankAPIWhenUSAccountNumberLengthLessThanOne extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC16_VerifyBankAPIWhenUSAccountNumberLengthLessThanOne.class);
	
	private String caseFile = "bank/TC16_VerifyBankAPIWhenUSAccountNumberLengthLessThanOne.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC16_VerifyBankAPIWhenUSAccountNumberLengthLessThanOne() throws ClientProtocolException, IOException{
		Log.info("------Testcase16, BankAPI, Account Number less than one in US------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
