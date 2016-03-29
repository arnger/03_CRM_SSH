package com.ada.iwan.data.service;

import com.ada.iwan.data.entity.FriendLink;
import com.ada.iwan.data.page.FriendLinkPage;
import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import java.util.List;

import com.openyelp.annotation.RestFul;

@RestFul(api=FriendLinkService.class,value="FriendLinkService")
public interface FriendLinkService {

	public FriendLink findById(Long id);

	public FriendLink save(FriendLink bean);

	public FriendLink update(FriendLink bean);

	public FriendLink deleteById(Long id);
	
	public FriendLink[] deleteByIds(Long[] ids);
	
	public FriendLinkPage getPage(int pageNo, int pageSize);
	
	
	public Page<FriendLink> findPage(Pageable pageable);

	public long count(Filter... filters);

	public List<FriendLink> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders);
	
}