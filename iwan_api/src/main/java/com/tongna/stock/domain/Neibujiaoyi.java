package com.tongna.stock.domain;
/**
 * 内部交易信息基类
 * @author dell1
 *
 */
public class Neibujiaoyi {
	/**
	 * 
	 * 	"trade_date":		交易日期
		"stockcode":		股票代码
		"stockname":		股票名称
		"changekind":		变动类型
		"changenum":		变动股数
		"price":			成交均价(元)
		"changeprice":		变动金额(万元)
		"hldnum":			变动后持股数
		"reasons":			变动原因
		"hldkind":			持股种类
		"relationship":		与董监高关系
		"position":			董监高职务
		"changer":			变动人
	 */
	
	private String trade_date;
	private String stockcode;
	private String stockname;
	private String changekind;
	private String changenum;
	private float price;
	private float changeprice;
	private String hldnum;
	private String reasons;
	private String hldkind;
	private String relationship;
	private String position;
	private String changer;
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
	public String getChangekind() {
		return changekind;
	}
	public void setChangekind(String changekind) {
		this.changekind = changekind;
	}
	public String getChangenum() {
		return changenum;
	}
	public void setChangenum(String changenum) {
		this.changenum = changenum;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getChangeprice() {
		return changeprice;
	}
	public void setChangeprice(float changeprice) {
		this.changeprice = changeprice;
	}
	public String getHldnum() {
		return hldnum;
	}
	public void setHldnum(String hldnum) {
		this.hldnum = hldnum;
	}
	public String getReasons() {
		return reasons;
	}
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}
	public String getHldkind() {
		return hldkind;
	}
	public void setHldkind(String hldkind) {
		this.hldkind = hldkind;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getChanger() {
		return changer;
	}
	public void setChanger(String changer) {
		this.changer = changer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((changekind == null) ? 0 : changekind.hashCode());
		result = prime * result + ((changenum == null) ? 0 : changenum.hashCode());
		result = prime * result + Float.floatToIntBits(changeprice);
		result = prime * result + ((changer == null) ? 0 : changer.hashCode());
		result = prime * result + ((hldkind == null) ? 0 : hldkind.hashCode());
		result = prime * result + ((hldnum == null) ? 0 : hldnum.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((reasons == null) ? 0 : reasons.hashCode());
		result = prime * result + ((relationship == null) ? 0 : relationship.hashCode());
		result = prime * result + ((stockcode == null) ? 0 : stockcode.hashCode());
		result = prime * result + ((stockname == null) ? 0 : stockname.hashCode());
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
		Neibujiaoyi other = (Neibujiaoyi) obj;
		if (changekind == null) {
			if (other.changekind != null)
				return false;
		} else if (!changekind.equals(other.changekind))
			return false;
		if (changenum == null) {
			if (other.changenum != null)
				return false;
		} else if (!changenum.equals(other.changenum))
			return false;
		if (Float.floatToIntBits(changeprice) != Float.floatToIntBits(other.changeprice))
			return false;
		if (changer == null) {
			if (other.changer != null)
				return false;
		} else if (!changer.equals(other.changer))
			return false;
		if (hldkind == null) {
			if (other.hldkind != null)
				return false;
		} else if (!hldkind.equals(other.hldkind))
			return false;
		if (hldnum == null) {
			if (other.hldnum != null)
				return false;
		} else if (!hldnum.equals(other.hldnum))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (reasons == null) {
			if (other.reasons != null)
				return false;
		} else if (!reasons.equals(other.reasons))
			return false;
		if (relationship == null) {
			if (other.relationship != null)
				return false;
		} else if (!relationship.equals(other.relationship))
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
		if (trade_date == null) {
			if (other.trade_date != null)
				return false;
		} else if (!trade_date.equals(other.trade_date))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Neibujiaoyi [trade_date=" + trade_date + ", stockcode=" + stockcode + ", stockname=" + stockname
				+ ", changekind=" + changekind + ", changenum=" + changenum + ", price=" + price + ", changeprice="
				+ changeprice + ", hldnum=" + hldnum + ", reasons=" + reasons + ", hldkind=" + hldkind
				+ ", relationship=" + relationship + ", position=" + position + ", changer=" + changer + "]";
	}
	
}
