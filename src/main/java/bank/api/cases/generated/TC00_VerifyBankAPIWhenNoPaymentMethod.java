package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC00_VerifyBankAPIWhenNoPaymentMethod extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC00_VerifyBankAPIWhenNoPaymentMethod.class);
	
	private String caseFile = "bank/TC00_VerifyBankAPIWhenNoPaymentMethod.json";
		
	@Test(groups = {"PaymentMethod"})
	public void test_TC00_VerifyBankAPIWhenNoPaymentMethod() throws ClientProtocolException, IOException{
		Log.info("------Testcase00, BankAPI, no paymentmethod------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
