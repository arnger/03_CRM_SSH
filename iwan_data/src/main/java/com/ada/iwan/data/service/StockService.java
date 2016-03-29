package com.ada.iwan.data.service;

import com.ada.iwan.data.entity.Stock;
import com.ada.iwan.data.page.StockPage;
import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import java.util.List;

import com.openyelp.annotation.RestFul;

@RestFul(api = StockService.class, value = "StockService")
public interface StockService {

	public Stock findById(Long id);

	public Stock findByCode(String code);

	public int updates();

	public Stock save(Stock bean);

	public Stock update(Stock bean);

	public Stock deleteById(Long id);

	public Stock[] deleteByIds(Long[] ids);

	public StockPage getPage(int pageNo, int pageSize);

	public Page<Stock> findPage(Pageable pageable);

	public long count(Filter... filters);

	public List<Stock> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders);

}