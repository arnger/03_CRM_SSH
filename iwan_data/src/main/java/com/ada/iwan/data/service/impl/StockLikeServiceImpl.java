package com.ada.iwan.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ada.data.core.Finder;
import com.ada.data.core.Pagination;
import com.ada.data.core.Updater;
import com.ada.iwan.data.dao.StockLikeDao;
import com.ada.iwan.data.entity.StockLike;
import com.ada.iwan.data.service.StockLikeService;
import com.ada.iwan.data.page.StockLikePage;

import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import java.util.List;


@Service
@Transactional
public class StockLikeServiceImpl implements StockLikeService {
	

	@Transactional(readOnly = true)
	public StockLike findById(Long id) {
		StockLike entity = dao.findById(id);
		return entity;
	}

    @Transactional
	public StockLike save(StockLike bean) {
		dao.save(bean);
		return bean;
	}

    @Transactional
	public StockLike update(StockLike bean) {
		Updater<StockLike> updater = new Updater<StockLike>(bean);
		bean = dao.updateByUpdater(updater);
		return bean;
	}

    @Transactional
	public StockLike deleteById(Long id) {
		StockLike bean = dao.deleteById(id);
		return bean;
	}

    @Transactional	
	public StockLike[] deleteByIds(Long[] ids) {
		StockLike[] beans = new StockLike[ids.length];
		for (int i = 0,len = ids.length; i < len; i++) {
			beans[i] = deleteById(ids[i]);
		}
		return beans;
	}

	private StockLikeDao dao;

	@Autowired
	public void setDao(StockLikeDao dao) {
		this.dao = dao;
	}
	
	@Transactional(readOnly = true)
	public StockLikePage getPage(int pageNo, int pageSize) {
	    StockLikePage result = null;
		Finder finder=Finder.create();
		finder.append("from StockLike f ");
		finder.append(" order by f.id desc  ");
		Pagination<StockLike> page = dao.find(finder,pageNo, pageSize);
		result = new StockLikePage(page);
		return result;
	}
	
	
	@Transactional(readOnly = true)
	public Page<StockLike> findPage(Pageable pageable){
	     return dao.findPage(pageable);
	}

	@Transactional(readOnly = true)
	public long count(Filter... filters){
	     
	     return dao.count(filters);
	     
	}

	@Transactional(readOnly = true)
	public List<StockLike> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders){
	
		     return dao.findList(first,count,filters,orders);
	
	}
}