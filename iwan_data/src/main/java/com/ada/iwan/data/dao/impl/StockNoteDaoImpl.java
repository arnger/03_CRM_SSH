package com.ada.iwan.data.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ada.data.core.CriteriaDaoImpl;
import com.ada.data.core.Pagination;
import com.ada.iwan.data.dao.StockNoteDao;
import com.ada.iwan.data.entity.StockNote;

@Repository
public class StockNoteDaoImpl extends CriteriaDaoImpl<StockNote, Long> implements StockNoteDao {
	public Pagination getPage(int pageNo, int pageSize) {
		Criteria crit = createCriteria();
		Pagination page = findByCriteria(crit, pageNo, pageSize);
		return page;
	}

	public StockNote findById(Long id) {
		StockNote entity = get(id);
		return entity;
	}

	public StockNote save(StockNote bean) {
		getSession().save(bean);
		return bean;
	}

	public StockNote deleteById(Long id) {
		StockNote entity = super.get(id);
		if (entity != null) {
			getSession().delete(entity);
		}
		return entity;
	}
	
	@Override
	protected Class<StockNote> getEntityClass() {
		return StockNote.class;
	}
	
	@Autowired
	public void setSuperSessionFactory(SessionFactory sessionFactory){
	    super.setSessionFactory(sessionFactory);
	}
}