package com.tongna.stock.domain;

import java.util.List;

public class GethdataListBack extends Back {
	/**
	 * 创建每日复权行情对象
	 */
	
	private List<Gethdata> rows;

	public List<Gethdata> getRows() {
		return rows;
	}

	public void setRows(List<Gethdata> rows) {
		this.rows = rows;
	}
}
