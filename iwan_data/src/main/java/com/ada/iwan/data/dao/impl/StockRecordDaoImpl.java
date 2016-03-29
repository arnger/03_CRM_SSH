package com.ada.iwan.data.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ada.data.core.CriteriaDaoImpl;
import com.ada.data.core.Pagination;
import com.ada.iwan.data.dao.StockRecordDao;
import com.ada.iwan.data.entity.StockRecord;

@Repository
public class StockRecordDaoImpl extends CriteriaDaoImpl<StockRecord, Long> implements StockRecordDao {
	public Pagination getPage(int pageNo, int pageSize) {
		Criteria crit = createCriteria();
		Pagination page = findByCriteria(crit, pageNo, pageSize);
		return page;
	}

	public StockRecord findById(Long id) {
		StockRecord entity = get(id);
		return entity;
	}

	public StockRecord save(StockRecord bean) {
		getSession().save(bean);
		return bean;
	}

	public StockRecord deleteById(Long id) {
		StockRecord entity = super.get(id);
		if (entity != null) {
			getSession().delete(entity);
		}
		return entity;
	}
	
	@Override
	protected Class<StockRecord> getEntityClass() {
		return StockRecord.class;
	}
	
	@Autowired
	public void setSuperSessionFactory(SessionFactory sessionFactory){
	    super.setSessionFactory(sessionFactory);
	}
}