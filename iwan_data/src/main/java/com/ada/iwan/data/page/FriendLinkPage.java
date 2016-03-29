package com.ada.iwan.data.page;

import com.ada.data.core.Pagination;
import com.ada.data.dto.PageRpc;
import com.ada.iwan.data.entity.FriendLink;
public class FriendLinkPage extends PageRpc<FriendLink> {

	public FriendLinkPage(Pagination<FriendLink> page) {
		super(page);
	}

}
