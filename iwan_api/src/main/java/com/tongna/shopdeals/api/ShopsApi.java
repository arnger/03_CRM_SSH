package com.tongna.shopdeals.api;

import com.tongna.shopdeals.domain.ShopListBack;
import com.tongna.shopdeals.domain.ShopsListBack;
import com.tongna.shopdeals.dto.ShopDto;

public interface ShopsApi {
	ShopsListBack findShops(int city_id, int deal_id);

	ShopListBack search(ShopDto dto);
}
