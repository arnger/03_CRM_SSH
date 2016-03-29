package com.ada.iwan.servlet;

import org.springframework.context.ApplicationContext;

import com.ada.iwan.apps.ObjectFactory;
import com.openyelp.servlet.RpcServlet;

public class Rpc extends RpcServlet {

	@Override
	public ApplicationContext getApplicationContext() {
		// TODO Auto-generated method stub
		return ObjectFactory.get();
	}

}
