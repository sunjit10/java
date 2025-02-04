package net;

import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Map;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CallInstana {
    private static final String GET_URL = "https://test-instana.pink.instana.rocks/api/application-monitoring/catalog/metrics";
    public static void main(String[] args) {
	URL obj = new URL(GET_URL);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	con.setRequestMethod("GET");
	con.setRequestProperty("User-Agent", USER_AGENT);
	int responseCode = con.getResponseCode();
	System.out.println("GET Response Code :: " + responseCode);
	if (responseCode == HttpURLConnection.HTTP_OK) { // success
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    
	    while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
	    }
	    in.close();
	    
	    // print result
	    System.out.println(response.toString());
	} else {
	    System.out.println("GET request did not work.");
	}
    }
}
