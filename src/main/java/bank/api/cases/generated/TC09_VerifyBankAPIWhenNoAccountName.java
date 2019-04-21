package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC09_VerifyBankAPIWhenNoAccountName extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC09_VerifyBankAPIWhenNoAccountName.class);
	
	private String caseFile = "bank/TC09_VerifyBankAPIWhenNoAccountName.json";
		
	@Test(groups = {"AccountName"})
	public void test_TC09_VerifyBankAPIWhenNoAccountName() throws ClientProtocolException, IOException{
		Log.info("------Testcase09, BankAPI, No Account Name------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
