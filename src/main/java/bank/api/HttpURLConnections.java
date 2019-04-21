package bank.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;

public class HttpURLConnections {
	final static Logger Log = Logger.getLogger(HttpURLConnections.class);

	public static CloseableHttpResponse getPostResponse(String url, String payload)
			throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HashMap<String, String> headMap = getHeader();

		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new StringEntity(payload));
		for (Map.Entry<String, String> entry : headMap.entrySet()) {
			httpPost.addHeader(entry.getKey(), entry.getValue());
		}

		CloseableHttpResponse httpResponse = httpClient.execute(httpPost);

		httpPost.releaseConnection();
		return httpResponse;
	}

	private static HashMap<String, String> getHeader() {
		HashMap<String, String> headMap = new HashMap<>();
		headMap.put("Content-Type", "application/json");

		return headMap;
	}
}
