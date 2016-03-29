package com.tongna.stock.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.stock.api.GethdataApi;
import com.tongna.stock.domain.DazongjiaoyiListBack;
import com.tongna.stock.domain.GethdataListBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class GethdataApiImpl implements GethdataApi {

	public GethdataListBack findGethdata(String date, String code) {
		// TODO Auto-generated method stub
		String url = "http://apis.baidu.com/tehir/stockassistant/gethdata";
		HttpRequest request = HttpRequest.get(url);
		request.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		request.query("date", date);
		request.query("code", code);
		
		HttpResponse response = request.send();
		String body = response.body();
		Gson son = new Gson();
		GethdataListBack result = son.fromJson(body, GethdataListBack.class);
		
		return result;
	}

}
