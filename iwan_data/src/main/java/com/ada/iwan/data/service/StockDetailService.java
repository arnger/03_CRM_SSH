package com.ada.iwan.data.service;

import com.ada.iwan.data.entity.StockDetail;
import com.ada.iwan.data.page.StockDetailPage;
import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import java.util.List;

import com.openyelp.annotation.RestFul;

@RestFul(api = StockDetailService.class, value = "StockDetailService")
public interface StockDetailService {

	public StockDetail findById(Long id);

	public StockDetail findByCode(String code);

	public StockDetail save(StockDetail bean);

	public StockDetail update(StockDetail bean);

	public StockDetail deleteById(Long id);

	public StockDetail[] deleteByIds(Long[] ids);

	public StockDetailPage getPage(int pageNo, int pageSize);

	public Page<StockDetail> findPage(Pageable pageable);

	public long count(Filter... filters);

	public List<StockDetail> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders);

}