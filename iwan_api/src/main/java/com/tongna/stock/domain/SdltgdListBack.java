package com.tongna.stock.domain;

import java.util.List;

public class SdltgdListBack extends Back{
	/**
	 * 定义十大季报对象
	 */
	
	private List<Sdltgd> rows;

	public List<Sdltgd> getRows() {
		return rows;
	}

	public void setRows(List<Sdltgd> rows) {
		this.rows = rows;
	}
}
