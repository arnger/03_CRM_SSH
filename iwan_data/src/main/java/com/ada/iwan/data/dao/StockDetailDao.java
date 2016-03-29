package com.ada.iwan.data.dao;


import  com.ada.data.core.CriteriaDao;
import  com.ada.data.core.Updater;
import com.ada.data.core.Pagination;
import  com.ada.iwan.data.entity.StockDetail;

public interface StockDetailDao extends CriteriaDao<StockDetail, Long>{
	public Pagination getPage(int pageNo, int pageSize);

	public StockDetail findById(Long id);

	public StockDetail save(StockDetail bean);

	public StockDetail updateByUpdater(Updater<StockDetail> updater);

	public StockDetail deleteById(Long id);
}