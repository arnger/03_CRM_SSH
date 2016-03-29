package org.iwan.rpc;

import com.ada.iwan.apps.ObjectFactory;
import com.ada.iwan.data.service.StockService;

public class StockApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockService service=RpcUtils.get(StockService.class);
		service.updates();
	}

}
