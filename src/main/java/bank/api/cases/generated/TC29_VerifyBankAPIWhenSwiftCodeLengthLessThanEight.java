package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC29_VerifyBankAPIWhenSwiftCodeLengthLessThanEight extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC29_VerifyBankAPIWhenSwiftCodeLengthLessThanEight.class);
	
	private String caseFile = "bank/TC29_VerifyBankAPIWhenSwiftCodeLengthLessThanEight.json";
		
	@Test(groups = {"SwiftCode"})
	public void test_TC29_VerifyBankAPIWhenSwiftCodeLengthLessThanEight() throws ClientProtocolException, IOException{
		Log.info("------Testcase29, BankAPI, Swift Code length less than eight------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
