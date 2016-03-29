package com.tongna.stock.domain;

import java.util.List;

public class StockListBack extends Back {
	/**
	 * 创建一个股票信息集合
	 * 
	 */
	private List<Stocklist> rows;

	public List<Stocklist> getRows() {
		return rows;
	}

	public void setRows(List<Stocklist> rows) {
		this.rows = rows;
	}
}
