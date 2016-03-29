package com.ada.iwan.data.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ada.data.core.Finder;
import com.ada.data.core.Pagination;
import com.ada.data.core.Updater;
import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import com.ada.iwan.data.dao.StockDao;
import com.ada.iwan.data.dao.StockDayDao;
import com.ada.iwan.data.dao.StockDetailDao;
import com.ada.iwan.data.entity.Stock;
import com.ada.iwan.data.entity.StockDay;
import com.ada.iwan.data.entity.StockDetail;
import com.ada.iwan.data.page.StockDetailPage;
import com.ada.iwan.data.service.StockDetailService;

@Service
@Transactional
public class StockDetailServiceImpl implements StockDetailService {

	@Autowired
	private StockDao stockDao;

	@Autowired
	private StockDayDao stockDayDao;

	@Transactional(readOnly = true)
	public StockDetail findById(Long id) {
		StockDetail entity = dao.findById(id);
		return entity;
	}

	@Transactional
	public StockDetail save(StockDetail bean) {

		Finder finder = Finder.create();
		finder.append("from StockDetail s where s.code =:code");
		finder.setParam("code", bean.getCode());
		finder.append(" and s.date =:date");
		finder.setParam("date", bean.getDate());
		finder.append(" and s.time =:time");
		finder.setParam("time", bean.getTime());
		List<StockDetail> ss = dao.find(finder);
		if (ss != null && ss.size() > 0) {
			ss.get(0).setStock(bean.getStock());
		} else {
			dao.save(bean);
		}
		if (bean.getStock() != null) {
			Stock stock = stockDao.findById(bean.getStock().getId());
			if (stock != null) {
				stock.setPrice(new BigDecimal(bean.getCurrentPrice()));
			}
		}
		StockDay day = stockDayDao.findByCode(bean.getCode(), bean.getDate());
		if (day==null) {
			day=new StockDay();
			BeanUtils.copyProperties(bean, day,"id");
			stockDayDao.save(day);
		}else{
			BeanUtils.copyProperties(bean, day, "id");
		}
		return bean;
	}

	@Transactional
	public StockDetail update(StockDetail bean) {
		Updater<StockDetail> updater = new Updater<StockDetail>(bean);
		bean = dao.updateByUpdater(updater);
		return bean;
	}

	@Transactional
	public StockDetail deleteById(Long id) {
		StockDetail bean = dao.deleteById(id);
		return bean;
	}

	@Transactional
	public StockDetail[] deleteByIds(Long[] ids) {
		StockDetail[] beans = new StockDetail[ids.length];
		for (int i = 0, len = ids.length; i < len; i++) {
			beans[i] = deleteById(ids[i]);
		}
		return beans;
	}

	private StockDetailDao dao;

	@Autowired
	public void setDao(StockDetailDao dao) {
		this.dao = dao;
	}

	@Transactional(readOnly = true)
	public StockDetailPage getPage(int pageNo, int pageSize) {
		StockDetailPage result = null;
		Finder finder = Finder.create();
		finder.append("from StockDetail f ");
		finder.append(" order by f.id desc  ");
		Pagination<StockDetail> page = dao.find(finder, pageNo, pageSize);
		result = new StockDetailPage(page);
		return result;
	}

	@Transactional(readOnly = true)
	public Page<StockDetail> findPage(Pageable pageable) {
		return dao.findPage(pageable);
	}

	@Transactional(readOnly = true)
	public long count(Filter... filters) {

		return dao.count(filters);

	}

	@Transactional(readOnly = true)
	public List<StockDetail> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders) {

		return dao.findList(first, count, filters, orders);

	}

	@Transactional(readOnly = true)
	public StockDetail findByCode(String code) {
		Finder finder = Finder.create();
		finder.append("from StockDetail s where s.code =:code");
		finder.setParam("code", code);
		List<StockDetail> ss = dao.find(finder);

		if (ss != null && ss.size() > 0) {
			return ss.get(0);
		} else {
			return null;
		}
	}
}