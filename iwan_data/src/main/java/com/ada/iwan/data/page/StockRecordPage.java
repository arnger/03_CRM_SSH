package com.ada.iwan.data.page;

import com.ada.data.core.Pagination;
import com.ada.data.dto.PageRpc;
import com.ada.iwan.data.entity.StockRecord;
public class StockRecordPage extends PageRpc<StockRecord> {

	public StockRecordPage(Pagination<StockRecord> page) {
		super(page);
	}

}
