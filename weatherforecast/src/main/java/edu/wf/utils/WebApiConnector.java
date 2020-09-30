package edu.wf.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WebApiConnector {
	public final static String KEY = "43817000aaa647ef9a095758679e4165";
	
	public static String connect(String urlString) {
		urlString = urlString + "&gzip=n&key=" + WebApiConnector.KEY;
		System.out.println(urlString);
        URL url;
        HttpURLConnection conn = null;
        StringBuilder sb = new StringBuilder();
		try {
			url = new URL(urlString);
			conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setDoOutput(true);
	        conn.setRequestProperty("Content-Type", "application/json");
	        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
	            InputStream is = conn.getInputStream();
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                sb.append(line);
	            }
	        }
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
		
		return sb.toString();
	}
}
