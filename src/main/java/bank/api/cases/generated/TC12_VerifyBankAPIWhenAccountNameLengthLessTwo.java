package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC12_VerifyBankAPIWhenAccountNameLengthLessTwo extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC12_VerifyBankAPIWhenAccountNameLengthLessTwo.class);
	
	private String caseFile = "bank/TC12_VerifyBankAPIWhenAccountNameLengthLessTwo.json";
		
	@Test(groups = {"AccountName"})
	public void test_TC12_VerifyBankAPIWhenAccountNameLengthLessTwo() throws ClientProtocolException, IOException{
		Log.info("------Testcase12, BankAPI, Account Name Length is less than two ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
