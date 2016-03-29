package com.ada.iwan.data.dao;


import  com.ada.data.core.CriteriaDao;
import  com.ada.data.core.Updater;
import com.ada.data.core.Pagination;
import  com.ada.iwan.data.entity.FriendLink;

public interface FriendLinkDao extends CriteriaDao<FriendLink, Long>{
	public Pagination getPage(int pageNo, int pageSize);

	public FriendLink findById(Long id);

	public FriendLink save(FriendLink bean);

	public FriendLink updateByUpdater(Updater<FriendLink> updater);

	public FriendLink deleteById(Long id);
}