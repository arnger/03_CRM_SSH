package com.tongna.stock.api;

import com.tongna.stock.domain.SdltListBack;

public interface SdltApi {
	/**
	 *通过季报发布日期和取票代码来查询季报十大股东
	 */
	
	SdltListBack findSdlt(String date,String code);
}
