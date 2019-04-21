package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC21_VerifyBankAPIWhenAUAccountNumberLengthIsNine extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC21_VerifyBankAPIWhenAUAccountNumberLengthIsNine.class);
	
	private String caseFile = "bank/TC21_VerifyBankAPIWhenAUAccountNumberLengthIsNine.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC21_VerifyBankAPIWhenAUAccountNumberLengthIsNine() throws ClientProtocolException, IOException{
		Log.info("------Testcase21, BankAPI, AU Account Number length is nine ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
