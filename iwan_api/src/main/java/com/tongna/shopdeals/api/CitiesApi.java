package com.tongna.shopdeals.api;

import com.tongna.shopdeals.domain.CitiesListBack;
import com.tongna.shopdeals.domain.DistrictsListBack;

public interface CitiesApi {
	/**
	 * 查找所有city信息
	 * @return
	 */
	CitiesListBack findAll();
	
	
	/**
	 * 通过城市id查找城市所在行政区
	 * @param city_id
	 * @return
	 */
	DistrictsListBack findDistricts(Integer city_id);
}
