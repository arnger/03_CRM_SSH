package com.ada.iwan.data.page;

import com.ada.data.core.Pagination;
import com.ada.data.dto.PageRpc;
import com.ada.iwan.data.entity.StockCatalog;
public class StockCatalogPage extends PageRpc<StockCatalog> {

	public StockCatalogPage(Pagination<StockCatalog> page) {
		super(page);
	}

}
