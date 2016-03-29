package com.tongna.stock.api;

import com.tongna.stock.domain.XiweiyidongListBack;

public interface XiweiyidongApi {
	/**
	 * 通过时间和取票代码获得席位异动信息
	 */
	
	XiweiyidongListBack findXiweiyidong(String date,String code);
}
