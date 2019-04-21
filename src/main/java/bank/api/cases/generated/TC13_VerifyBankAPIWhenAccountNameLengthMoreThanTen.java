package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC13_VerifyBankAPIWhenAccountNameLengthMoreThanTen extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC13_VerifyBankAPIWhenAccountNameLengthMoreThanTen.class);
	
	private String caseFile = "bank/TC13_VerifyBankAPIWhenAccountNameLengthMoreThanTen.json";
		
	@Test(groups = {"AccountName"})
	public void test_TC13_VerifyBankAPIWhenAccountNameLengthMoreThanTen() throws ClientProtocolException, IOException{
		Log.info("------Testcase13, BankAPI, Account Name Length is more than ten ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
