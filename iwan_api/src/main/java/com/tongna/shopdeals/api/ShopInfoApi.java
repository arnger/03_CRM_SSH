package com.tongna.shopdeals.api;

import com.tongna.shopdeals.domain.ShopInfoBack;

public interface ShopInfoApi {
	/**
	 * 通过商户id 查询商户详情
	 * @param shop_id
	 * @return
	 */
	ShopInfoBack findById(Integer shop_id);
}
