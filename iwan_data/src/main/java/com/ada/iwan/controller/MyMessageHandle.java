package com.ada.iwan.controller;

import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.TextMsg;
import com.github.sd4324530.fastweixin.message.req.TextReqMsg;

public class MyMessageHandle implements MessageHandle<TextReqMsg> {

	@Override
	public BaseMsg handle(TextReqMsg message) {
		// TODO Auto-generated method stub
         return new TextMsg("服务器回复用户消息!");
	}

	@Override
	public boolean beforeHandle(TextReqMsg message) {
		// TODO Auto-generated method stub
		return false;
	}

}
