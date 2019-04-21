package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC25_VerifyBankAPIWhenCNAccountNumberLengthMoreThanTwenty extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC25_VerifyBankAPIWhenCNAccountNumberLengthMoreThanTwenty.class);
	
	private String caseFile = "bank/TC25_VerifyBankAPIWhenCNAccountNumberLengthMoreThanTwenty.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC25_VerifyBankAPIWhenCNAccountNumberLengthMoreThanTwenty() throws ClientProtocolException, IOException{
		Log.info("------Testcase25, BankAPI, CN Account Number more than twenty ------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
