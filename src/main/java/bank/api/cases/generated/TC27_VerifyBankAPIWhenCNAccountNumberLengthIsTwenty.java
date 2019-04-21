package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC27_VerifyBankAPIWhenCNAccountNumberLengthIsTwenty extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC27_VerifyBankAPIWhenCNAccountNumberLengthIsTwenty.class);
	
	private String caseFile = "bank/TC27_VerifyBankAPIWhenCNAccountNumberLengthIsTwenty.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC27_VerifyBankAPIWhenCNAccountNumberLengthIsTwenty() throws ClientProtocolException, IOException{
		Log.info("------Testcase27, BankAPI, CN Account Number is 20 ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
