package com.tongna.stock.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.stock.api.SdltApi;
import com.tongna.stock.domain.SdltListBack;
import com.tongna.stock.domain.SdltgdListBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class SdltApiImpl implements SdltApi {

	public SdltListBack findSdlt(String date, String code) {
		// TODO Auto-generated method stub
		String url = "http://apis.baidu.com/tehir/stockassistant/sdlt";
		HttpRequest request = HttpRequest.get(url);
		request.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		request.query("date", date);
		request.query("code", code);
		
		HttpResponse response = request.send();
		String body = response.body();
		JsonFactory jf = new JsonFactory();
		Gson son = jf.gson();
		SdltListBack result = son.fromJson(body, SdltListBack.class);

		return result;
	}

}
