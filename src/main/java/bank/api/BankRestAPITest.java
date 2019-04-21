package bank.api;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import org.apache.log4j.Logger;

public abstract class BankRestAPITest {
	protected String url = "http://preview.airwallex.com:30001/bank";
	protected String payload;
	protected String expectedSuccessMsg;
	protected String expectedErrorMsg;
	protected int expectedCode;
	
	{
		String env = System.getenv("BASE_URL");
		if (env != null) {
			url = env + "/bank";
		}
	}
	
	protected void parseTestcase(String caseFile)throws IOException {
		String caseFileStr = Utils.loadDataFiles(caseFile);
		 
		Gson gson = new Gson();
		JsonObject jsonObj = gson.fromJson(caseFileStr, JsonObject.class);
		this.payload = jsonObj.get("payload").toString();
		JsonObject expect = jsonObj.get("expected").getAsJsonObject();
		this.expectedCode = expect.get("status_code").getAsInt();
		if (expect.has("error")) {
			this.expectedErrorMsg = expect.get("error").getAsString();
		} 
		
		if (expect.has("success")) {
			this.expectedSuccessMsg = expect.get("success").getAsString();
		} 

	}

	protected CloseableHttpResponse getPostResponse(String url, String payload)
			throws ClientProtocolException, IOException {
		return HttpURLConnections.getPostResponse(url, payload);
	}
	
	protected void assertResponse(CloseableHttpResponse httpResponse)
			throws IOException, JsonSyntaxException {
		String responseStr = EntityUtils.toString(httpResponse.getEntity());
		Gson gson = new Gson();
		String actualResponseMsg = "";

		int actResponseCode = httpResponse.getStatusLine().getStatusCode();
	
		String expectedMsg ;

		JsonObject jsonObj = gson.fromJson(responseStr, JsonObject.class);
		if (actResponseCode >= 400) {
			actualResponseMsg = jsonObj.get("error").getAsString();
			expectedMsg = this.expectedErrorMsg;
		}
		else {
			actualResponseMsg = jsonObj.get("success").getAsString();
			expectedMsg = this.expectedSuccessMsg;
		}
		getLogger().info("actual response code is: " + actResponseCode);
		getLogger().info("actual response str is: " + actualResponseMsg);

		Assert.assertEquals(actResponseCode, this.expectedCode);
		Assert.assertEquals(actualResponseMsg, expectedMsg);
	}
	
	protected abstract Logger getLogger();
}
