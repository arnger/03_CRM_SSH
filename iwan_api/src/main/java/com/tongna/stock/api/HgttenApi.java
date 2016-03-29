package com.tongna.stock.api;

import com.tongna.stock.domain.HgttenListBack;

public interface HgttenApi {
	/**
	 * 通过日期查询当天的十大成交股
	 * @param date
	 * @return
	 */
	
	HgttenListBack findHgtten(String date);
}
