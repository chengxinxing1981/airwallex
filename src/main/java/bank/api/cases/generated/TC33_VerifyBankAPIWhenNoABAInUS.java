package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC33_VerifyBankAPIWhenNoABAInUS extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC33_VerifyBankAPIWhenNoABAInUS.class);
	
	private String caseFile = "bank/TC33_VerifyBankAPIWhenNoABAInUS.json";
		
	@Test(groups = {"ABA"})
	public void test_TC33_VerifyBankAPIWhenNoABAInUS() throws ClientProtocolException, IOException{
		Log.info("------Testcase33, BankAPI, No ABA when location is US------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
