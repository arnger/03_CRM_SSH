package com.ada.iwan.data.page;

import com.ada.data.core.Pagination;
import com.ada.data.dto.PageRpc;
import com.ada.iwan.data.entity.StockNote;
public class StockNotePage extends PageRpc<StockNote> {

	public StockNotePage(Pagination<StockNote> page) {
		super(page);
	}

}
