package com.tongna.stock.domain;

import java.util.List;

public class ToplistListBack extends Back {
	/**
	 * 建立龙虎榜对象
	 */
	
	private List<Toplist> rows;

	public List<Toplist> getRows() {
		return rows;
	}

	public void setRows(List<Toplist> rows) {
		this.rows = rows;
	}
}
