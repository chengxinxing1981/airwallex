package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC10_VerifyBankAPIWhenAccountNameLengthIsTwo extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC10_VerifyBankAPIWhenAccountNameLengthIsTwo.class);
	
	private String caseFile = "bank/TC10_VerifyBankAPIWhenAccountNameLengthIsTwo.json";
		
	@Test(groups = {"AccountName"})
	public void test_TC10_VerifyBankAPIWhenAccountNameLengthIsTwo() throws ClientProtocolException, IOException{
		Log.info("------Testcase10, BankAPI, Account Name Length is two ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
