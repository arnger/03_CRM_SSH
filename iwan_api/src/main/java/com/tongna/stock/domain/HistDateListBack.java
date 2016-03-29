package com.tongna.stock.domain;

import java.util.List;

public class HistDateListBack extends Back {
	/**
	 * 建立每日非复权行情对象
	 */
	
	private List<HistDate> rows;

	public List<HistDate> getRows() {
		return rows;
	}

	public void setRows(List<HistDate> rows) {
		this.rows = rows;
	}
	
}
