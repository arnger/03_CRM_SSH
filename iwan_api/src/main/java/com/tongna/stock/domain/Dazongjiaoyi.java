package com.tongna.stock.domain;
/**
 * 
 * 大宗交易
 * @author dell1
 *
 */
public class Dazongjiaoyi {
	/**
	 * 	"trade_date":		交易日期
		"stockcode":		股票代码
		"stockname":		股票名称
		"price"				成交价格(元)
		"buyervol":			成交量(万股)
		"buyerapply":		成交金额(万元)
		"buyerdepartment":	买方营业部
		"sellerdepartment":	卖方营业部
		"stocktype":		证券类型
	 * 
	 */
	
	private String trade_date;
	private String stockcode;
	private String stockname;
	private float price;
	private float buyervol;
	private float buyerapply;
	private String buyerdepartment;
	private String sellerdepartment;
	private String tocktype;
	public String getTrade_date() {
		return trade_date;
	}
	public void setTrade_date(String trade_date) {
		this.trade_date = trade_date;
	}
	public String getStockcode() {
		return stockcode;
	}
	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getBuyervol() {
		return buyervol;
	}
	public void setBuyervol(float buyervol) {
		this.buyervol = buyervol;
	}
	public float getBuyerapply() {
		return buyerapply;
	}
	public void setBuyerapply(float buyerapply) {
		this.buyerapply = buyerapply;
	}
	public String getBuyerdepartment() {
		return buyerdepartment;
	}
	public void setBuyerdepartment(String buyerdepartment) {
		this.buyerdepartment = buyerdepartment;
	}
	public String getSellerdepartment() {
		return sellerdepartment;
	}
	public void setSellerdepartment(String sellerdepartment) {
		this.sellerdepartment = sellerdepartment;
	}
	public String getTocktype() {
		return tocktype;
	}
	public void setTocktype(String tocktype) {
		this.tocktype = tocktype;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(buyerapply);
		result = prime * result + ((buyerdepartment == null) ? 0 : buyerdepartment.hashCode());
		result = prime * result + Float.floatToIntBits(buyervol);
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((sellerdepartment == null) ? 0 : sellerdepartment.hashCode());
		result = prime * result + ((stockcode == null) ? 0 : stockcode.hashCode());
		result = prime * result + ((stockname == null) ? 0 : stockname.hashCode());
		result = prime * result + ((tocktype == null) ? 0 : tocktype.hashCode());
		result = prime * result + ((trade_date == null) ? 0 : trade_date.hashCode());
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
		Dazongjiaoyi other = (Dazongjiaoyi) obj;
		if (Float.floatToIntBits(buyerapply) != Float.floatToIntBits(other.buyerapply))
			return false;
		if (buyerdepartment == null) {
			if (other.buyerdepartment != null)
				return false;
		} else if (!buyerdepartment.equals(other.buyerdepartment))
			return false;
		if (Float.floatToIntBits(buyervol) != Float.floatToIntBits(other.buyervol))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (sellerdepartment == null) {
			if (other.sellerdepartment != null)
				return false;
		} else if (!sellerdepartment.equals(other.sellerdepartment))
			return false;
		if (stockcode == null) {
			if (other.stockcode != null)
				return false;
		} else if (!stockcode.equals(other.stockcode))
			return false;
		if (stockname == null) {
			if (other.stockname != null)
				return false;
		} else if (!stockname.equals(other.stockname))
			return false;
		if (tocktype == null) {
			if (other.tocktype != null)
				return false;
		} else if (!tocktype.equals(other.tocktype))
			return false;
		if (trade_date == null) {
			if (other.trade_date != null)
				return false;
		} else if (!trade_date.equals(other.trade_date))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dazongjiaoyi [trade_date=" + trade_date + ", stockcode=" + stockcode + ", stockname=" + stockname
				+ ", price=" + price + ", buyervol=" + buyervol + ", buyerapply=" + buyerapply + ", buyerdepartment="
				+ buyerdepartment + ", sellerdepartment=" + sellerdepartment + ", tocktype=" + tocktype + "]";
	}
	
	
}