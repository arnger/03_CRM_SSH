package com.ada.iwan.data.dao;


import  com.ada.data.core.CriteriaDao;
import  com.ada.data.core.Updater;
import com.ada.data.core.Pagination;
import  com.ada.iwan.data.entity.StockLike;

public interface StockLikeDao extends CriteriaDao<StockLike, Long>{
	public Pagination getPage(int pageNo, int pageSize);

	public StockLike findById(Long id);

	public StockLike save(StockLike bean);

	public StockLike updateByUpdater(Updater<StockLike> updater);

	public StockLike deleteById(Long id);
}