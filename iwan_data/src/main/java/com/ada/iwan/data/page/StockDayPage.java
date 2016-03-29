package com.ada.iwan.data.page;

import com.ada.data.core.Pagination;
import com.ada.data.dto.PageRpc;
import com.ada.iwan.data.entity.StockDay;
public class StockDayPage extends PageRpc<StockDay> {

	public StockDayPage(Pagination<StockDay> page) {
		super(page);
	}

}
