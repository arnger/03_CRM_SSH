package com.ada.iwan.data.dao;


import  com.ada.data.core.CriteriaDao;
import  com.ada.data.core.Updater;
import com.ada.data.core.Pagination;
import  com.ada.iwan.data.entity.StockNote;

public interface StockNoteDao extends CriteriaDao<StockNote, Long>{
	public Pagination getPage(int pageNo, int pageSize);

	public StockNote findById(Long id);

	public StockNote save(StockNote bean);

	public StockNote updateByUpdater(Updater<StockNote> updater);

	public StockNote deleteById(Long id);
}