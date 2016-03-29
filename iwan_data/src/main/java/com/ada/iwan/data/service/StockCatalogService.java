package com.ada.iwan.data.service;

import com.ada.iwan.data.entity.StockCatalog;
import com.ada.iwan.data.page.StockCatalogPage;
import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import java.util.List;

import com.openyelp.annotation.RestFul;

@RestFul(api=StockCatalogService.class,value="StockCatalogService")
public interface StockCatalogService {

	public StockCatalog findById(Integer id);

	public StockCatalog save(StockCatalog bean);

	public StockCatalog update(StockCatalog bean);

	public StockCatalog deleteById(Integer id);
	
	public StockCatalog[] deleteByIds(Integer[] ids);
	
	public StockCatalogPage getPage(int pageNo, int pageSize);
	
	
	public Page<StockCatalog> findPage(Pageable pageable);

	public long count(Filter... filters);

	public List<StockCatalog> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders);
	
}