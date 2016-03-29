package com.ada.iwan.data.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ada.data.core.CriteriaDaoImpl;
import com.ada.data.core.Finder;
import com.ada.data.core.Pagination;
import com.ada.iwan.data.dao.StockDayDao;
import com.ada.iwan.data.entity.StockDay;

@Repository
public class StockDayDaoImpl extends CriteriaDaoImpl<StockDay, Long> implements StockDayDao {
	public Pagination getPage(int pageNo, int pageSize) {
		Criteria crit = createCriteria();
		Pagination page = findByCriteria(crit, pageNo, pageSize);
		return page;
	}

	public StockDay findById(Long id) {
		StockDay entity = get(id);
		return entity;
	}

	public StockDay save(StockDay bean) {
		getSession().save(bean);
		return bean;
	}

	public StockDay deleteById(Long id) {
		StockDay entity = super.get(id);
		if (entity != null) {
			getSession().delete(entity);
		}
		return entity;
	}
	
	@Override
	protected Class<StockDay> getEntityClass() {
		return StockDay.class;
	}
	
	@Autowired
	public void setSuperSessionFactory(SessionFactory sessionFactory){
	    super.setSessionFactory(sessionFactory);
	}

	public StockDay findByCode(String code,String date) {
		Finder finder=Finder.create();
		finder.append("from StockDay d where d.code =:code");
		finder.setParam("code", code);
		finder.append("  and d.date =:date");
		finder.setParam("date", date);
		StockDay  stock=findOne(finder);
		return stock;
	}
}