package com.ada.iwan.data.dao;

import com.ada.data.core.CriteriaDao;
import com.ada.data.core.Updater;
import com.ada.data.core.Pagination;
import com.ada.iwan.data.entity.StockDay;

public interface StockDayDao extends CriteriaDao<StockDay, Long> {
	public Pagination getPage(int pageNo, int pageSize);

	public StockDay findById(Long id);

	public StockDay findByCode(String code,String date);

	public StockDay save(StockDay bean);

	public StockDay updateByUpdater(Updater<StockDay> updater);

	public StockDay deleteById(Long id);
}