package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC03_VerifyBankAPIWhenPaymentMethodIsEitherLocalOrSwift extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC03_VerifyBankAPIWhenPaymentMethodIsEitherLocalOrSwift.class);
	
	private String caseFile = "bank/TC03_VerifyBankAPIWhenPaymentMethodIsEitherLocalOrSwift.json";
		
	@Test(groups = {"PaymentMethod"})
	public void test_TC03_VerifyBankAPIWhenPaymentMethodIsEitherLocalOrSwift() throws ClientProtocolException, IOException{
		Log.info("------Testcase03, BankAPI, paymentmethod is either local or swift------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
