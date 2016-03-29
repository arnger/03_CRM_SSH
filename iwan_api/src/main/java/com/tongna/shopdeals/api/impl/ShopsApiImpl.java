package com.tongna.shopdeals.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.shopdeals.api.ShopsApi;
import com.tongna.shopdeals.domain.ShopListBack;
import com.tongna.shopdeals.domain.ShopInfoBack;
import com.tongna.shopdeals.domain.ShopsListBack;
import com.tongna.shopdeals.dto.ShopDto;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class ShopsApiImpl implements ShopsApi {

	public ShopsListBack findShops(int city_id, int deal_id) {
		// TODO Auto-generated method stub
		String url = "http://apis.baidu.com/baidunuomi/openapi/dealshops";
		HttpRequest request =  HttpRequest.get(url);
		request.header("apikey","93dc6d5e4999b89fd5dcaa6e8b52ead8");
		request.query("city_id", city_id);
		request.query("deal_id", deal_id);
		
		HttpResponse response = request.send();
		String body = response.body();
		JsonFactory f = new JsonFactory();
		Gson gson = f.gson();
		ShopsListBack result = gson.fromJson(body, ShopsListBack.class);
		return result;
	}

	public ShopListBack search(ShopDto dto) {
		String url="http://apis.baidu.com/baidunuomi/openapi/searchshops";
		HttpRequest httpRequest = HttpRequest.get(url);
		httpRequest.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		httpRequest.query("city_id", ""+dto.getCity_id());
		if (dto.getCat_ids()!=null) {
			httpRequest.query("cat_ids", ""+dto.getCat_ids());
		}
		if (dto.getSubcat_ids()!=null) {
			httpRequest.query("subcat_ids", ""+dto.getSubcat_ids());
		}
		if (dto.getDistrict_ids()!=null) {
			httpRequest.query("district_ids", ""+dto.getDistrict_ids());
		}
		if (dto.getBizarea_ids()!=null) {
			httpRequest.query("bizarea_ids", ""+dto.getBizarea_ids());
		}
		httpRequest.query("location", ""+dto.getLocation());
		if (dto.getKeyword()!=null) {
			httpRequest.query("keyword", ""+dto.getKeyword());
		}
		if (dto.getRadius()!=null) {
			httpRequest.query("radius", ""+dto.getRadius());
		}
		httpRequest.query("page", ""+dto.getPage());
		httpRequest.query("page_size", ""+dto.getPage_size());
		httpRequest.query("deals_per_shop", ""+dto.getDeals_per_shop());
		
		HttpResponse response = httpRequest.send();
		String body = response.body();
		JsonFactory f = new JsonFactory();
		Gson gson = f.gson();
		ShopListBack result = gson.fromJson(body, ShopListBack.class);
		return result;
	}
	
}

