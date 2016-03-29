package com.tongna.stock.domain;
/**
 * 龙虎榜信息基类
 * @author dell1
 *
 */
public class Toplist {
	/**
	 * 	"code":				股票代码
		"trade_date":		日期
		"name":				名称
		"pchange":			当日涨跌幅
		"amount":			龙虎榜成交额(万)
		"buy":				买入额(万)
		"bratio":			买入占总成交比例
		"sell":				卖出额(万)
		"sratio":			卖出占总成交比例
		"reason":			上榜原因
	 */
	
	private String code;
	private String trade_date;
	private String name;
	private String pchange;
	private String amount;
	private String buy;
	private String bratio;
	private String sell;
	private String sratio;
	private String reason;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTrade_date() {
		return trade_date;
	}
	public void setTrade_date(String trade_date) {
		this.trade_date = trade_date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPchange() {
		return pchange;
	}
	public void setPchange(String pchange) {
		this.pchange = pchange;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getBuy() {
		return buy;
	}
	public void setBuy(String buy) {
		this.buy = buy;
	}
	public String getBratio() {
		return bratio;
	}
	public void setBratio(String bratio) {
		this.bratio = bratio;
	}
	public String getSell() {
		return sell;
	}
	public void setSell(String sell) {
		this.sell = sell;
	}
	public String getSratio() {
		return sratio;
	}
	public void setSratio(String sratio) {
		this.sratio = sratio;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((bratio == null) ? 0 : bratio.hashCode());
		result = prime * result + ((buy == null) ? 0 : buy.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pchange == null) ? 0 : pchange.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		result = prime * result + ((sell == null) ? 0 : sell.hashCode());
		result = prime * result + ((sratio == null) ? 0 : sratio.hashCode());
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
		Toplist other = (Toplist) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (bratio == null) {
			if (other.bratio != null)
				return false;
		} else if (!bratio.equals(other.bratio))
			return false;
		if (buy == null) {
			if (other.buy != null)
				return false;
		} else if (!buy.equals(other.buy))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pchange == null) {
			if (other.pchange != null)
				return false;
		} else if (!pchange.equals(other.pchange))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		if (sell == null) {
			if (other.sell != null)
				return false;
		} else if (!sell.equals(other.sell))
			return false;
		if (sratio == null) {
			if (other.sratio != null)
				return false;
		} else if (!sratio.equals(other.sratio))
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
		return "Toplist [code=" + code + ", trade_date=" + trade_date + ", name=" + name + ", pchange=" + pchange
				+ ", amount=" + amount + ", buy=" + buy + ", bratio=" + bratio + ", sell=" + sell + ", sratio=" + sratio
				+ ", reason=" + reason + "]";
	}
	
}
