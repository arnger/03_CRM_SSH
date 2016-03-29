package com.ada.iwan.data.page;

import com.ada.data.core.Pagination;
import com.ada.data.dto.PageRpc;
import com.ada.iwan.data.entity.Stock;
public class StockPage extends PageRpc<Stock> {

	public StockPage(Pagination<Stock> page) {
		super(page);
	}

}
