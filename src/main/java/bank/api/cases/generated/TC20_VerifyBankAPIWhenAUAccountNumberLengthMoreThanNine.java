package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC20_VerifyBankAPIWhenAUAccountNumberLengthMoreThanNine extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC20_VerifyBankAPIWhenAUAccountNumberLengthMoreThanNine.class);
	
	private String caseFile = "bank/TC20_VerifyBankAPIWhenAUAccountNumberLengthMoreThanNine.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC20_VerifyBankAPIWhenAUAccountNumberLengthMoreThanNine() throws ClientProtocolException, IOException{
		Log.info("------Testcase20, BankAPI, AU Account Number length more than nine ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
