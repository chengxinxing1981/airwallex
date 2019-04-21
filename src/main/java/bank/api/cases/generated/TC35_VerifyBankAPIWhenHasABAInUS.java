package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC35_VerifyBankAPIWhenHasABAInUS extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC35_VerifyBankAPIWhenHasABAInUS.class);
	
	private String caseFile = "bank/TC35_VerifyBankAPIWhenHasABAInUS.json";
		
	@Test(groups = {"ABA"})
	public void test_TC35_VerifyBankAPIWhenHasABAInUS() throws ClientProtocolException, IOException{
		Log.info("------Testcase35, BankAPI, ABA when location is US------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
