package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC23_VerifyBankAPIWhenAccountNumberInCN extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC23_VerifyBankAPIWhenAccountNumberInCN.class);
	
	private String caseFile = "bank/TC23_VerifyBankAPIWhenAccountNumberInCN.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC23_VerifyBankAPIWhenAccountNumberInCN() throws ClientProtocolException, IOException{
		Log.info("------Testcase23, BankAPI, Account Number in CN ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
