package com.ada.iwan.service.stock.apps;

import org.springframework.beans.BeanUtils;

import com.ada.iwan.apps.ObjectFactory;
import com.ada.iwan.data.entity.StockDetail;
import com.ada.iwan.data.service.StockDetailService;
import com.ada.iwan.service.stock.api.StockApi;
import com.ada.iwan.service.stock.api.impl.StockListApiImpl;
import com.ada.iwan.service.stock.domain.StockDetailBack;

public class StockDetailApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockDetailService ser=ObjectFactory.get().getBean(StockDetailService.class);
		
		StockDetail bean=new StockDetail();
		
		StockApi api = new StockListApiImpl();
		StockDetailBack back = api.findByCode("603268");
         BeanUtils.copyProperties(back, bean);
		ser.save(bean);
	}

}
