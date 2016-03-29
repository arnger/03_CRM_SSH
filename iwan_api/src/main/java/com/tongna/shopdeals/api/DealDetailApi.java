package com.tongna.shopdeals.api;

import com.tongna.shopdeals.domain.DealDetail;
import com.tongna.shopdeals.domain.DealDetailBack;

public interface DealDetailApi {
	/**
	 * 通过商品id查询团单详情
	 * @param deal_id
	 * @return
	 */
	DealDetailBack findById(Integer deal_id);
}
