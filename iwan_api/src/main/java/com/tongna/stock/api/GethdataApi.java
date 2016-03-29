package com.tongna.stock.api;

import com.tongna.stock.domain.GethdataListBack;

public interface GethdataApi {
	/**
	 * 通过日期和取票代码查看每日复权行情信息
	 */
	
	GethdataListBack findGethdata(String date,String code);
}
