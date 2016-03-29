package com.ada.iwan.service.stock.domain;

import java.util.List;

import com.ada.iwan.data.entity.Stock;

public class StockListBack extends Back {
	/**
	 * 创建一个股票信息集合
	 * 
	 */
	private List<StockBack> rows;

	public List<StockBack> getRows() {
		return rows;
	}

	public void setRows(List<StockBack> rows) {
		this.rows = rows;
	}
}
