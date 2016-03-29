package com.ada.iwan.service.stock.api.impl;

import com.ada.iwan.service.factory.JsonFactory;
import com.ada.iwan.service.stock.api.StockApi;
import com.ada.iwan.service.stock.domain.StockDetailBack;
import com.ada.iwan.service.stock.domain.StockListBack;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import jodd.http.HttpRequest;
import jodd.util.StringUtil;

public class StockListApiImpl implements StockApi {

	public StockListBack findStcokList(int page, int rows) {
		// TODO Auto-generated method stub
		String url = "http://apis.baidu.com/tehir/stockassistant/stocklist";
		HttpRequest request = HttpRequest.get(url);
		request.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		request.query("page", page);
		request.query("rows", rows);

		String body = request.send().body();
		body = StringUtil.convertCharset(body, "ISO-8859-1", "UTF-8");
		JsonFactory jf = new JsonFactory();
		Gson son = jf.gson();
		StockListBack result = son.fromJson(body, StockListBack.class);

		return result;
	}

	public StockDetailBack findByCode(String code) {
		String url = "http://apis.baidu.com/apistore/stockservice/stock";
		HttpRequest request = HttpRequest.get(url);
		request.header("apikey", "93dc6d5e4999b89fd5dcaa6e8b52ead8");
		if (code.startsWith("6")) {
			request.query("stockid", "sh" + code);
		} else if (code.startsWith("3")) {
			request.query("stockid", "sz" + code);
		} else if (code.startsWith("0")) {
			request.query("stockid", "sz" + code);
		}
		request.query("list", "其它");

		String body = request.send().body();
		body = StringUtil.convertCharset(body, "ISO-8859-1", "UTF-8");
		JsonParser parser = new JsonParser();
		JsonElement e = parser.parse(body);
		body = e.getAsJsonObject().get("retData").getAsJsonObject().get("stockinfo").getAsJsonArray().get(0).toString();
		
		System.out.println(body);
		
		
		JsonFactory jf = new JsonFactory();
		Gson son = jf.gson();
		StockDetailBack result = son.fromJson(body, StockDetailBack.class);

		return result;
	}

}
