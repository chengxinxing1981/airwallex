package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC01_VerifyBankAPIWhenPaymentMethodIsLocal extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC01_VerifyBankAPIWhenPaymentMethodIsLocal.class);
	
	private String caseFile = "bank/TC01_VerifyBankAPIWhenPaymentMethodIsLocal.json";
		
	@Test(groups = {"PaymentMethod"})
	public void test_TC01_VerifyBankAPIWhenPaymentMethodIsLocal() throws ClientProtocolException, IOException{
		Log.info("------Testcase01, BankAPI, paymentmethod is LOCAL------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
