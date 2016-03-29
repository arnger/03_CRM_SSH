package com.tongna.stock.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.stock.api.NeibujiaoyiApi;
import com.tongna.stock.domain.NeibujiaoyiListBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class NeibujiaoyiApiImpl implements NeibujiaoyiApi {

	public NeibujiaoyiListBack findNeibujiaoyi(String date) {
		// TODO Auto-generated method stub
		String url = "http://apis.baidu.com/tehir/stockassistant/neibujiaoyi";
		HttpRequest request = HttpRequest.get(url);
		request.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		request.query("date", date);
		
		HttpResponse response =  request.send();
		String body = response.body();
//		JsonFactory jf = new JsonFactory();
//		Gson son = jf.gson();
		Gson son = new Gson();
		NeibujiaoyiListBack result = son.fromJson(body, NeibujiaoyiListBack.class);
		return result;
	}

}
