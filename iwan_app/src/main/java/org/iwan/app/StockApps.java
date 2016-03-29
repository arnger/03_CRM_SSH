package org.iwan.app;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

public class StockApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 2788; i++) {
			HttpRequest httpRequest = HttpRequest.get("http://www.yichisancun.com/stock/view/"+i+".htm");
		    HttpResponse response = httpRequest.send();
		}
		   
	}

}
