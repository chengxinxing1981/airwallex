package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC02_VerifyBankAPIWhenPaymentMethodIsSwift extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC02_VerifyBankAPIWhenPaymentMethodIsSwift.class);
	
	private String caseFile = "bank/TC02_VerifyBankAPIWhenPaymentMethodIsSwift.json";
		
	@Test(groups = {"PaymentMethod"})
	public void test_TC02_VerifyBankAPIWhenPaymentMethodIsSwift() throws ClientProtocolException, IOException{
		Log.info("------Testcase02, BankAPI, paymentmethod is SWIFT------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
