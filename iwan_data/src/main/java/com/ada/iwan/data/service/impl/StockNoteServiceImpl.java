package com.ada.iwan.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ada.data.core.Finder;
import com.ada.data.core.Pagination;
import com.ada.data.core.Updater;
import com.ada.iwan.data.dao.StockNoteDao;
import com.ada.iwan.data.entity.StockNote;
import com.ada.iwan.data.service.StockNoteService;
import com.ada.iwan.data.page.StockNotePage;

import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import java.util.List;


@Service
@Transactional
public class StockNoteServiceImpl implements StockNoteService {
	

	@Transactional(readOnly = true)
	public StockNote findById(Long id) {
		StockNote entity = dao.findById(id);
		return entity;
	}

    @Transactional
	public StockNote save(StockNote bean) {
		dao.save(bean);
		return bean;
	}

    @Transactional
	public StockNote update(StockNote bean) {
		Updater<StockNote> updater = new Updater<StockNote>(bean);
		bean = dao.updateByUpdater(updater);
		return bean;
	}

    @Transactional
	public StockNote deleteById(Long id) {
		StockNote bean = dao.deleteById(id);
		return bean;
	}

    @Transactional	
	public StockNote[] deleteByIds(Long[] ids) {
		StockNote[] beans = new StockNote[ids.length];
		for (int i = 0,len = ids.length; i < len; i++) {
			beans[i] = deleteById(ids[i]);
		}
		return beans;
	}

	private StockNoteDao dao;

	@Autowired
	public void setDao(StockNoteDao dao) {
		this.dao = dao;
	}
	
	@Transactional(readOnly = true)
	public StockNotePage getPage(int pageNo, int pageSize) {
	    StockNotePage result = null;
		Finder finder=Finder.create();
		finder.append("from StockNote f ");
		finder.append(" order by f.id desc  ");
		Pagination<StockNote> page = dao.find(finder,pageNo, pageSize);
		result = new StockNotePage(page);
		return result;
	}
	
	
	@Transactional(readOnly = true)
	public Page<StockNote> findPage(Pageable pageable){
	     return dao.findPage(pageable);
	}

	@Transactional(readOnly = true)
	public long count(Filter... filters){
	     
	     return dao.count(filters);
	     
	}

	@Transactional(readOnly = true)
	public List<StockNote> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders){
	
		     return dao.findList(first,count,filters,orders);
	
	}
}