package com.tongna.stock.domain;

import java.util.List;
/**
 * 创建成交股实体类
 * @author dell1
 *
 */
public class HgttenListBack extends Back {
	
	private List<Hgtten> rows;

	public List<Hgtten> getRows() {
		return rows;
	}

	public void setRows(List<Hgtten> rows) {
		this.rows = rows;
	}
	
}
