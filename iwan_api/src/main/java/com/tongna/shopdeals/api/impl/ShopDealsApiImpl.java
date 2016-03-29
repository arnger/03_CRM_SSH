package com.tongna.shopdeals.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.shopdeals.api.ShopDealsApi;
import com.tongna.shopdeals.domain.ShopDeals;
import com.tongna.shopdeals.domain.ShopDealsListBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class ShopDealsApiImpl implements ShopDealsApi {

	public ShopDealsListBack findById(Integer shop_id) {
		if (shop_id == null) {
			return null;
		}
		HttpRequest httpRequest = HttpRequest.get("http://apis.baidu.com/baidunuomi/openapi/shopdeals");
		httpRequest.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		httpRequest.query("shop_id", ""+shop_id);

		HttpResponse response = httpRequest.send();
		String body = response.body();
		JsonFactory f = new JsonFactory();
		Gson gson = f.gson();
		ShopDealsListBack result = gson.fromJson(body, ShopDealsListBack.class);
		return result;
	}

}
