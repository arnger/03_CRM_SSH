package com.tongna.stock.api;
import com.tongna.stock.domain.StockListBack;
/**
 * 查询股票列表
 * @author dell1
 *
 */
public interface StockListApi {
	
	
	
	StockListBack findStcokList(int page,int rows);
}
