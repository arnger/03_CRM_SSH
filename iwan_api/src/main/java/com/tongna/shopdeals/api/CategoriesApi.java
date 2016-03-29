package com.tongna.shopdeals.api;

import com.tongna.shopdeals.domain.CategoriesListBack;

public interface CategoriesApi {
	/**
	 * 查询所有团单分类信息
	 * @return
	 */
	CategoriesListBack findCategoriesApi();
}
