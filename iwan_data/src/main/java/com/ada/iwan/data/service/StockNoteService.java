package com.ada.iwan.data.service;

import com.ada.iwan.data.entity.StockNote;
import com.ada.iwan.data.page.StockNotePage;
import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import java.util.List;

import com.openyelp.annotation.RestFul;

@RestFul(api=StockNoteService.class,value="StockNoteService")
public interface StockNoteService {

	public StockNote findById(Long id);

	public StockNote save(StockNote bean);

	public StockNote update(StockNote bean);

	public StockNote deleteById(Long id);
	
	public StockNote[] deleteByIds(Long[] ids);
	
	public StockNotePage getPage(int pageNo, int pageSize);
	
	
	public Page<StockNote> findPage(Pageable pageable);

	public long count(Filter... filters);

	public List<StockNote> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders);
	
}