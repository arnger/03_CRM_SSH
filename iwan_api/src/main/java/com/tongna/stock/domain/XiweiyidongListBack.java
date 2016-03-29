package com.tongna.stock.domain;

import java.util.List;

public class XiweiyidongListBack extends Back {
	/**
	 * 建立席位异动信息对象
	 */
	
	private List<Xiweiyidong> rows;

	public List<Xiweiyidong> getRows() {
		return rows;
	}

	public void setRows(List<Xiweiyidong> rows) {
		this.rows = rows;
	}
}
