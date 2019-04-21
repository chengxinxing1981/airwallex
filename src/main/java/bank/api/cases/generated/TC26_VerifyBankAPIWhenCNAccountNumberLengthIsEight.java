package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC26_VerifyBankAPIWhenCNAccountNumberLengthIsEight extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC26_VerifyBankAPIWhenCNAccountNumberLengthIsEight.class);
	
	private String caseFile = "bank/TC26_VerifyBankAPIWhenCNAccountNumberLengthIsEight.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC26_VerifyBankAPIWhenCNAccountNumberLengthIsEight() throws ClientProtocolException, IOException{
		Log.info("------Testcase26, BankAPI, CN Account Number is eight ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
