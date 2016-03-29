package com.tongna.shopdeals.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.shopdeals.api.DealDetailApi;
import com.tongna.shopdeals.domain.DealDetailBack;
import com.tongna.shopdeals.domain.ShopDealsListBack;
import com.tongna.shopdeals.domain.ShopInfoBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class DealDetailApiImpl implements DealDetailApi {

	public DealDetailBack findById(Integer deal_id) {
		String url="http://apis.baidu.com/baidunuomi/openapi/dealdetail";
		if (deal_id == null) {
			return null;
		}
		HttpRequest httpRequest = HttpRequest.get(url);
		httpRequest.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		httpRequest.query("deal_id", ""+deal_id);

		HttpResponse response = httpRequest.send();
		String body = response.body();
		JsonFactory f = new JsonFactory();
		Gson gson = f.gson();
		DealDetailBack result = gson.fromJson(body, DealDetailBack.class);//Gson.fromJson() 方法将 JSON 串反序列化为 java 数组。
		return result;
	  
	}

}
