package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC14_VerifyBankAPIWhenNoAccountNumber extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC14_VerifyBankAPIWhenNoAccountNumber.class);
	
	private String caseFile = "bank/TC14_VerifyBankAPIWhenNoAccountNumber.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC14_VerifyBankAPIWhenNoAccountNumber() throws ClientProtocolException, IOException{
		Log.info("------Testcase14, BankAPI, No Account Number------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
