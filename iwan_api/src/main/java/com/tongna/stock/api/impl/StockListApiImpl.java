package com.tongna.stock.api.impl;

import com.google.gson.Gson;
import com.tongna.common.factory.JsonFactory;
import com.tongna.stock.api.StockListApi;
import com.tongna.stock.domain.HgttenListBack;
import com.tongna.stock.domain.StockListBack;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;
import jodd.util.StringUtil;

public class StockListApiImpl implements StockListApi {

	public StockListBack findStcokList(int page,int rows) {
		// TODO Auto-generated method stub
		String url = "http://apis.baidu.com/tehir/stockassistant/stocklist";
		HttpRequest request = HttpRequest.get(url);
		request.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		request.query("page", page);
		request.query("rows", rows);

		HttpResponse response = request.send();
		String body = request.send().body();
		body = StringUtil.convertCharset(body, "ISO-8859-1", "UTF-8");
		JsonFactory jf = new JsonFactory();
		Gson son = jf.gson();
		StockListBack result = son.fromJson(body, StockListBack.class);

		return result;
	}

}
