package com.ada.iwan.data.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ada.data.core.CriteriaDaoImpl;
import com.ada.data.core.Pagination;
import com.ada.iwan.data.dao.StockDetailDao;
import com.ada.iwan.data.entity.StockDetail;

@Repository
public class StockDetailDaoImpl extends CriteriaDaoImpl<StockDetail, Long> implements StockDetailDao {
	public Pagination getPage(int pageNo, int pageSize) {
		Criteria crit = createCriteria();
		Pagination page = findByCriteria(crit, pageNo, pageSize);
		return page;
	}

	public StockDetail findById(Long id) {
		StockDetail entity = get(id);
		return entity;
	}

	public StockDetail save(StockDetail bean) {
		getSession().save(bean);
		return bean;
	}

	public StockDetail deleteById(Long id) {
		StockDetail entity = super.get(id);
		if (entity != null) {
			getSession().delete(entity);
		}
		return entity;
	}
	
	@Override
	protected Class<StockDetail> getEntityClass() {
		return StockDetail.class;
	}
	
	@Autowired
	public void setSuperSessionFactory(SessionFactory sessionFactory){
	    super.setSessionFactory(sessionFactory);
	}
}