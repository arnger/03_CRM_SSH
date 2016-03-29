package com.tongna.stock.domain;
/**
 * 每日复权行情基类
 * @author dell1
 *
 */
public class Gethdata {
	/**
	 * 	"code":				股票代码
		"trade_date":		日期
		"open":				开盘价
		"high":				最高价
		"close":			收盘价
		"low":				最低价
		"volume":			成交量
		"amount":			成交金额
	 * 
	 */
	
	private String code;
	private String trade_date;
	private float open;
	private float high;
	private float close;
	private float low;
	private float volume;
	private float amount;
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
	public float getOpen() {
		return open;
	}
	public void setOpen(float open) {
		this.open = open;
	}
	public float getHigh() {
		return high;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	public float getClose() {
		return close;
	}
	public void setClose(float close) {
		this.close = close;
	}
	public float getLow() {
		return low;
	}
	public void setLow(float low) {
		this.low = low;
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + Float.floatToIntBits(close);
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + Float.floatToIntBits(high);
		result = prime * result + Float.floatToIntBits(low);
		result = prime * result + Float.floatToIntBits(open);
		result = prime * result + ((trade_date == null) ? 0 : trade_date.hashCode());
		result = prime * result + Float.floatToIntBits(volume);
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
		Gethdata other = (Gethdata) obj;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (Float.floatToIntBits(close) != Float.floatToIntBits(other.close))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (Float.floatToIntBits(high) != Float.floatToIntBits(other.high))
			return false;
		if (Float.floatToIntBits(low) != Float.floatToIntBits(other.low))
			return false;
		if (Float.floatToIntBits(open) != Float.floatToIntBits(other.open))
			return false;
		if (trade_date == null) {
			if (other.trade_date != null)
				return false;
		} else if (!trade_date.equals(other.trade_date))
			return false;
		if (Float.floatToIntBits(volume) != Float.floatToIntBits(other.volume))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Gethdata [code=" + code + ", trade_date=" + trade_date + ", open=" + open + ", high=" + high
				+ ", close=" + close + ", low=" + low + ", volume=" + volume + ", amount=" + amount + "]";
	} 
}
