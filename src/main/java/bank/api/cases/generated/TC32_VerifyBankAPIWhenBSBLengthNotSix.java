package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC32_VerifyBankAPIWhenBSBLengthNotSix extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC32_VerifyBankAPIWhenBSBLengthNotSix.class);
	
	private String caseFile = "bank/TC32_VerifyBankAPIWhenBSBLengthNotSix.json";
		
	@Test(groups = {"BSB"})
	public void test_TC32_VerifyBankAPIWhenBSBLengthNotSix() throws ClientProtocolException, IOException{
		Log.info("------Testcase32, BankAPI, bsb length isn't 6------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
