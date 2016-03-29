package org.iwan.app;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.ada.iwan.apps.ObjectFactory;
import com.ada.iwan.data.entity.Stock;
import com.ada.iwan.data.entity.StockDetail;
import com.ada.iwan.data.page.StockPage;
import com.ada.iwan.data.service.StockDetailService;
import com.ada.iwan.data.service.StockService;
import com.ada.iwan.service.stock.api.StockApi;
import com.ada.iwan.service.stock.api.impl.StockListApiImpl;
import com.ada.iwan.service.stock.domain.StockDetailBack;

public class StockDetailApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updates();
	}

	private static void xx() {
		while (true) {
			try {
				updates(1939l);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void updates(long id) {
		StockService service = ObjectFactory.get().getBean(StockService.class);

		Stock stock=service.findById(id);
		// TODO Auto-generated method stub
		s2(stock);
	}

	/**
	 * 
	 */
	private static void updates() {
		StockService service = ObjectFactory.get().getBean(StockService.class);
		StockPage page = service.getPage(1, 3000);
		List<Stock> ss = page.getList();
		for (Stock stock : ss) {
			s2(stock);
		}
	}

	/**
	 * 
	 */
	private static void s(String code) {
		StockDetailService ser = ObjectFactory.get().getBean(StockDetailService.class);

		StockDetail bean = new StockDetail();

		StockApi api = new StockListApiImpl();
		StockDetailBack back = api.findByCode(code);
		BeanUtils.copyProperties(back, bean);
		ser.save(bean);
	}

	private static void s2(Stock stock) {
		StockDetailService ser = ObjectFactory.get().getBean(StockDetailService.class);

		StockDetail bean = new StockDetail();

		StockApi api = new StockListApiImpl();
		StockDetailBack back = api.findByCode(stock.getCode());
		BeanUtils.copyProperties(back, bean);
		bean.setStock(stock);
		ser.save(bean);
	}
}
