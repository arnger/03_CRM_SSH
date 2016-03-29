package com.ada.iwan.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ada.admin.entity.Menu;
import com.ada.data.core.Finder;
import com.ada.data.core.Pagination;
import com.ada.data.core.Updater;
import com.ada.iwan.data.dao.StockCatalogDao;
import com.ada.iwan.data.entity.StockCatalog;
import com.ada.iwan.data.service.StockCatalogService;
import com.ada.iwan.data.page.StockCatalogPage;

import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import java.util.List;


@Service
@Transactional
public class StockCatalogServiceImpl implements StockCatalogService {
	

	@Transactional(readOnly = true)
	public StockCatalog findById(Integer id) {
		StockCatalog entity = dao.findById(id);
		return entity;
	}

    @Transactional
	public StockCatalog save(StockCatalog bean) {
		dao.save(bean);
		
		if (bean.getParentId() != null) {
			StockCatalog parent = dao.findById(bean.getParentId());
			if (parent != null) {
				if (parent.getLevelinfo() != null) {
					bean.setLevelinfo(parent.getLevelinfo() + 1);
				} else {
					bean.setLevelinfo(2);
				}
				if (parent.getIds()!=null) {
					bean.setIds(parent.getIds()+","+bean.getId());

				}else{
					bean.setIds(parent.getId()+","+bean.getId());
				}
				
			} else {
				bean.setLevelinfo(1);
				bean.setIds(""+bean.getId());
			}
		} else {
			bean.setLevelinfo(1);
			bean.setIds(""+bean.getId());
		}
		return bean;
	}

    @Transactional
	public StockCatalog update(StockCatalog bean) {
		Updater<StockCatalog> updater = new Updater<StockCatalog>(bean);
		bean = dao.updateByUpdater(updater);
		return bean;
	}

    @Transactional
	public StockCatalog deleteById(Integer id) {
		StockCatalog bean = dao.deleteById(id);
		return bean;
	}

    @Transactional	
	public StockCatalog[] deleteByIds(Integer[] ids) {
		StockCatalog[] beans = new StockCatalog[ids.length];
		for (int i = 0,len = ids.length; i < len; i++) {
			beans[i] = deleteById(ids[i]);
		}
		return beans;
	}

	private StockCatalogDao dao;

	@Autowired
	public void setDao(StockCatalogDao dao) {
		this.dao = dao;
	}
	
	@Transactional(readOnly = true)
	public StockCatalogPage getPage(int pageNo, int pageSize) {
	    StockCatalogPage result = null;
		Finder finder=Finder.create();
		finder.append("from StockCatalog f ");
		finder.append(" order by f.id desc  ");
		Pagination<StockCatalog> page = dao.find(finder,pageNo, pageSize);
		result = new StockCatalogPage(page);
		return result;
	}
	
	
	@Transactional(readOnly = true)
	public Page<StockCatalog> findPage(Pageable pageable){
	     return dao.findPage(pageable);
	}

	@Transactional(readOnly = true)
	public long count(Filter... filters){
	     
	     return dao.count(filters);
	     
	}

	@Transactional(readOnly = true)
	public List<StockCatalog> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders){
	
		     return dao.findList(first,count,filters,orders);
	
	}
}