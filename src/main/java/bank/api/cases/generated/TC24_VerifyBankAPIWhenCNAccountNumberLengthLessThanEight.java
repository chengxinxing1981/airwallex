package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC24_VerifyBankAPIWhenCNAccountNumberLengthLessThanEight extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC24_VerifyBankAPIWhenCNAccountNumberLengthLessThanEight.class);
	
	private String caseFile = "bank/TC24_VerifyBankAPIWhenCNAccountNumberLengthLessThanEight.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC24_VerifyBankAPIWhenCNAccountNumberLengthLessThanEight() throws ClientProtocolException, IOException{
		Log.info("------Testcase24, BankAPI, CN Account Number less than eight ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
