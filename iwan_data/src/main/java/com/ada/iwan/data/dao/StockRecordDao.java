package com.ada.iwan.data.dao;


import  com.ada.data.core.CriteriaDao;
import  com.ada.data.core.Updater;
import com.ada.data.core.Pagination;
import  com.ada.iwan.data.entity.StockRecord;

public interface StockRecordDao extends CriteriaDao<StockRecord, Long>{
	public Pagination getPage(int pageNo, int pageSize);

	public StockRecord findById(Long id);

	public StockRecord save(StockRecord bean);

	public StockRecord updateByUpdater(Updater<StockRecord> updater);

	public StockRecord deleteById(Long id);
}