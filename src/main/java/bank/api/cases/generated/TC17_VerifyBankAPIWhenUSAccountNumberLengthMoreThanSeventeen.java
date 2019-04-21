package bank.api.cases.generated;

import org.testng.annotations.Test;
import bank.api.BankRestAPITest;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;

public class TC17_VerifyBankAPIWhenUSAccountNumberLengthMoreThanSeventeen extends BankRestAPITest{

	final static Logger Log = Logger.getLogger(TC17_VerifyBankAPIWhenUSAccountNumberLengthMoreThanSeventeen.class);
	
	private String caseFile = "bank/TC17_VerifyBankAPIWhenUSAccountNumberLengthMoreThanSeventeen.json";
		
	@Test(groups = {"AccountNumber"})
	public void test_TC17_VerifyBankAPIWhenUSAccountNumberLengthMoreThanSeventeen() throws ClientProtocolException, IOException{
		Log.info("------Testcase17, BankAPI, Account Number more than seventeen in US------");
		
		this.parseTestcase(this.caseFile);
		CloseableHttpResponse httpResponse = getPostResponse(url, this.payload);
		this.assertResponse(httpResponse);
	}
 
	protected Logger getLogger() {
		return Log;
	}
}
