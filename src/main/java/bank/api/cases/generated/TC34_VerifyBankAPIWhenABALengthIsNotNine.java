package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC34_VerifyBankAPIWhenABALengthIsNotNine extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC34_VerifyBankAPIWhenABALengthIsNotNine.class);
	
	private String caseFile = "bank/TC34_VerifyBankAPIWhenABALengthIsNotNine.json";
		
	@Test(groups = {"ABA"})
	public void test_TC34_VerifyBankAPIWhenABALengthIsNotNine() throws ClientProtocolException, IOException{
		Log.info("------Testcase34, BankAPI, ABA isn't 9------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
