package org.iwan.rpc;

import com.ada.iwan.data.entity.StockCatalog;
import com.ada.iwan.data.service.StockCatalogService;

public class StockCatalogApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockCatalogService catalogService = RpcUtils.get(StockCatalogService.class);

		StockCatalog bean = new StockCatalog();
		bean.setName("分类");
		catalogService.save(bean);
	}

}
