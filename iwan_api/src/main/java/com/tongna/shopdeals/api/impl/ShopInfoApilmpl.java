package com.tongna.shopdeals.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.shopdeals.api.ShopInfoApi;
import com.tongna.shopdeals.domain.ShopInfoBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class ShopInfoApilmpl implements ShopInfoApi {

	public ShopInfoBack findById(Integer shop_id) {
		// TODO Auto-generated method stub
		String url="http://apis.baidu.com/baidunuomi/openapi/shopinfo";
		if (shop_id == null) {
			return null;
		}
		HttpRequest httpRequest = HttpRequest.get(url);
		httpRequest.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		httpRequest.query("shop_id", ""+shop_id);

		HttpResponse response = httpRequest.send();
		String body = response.body();
		JsonFactory f = new JsonFactory();
		Gson gson = f.gson();
		ShopInfoBack result = gson.fromJson(body, ShopInfoBack.class);//Gson.fromJson() 方法将 JSON 串反序列化为 java 数组。
		return result;
	}

}
