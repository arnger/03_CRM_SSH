package com.tongna.stock.api;

import com.tongna.stock.domain.HistDateListBack;

public interface HistDateApi {
	/**
	 * 通过日期和取票代码，查询每日非复权信息
	 */
	
	HistDateListBack findHistDate(String date,String code);
}
