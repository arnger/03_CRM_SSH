package com.tongna.stock.api;

import com.tongna.stock.domain.SdltgdListBack;

public interface SdltgdApi {
	/**
	 * 通过时间来查询十大季报
	 * 
	 */
	
	SdltgdListBack findSdltgd(String date);
}
