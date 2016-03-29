package com.ada.iwan.utils;

import com.openyelp.client.RestFulClient;

public class RpcUtils {

	//http://yelp.tiger.mopaasapp.com/
	//http://yelp.sturgeon.mopaas.com/rpc
	//http://192.168.199.171:8080/iwan/rpc
	static String url = "http://iwanspace.duapp.com/rpc";
	//static String url = "http://iwanspace.duapp.com/rpc";

	public static void main(String[] args) {
		
	}

	public static <T> T get(Class<T> classx) {
		T s = RestFulClient.getService(url, classx);
		return s;
	}
}
