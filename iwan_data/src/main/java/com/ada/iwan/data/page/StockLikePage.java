package com.ada.iwan.data.page;

import com.ada.data.core.Pagination;
import com.ada.data.dto.PageRpc;
import com.ada.iwan.data.entity.StockLike;
public class StockLikePage extends PageRpc<StockLike> {

	public StockLikePage(Pagination<StockLike> page) {
		super(page);
	}

}
