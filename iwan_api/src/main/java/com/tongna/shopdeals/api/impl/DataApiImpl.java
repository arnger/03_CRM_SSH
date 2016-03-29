package com.tongna.shopdeals.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.shopdeals.api.DataApi;
import com.tongna.shopdeals.domain.DataBack;
import com.tongna.shopdeals.domain.DealDetailBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class DataApiImpl implements DataApi {

	public DataBack findData(int city_id, String cat_ids, String subcat_ids, String district_ids, String bizarea_ids,
			String location, String keyword, int radius, int sort, int page, int page_size,
			int is_reservation_required) {
		// TODO Auto-generated method stub
		String url = "http://apis.baidu.com/baidunuomi/openapi/searchdeals";
		HttpRequest httpRequest = HttpRequest.get(url);
		httpRequest.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		httpRequest.query("city_id", ""+city_id);
		httpRequest.query("cat_ids", ""+cat_ids);
		httpRequest.query("subcat_ids", ""+subcat_ids);
		httpRequest.query("district_ids", ""+district_ids);
		httpRequest.query("bizarea_ids", ""+bizarea_ids);
		httpRequest.query("location", ""+location);
		httpRequest.query("keyword", ""+keyword);
		httpRequest.query("radius", ""+radius);
		httpRequest.query("sort", ""+sort);
		httpRequest.query("page", ""+page);
		httpRequest.query("page_size", ""+page_size);
		httpRequest.query("is_reservation_required", ""+is_reservation_required);

		HttpResponse response = httpRequest.send();
		String body = response.body();
		System.out.println(body);
		JsonFactory f = new JsonFactory();
		Gson gson = f.gson();
		DataBack result = gson.fromJson(body, DataBack.class);//Gson.fromJson() 方法将 JSON 串反序列化为 java 数组。
		return result;
	}

}
