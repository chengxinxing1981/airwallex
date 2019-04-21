package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC30_VerifyBankAPIWhenSwiftCodeLengthMoreThanEleven extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC30_VerifyBankAPIWhenSwiftCodeLengthMoreThanEleven.class);
	
	private String caseFile = "bank/TC30_VerifyBankAPIWhenSwiftCodeLengthMoreThanEleven.json";
		
	@Test(groups = {"SwiftCode"})
	public void test_TC30_VerifyBankAPIWhenSwiftCodeLengthMoreThanEleven() throws ClientProtocolException, IOException{
		Log.info("------Testcase30, BankAPI, Swift Code length more than eleven ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
