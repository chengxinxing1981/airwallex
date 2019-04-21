package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC36_VerifyBankAPIWhenNoABAInCN extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC36_VerifyBankAPIWhenNoABAInCN.class);
	
	private String caseFile = "bank/TC36_VerifyBankAPIWhenNoABAInCN.json";
		
	@Test(groups = {"ABA"})
	public void test_TC36_VerifyBankAPIWhenNoABAInCN() throws ClientProtocolException, IOException{
		Log.info("------Testcase36, BankAPI, No ABA when location is CN------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
