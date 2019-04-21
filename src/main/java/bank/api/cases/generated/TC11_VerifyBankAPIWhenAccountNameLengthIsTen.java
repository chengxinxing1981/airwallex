package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC11_VerifyBankAPIWhenAccountNameLengthIsTen extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC11_VerifyBankAPIWhenAccountNameLengthIsTen.class);
	
	private String caseFile = "bank/TC11_VerifyBankAPIWhenAccountNameLengthIsTen.json";
		
	@Test(groups = {"AccountName"})
	public void test_TC11_VerifyBankAPIWhenAccountNameLengthIsTen() throws ClientProtocolException, IOException{
		Log.info("------Testcase11, BankAPI, Account Name Length is Ten ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
