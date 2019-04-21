package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC19_VerifyBankAPIWhenAUAccountNumberLengthLessThanSix extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC19_VerifyBankAPIWhenAUAccountNumberLengthLessThanSix.class);
	
	private String caseFile = "bank/TC19_VerifyBankAPIWhenAUAccountNumberLengthLessThanSix.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC19_VerifyBankAPIWhenAUAccountNumberLengthLessThanSix() throws ClientProtocolException, IOException{
		Log.info("------Testcase19, BankAPI, AU Account Number length less than six ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
