package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC22_VerifyBankAPIWhenAUAccountNumberLengthIsSix extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC22_VerifyBankAPIWhenAUAccountNumberLengthIsSix.class);
	
	private String caseFile = "bank/TC22_VerifyBankAPIWhenAUAccountNumberLengthIsSix.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC22_VerifyBankAPIWhenAUAccountNumberLengthIsSix() throws ClientProtocolException, IOException{
		Log.info("------Testcase22, BankAPI, AU Account Number length is six ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
