package com.tongna.stock.domain;
/**
 * 席位异动信息基类
 * @author dell1
 *
 */
public class Xiweiyidong {
	/**
	 *  "code":				股票代码
		"stockname":		股票名称
		"trade_date":		日期
		"seatname":			交易所
		"buy_amut":			买入总量
		"sell_amut":		卖出总量
		"info_type":		异动类型
		"type":				交易类型  B 买入/S 卖出
	 * 
	 */
	
	private String code;
	private String stockname;
	private String trade_date;
	private String seatname;
	private float buy_amut;
	private float sell_amut;
	private String info_type;
	private String type;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public String getTrade_date() {
		return trade_date;
	}
	public void setTrade_date(String trade_date) {
		this.trade_date = trade_date;
	}
	public String getSeatname() {
		return seatname;
	}
	public void setSeatname(String seatname) {
		this.seatname = seatname;
	}
	public float getBuy_amut() {
		return buy_amut;
	}
	public void setBuy_amut(float buy_amut) {
		this.buy_amut = buy_amut;
	}
	public float getSell_amut() {
		return sell_amut;
	}
	public void setSell_amut(float sell_amut) {
		this.sell_amut = sell_amut;
	}
	public String getInfo_type() {
		return info_type;
	}
	public void setInfo_type(String info_type) {
		this.info_type = info_type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(buy_amut);
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((info_type == null) ? 0 : info_type.hashCode());
		result = prime * result + ((seatname == null) ? 0 : seatname.hashCode());
		result = prime * result + Float.floatToIntBits(sell_amut);
		result = prime * result + ((stockname == null) ? 0 : stockname.hashCode());
		result = prime * result + ((trade_date == null) ? 0 : trade_date.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Xiweiyidong other = (Xiweiyidong) obj;
		if (Float.floatToIntBits(buy_amut) != Float.floatToIntBits(other.buy_amut))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (info_type == null) {
			if (other.info_type != null)
				return false;
		} else if (!info_type.equals(other.info_type))
			return false;
		if (seatname == null) {
			if (other.seatname != null)
				return false;
		} else if (!seatname.equals(other.seatname))
			return false;
		if (Float.floatToIntBits(sell_amut) != Float.floatToIntBits(other.sell_amut))
			return false;
		if (stockname == null) {
			if (other.stockname != null)
				return false;
		} else if (!stockname.equals(other.stockname))
			return false;
		if (trade_date == null) {
			if (other.trade_date != null)
				return false;
		} else if (!trade_date.equals(other.trade_date))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;	
	}
	@Override
	public String toString() {
		return "Xiweiyidong [code=" + code + ", stockname=" + stockname + ", trade_date=" + trade_date + ", seatname="
				+ seatname + ", buy_amut=" + buy_amut + ", sell_amut=" + sell_amut + ", info_type=" + info_type
				+ ", type=" + type + "]";
	}
	
}
