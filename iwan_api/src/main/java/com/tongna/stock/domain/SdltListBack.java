package com.tongna.stock.domain;

import java.util.List;

public class SdltListBack extends Back {
	/**
	 * 定义股东对象
	 * 
	 */
	private List<Sdlt> rows;

	public List<Sdlt> getRows() {
		return rows;
	}

	public void setRows(List<Sdlt> rows) {
		this.rows = rows;
	}
	
}
