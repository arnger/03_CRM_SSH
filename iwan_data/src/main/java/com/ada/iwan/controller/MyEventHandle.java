package com.ada.iwan.controller;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.TextMsg;
import com.github.sd4324530.fastweixin.message.req.LocationEvent;

public class MyEventHandle implements EventHandle<LocationEvent> {

	@Override
	public BaseMsg handle(LocationEvent event) {
		// TODO Auto-generated method stub
         return new TextMsg("服务器回复用户消息!");
	}

	@Override
	public boolean beforeHandle(LocationEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

}
