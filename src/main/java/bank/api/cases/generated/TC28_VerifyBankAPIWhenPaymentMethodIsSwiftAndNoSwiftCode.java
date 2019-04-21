package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC28_VerifyBankAPIWhenPaymentMethodIsSwiftAndNoSwiftCode extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC28_VerifyBankAPIWhenPaymentMethodIsSwiftAndNoSwiftCode.class);
	
	private String caseFile = "bank/TC28_VerifyBankAPIWhenPaymentMethodIsSwiftAndNoSwiftCode.json";
		
	@Test(groups = {"SwiftCode"})
	public void test_TC28_VerifyBankAPIWhenPaymentMethodIsSwiftAndNoSwiftCode() throws ClientProtocolException, IOException{
		Log.info("------Testcase28, BankAPI, Payment mtehod is swift and no swift code------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
