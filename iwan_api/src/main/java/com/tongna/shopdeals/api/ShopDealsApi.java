package com.tongna.shopdeals.api;

import com.tongna.shopdeals.domain.ShopDealsListBack;

/**
 * 糯米开放api 获取商家信息
 * 
 * @author aniaojian
 *
 */
public interface ShopDealsApi {

	/**
	 * 
	 * @param shop_id
	 * @return
	 */
	ShopDealsListBack findById(Integer shop_id);
}
