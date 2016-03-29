package com.tongna.stock.api;

import com.tongna.stock.domain.ToplistListBack;

public interface ToplistApi {
	/**
	 * 通过日期和取票代码查询龙虎榜信息
	 */
	
	ToplistListBack findToplist(String date,String code);
}
