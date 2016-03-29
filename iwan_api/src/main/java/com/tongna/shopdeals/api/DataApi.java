package com.tongna.shopdeals.api;

import com.tongna.shopdeals.domain.DataBack;

public interface DataApi {
	DataBack findData(int city_id,String cat_ids, String subcat_ids, String district_ids, String bizarea_ids,
		String location,String keyword,int radius,int sort,int page,int page_size,int is_reservation_required );
}
