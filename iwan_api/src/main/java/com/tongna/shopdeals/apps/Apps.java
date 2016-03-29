package com.tongna.shopdeals.apps;

import java.util.List;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.shopdeals.domain.ShopDeals;
import com.tongna.shopdeals.domain.ShopDealsListBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class Apps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpRequest httpRequest = HttpRequest.get("http://apis.baidu.com/baidunuomi/openapi/shopdeals");
		httpRequest.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		httpRequest.query("shop_id", "1745896");

		HttpResponse response = httpRequest.send();
		String body = response.body();
		System.out.println(body);
		JsonFactory f = new JsonFactory();
		Gson gson = f.gson();
		ShopDealsListBack result = gson.fromJson(body, ShopDealsListBack.class);
		List<ShopDeals> shops = result.getDeals();
		for (ShopDeals shop : shops) {
			System.out.println(shop);
		}
		System.out.println(result);
	}

}
