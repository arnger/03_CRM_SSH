package com.tongna.stock.api;

import com.tongna.stock.domain.NeibujiaoyiListBack;

public interface NeibujiaoyiApi {
	/**
	 * 通过日期来查询内部交易信息
	 */
	
	NeibujiaoyiListBack findNeibujiaoyi(String date);
}
