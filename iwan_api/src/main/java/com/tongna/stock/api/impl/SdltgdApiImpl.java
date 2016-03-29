package com.tongna.stock.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.stock.api.SdltgdApi;
import com.tongna.stock.domain.SdltgdListBack;
import com.tongna.stock.domain.StockListBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class SdltgdApiImpl implements SdltgdApi {

	public SdltgdListBack findSdltgd(String date) {
		// TODO Auto-generated method stub
		String url = "http://apis.baidu.com/tehir/stockassistant/sdltgd";
		HttpRequest request = HttpRequest.get(url);
		request.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		request.query("date", date);
		
		HttpResponse response = request.send();
		String body = response.body();
		JsonFactory jf = new JsonFactory();
		Gson son = jf.gson();
		SdltgdListBack result = son.fromJson(body, SdltgdListBack.class);

		return result;
	}

}
