package com.spark.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


import net.sf.json.JSONObject;

public class HttpClientUtil {

	public static final String APPID = "wxb4c7e9de3db7fe7a";
	
	public static final String APPSECRET = "7b19e866f0c2b228e8a21ce2077472e4";
	
	public static JSONObject doGet(String url) throws ClientProtocolException, IOException {

		JSONObject jsonObject = null;
		
		
		DefaultHttpClient httpClient = new DefaultHttpClient();
		
		HttpGet getRequest = new HttpGet(url);
		
		HttpResponse response = httpClient.execute(getRequest);
		
		HttpEntity entity = response.getEntity();
		
		if(entity!=null) {
			String result = EntityUtils.toString(entity,"UTF-8");
			jsonObject = JSONObject.fromObject(result);
		}
		
		getRequest.releaseConnection();
		
		return jsonObject;

	}

}
