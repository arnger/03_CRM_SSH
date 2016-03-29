package com.tongna.stock.domain;
/**
 * 每日 非复权行情基类
 * @author dell1
 *
 */
public class HistDate {
	/**
	 * 	"code":				股票代码
		"open":				开盘价
		"high":				最高价
		"close":			收盘价
		"low":				最低价
		"volume":			成交量
		"price_change":		价格变动
		"p_change":			涨跌幅
		"ma5":				5日均价
		"ma10":				10日均价
		"ma20":				20日均价
		"v_ma5":			5日均量
		"v_ma10":			10日均量
		"v_ma20":			20日均量
		"turnover":			换手率
		"trade_date":		日期
	 */
	
	private String code;
	private float open;
	private float high;
	private float close;
	private float low;
	private float volume;
	private float price_change;
	private float p_change;
	private float ma5;
	private float ma10;
	private float ma20;
	private float v_ma5;
	private float v_ma10;
	private float v_ma20;
	private float turnover;
	private String trade_date;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public float getPrice_change() {
		return price_change;
	}
	public void setPrice_change(float price_change) {
		this.price_change = price_change;
	}
	public float getP_change() {
		return p_change;
	}
	public void setP_change(float p_change) {
		this.p_change = p_change;
	}
	public float getMa5() {
		return ma5;
	}
	public void setMa5(float ma5) {
		this.ma5 = ma5;
	}
	public float getMa10() {
		return ma10;
	}
	public void setMa10(float ma10) {
		this.ma10 = ma10;
	}
	public float getMa20() {
		return ma20;
	}
	public void setMa20(float ma20) {
		this.ma20 = ma20;
	}
	public float getV_ma5() {
		return v_ma5;
	}
	public void setV_ma5(float v_ma5) {
		this.v_ma5 = v_ma5;
	}
	public float getV_ma10() {
		return v_ma10;
	}
	public void setV_ma10(float v_ma10) {
		this.v_ma10 = v_ma10;
	}
	public float getV_ma20() {
		return v_ma20;
	}
	public void setV_ma20(float v_ma20) {
		this.v_ma20 = v_ma20;
	}
	public float getTurnover() {
		return turnover;
	}
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	public String getTrade_date() {
		return trade_date;
	}
	public void setTrade_date(String trade_date) {
		this.trade_date = trade_date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(close);
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + Float.floatToIntBits(high);
		result = prime * result + Float.floatToIntBits(low);
		result = prime * result + Float.floatToIntBits(ma10);
		result = prime * result + Float.floatToIntBits(ma20);
		result = prime * result + Float.floatToIntBits(ma5);
		result = prime * result + Float.floatToIntBits(open);
		result = prime * result + Float.floatToIntBits(p_change);
		result = prime * result + Float.floatToIntBits(price_change);
		result = prime * result + ((trade_date == null) ? 0 : trade_date.hashCode());
		result = prime * result + Float.floatToIntBits(turnover);
		result = prime * result + Float.floatToIntBits(v_ma10);
		result = prime * result + Float.floatToIntBits(v_ma20);
		result = prime * result + Float.floatToIntBits(v_ma5);
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
		HistDate other = (HistDate) obj;
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
		if (Float.floatToIntBits(ma10) != Float.floatToIntBits(other.ma10))
			return false;
		if (Float.floatToIntBits(ma20) != Float.floatToIntBits(other.ma20))
			return false;
		if (Float.floatToIntBits(ma5) != Float.floatToIntBits(other.ma5))
			return false;
		if (Float.floatToIntBits(open) != Float.floatToIntBits(other.open))
			return false;
		if (Float.floatToIntBits(p_change) != Float.floatToIntBits(other.p_change))
			return false;
		if (Float.floatToIntBits(price_change) != Float.floatToIntBits(other.price_change))
			return false;
		if (trade_date == null) {
			if (other.trade_date != null)
				return false;
		} else if (!trade_date.equals(other.trade_date))
			return false;
		if (Float.floatToIntBits(turnover) != Float.floatToIntBits(other.turnover))
			return false;
		if (Float.floatToIntBits(v_ma10) != Float.floatToIntBits(other.v_ma10))
			return false;
		if (Float.floatToIntBits(v_ma20) != Float.floatToIntBits(other.v_ma20))
			return false;
		if (Float.floatToIntBits(v_ma5) != Float.floatToIntBits(other.v_ma5))
			return false;
		if (Float.floatToIntBits(volume) != Float.floatToIntBits(other.volume))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HistDate [code=" + code + ", open=" + open + ", high=" + high + ", close=" + close + ", low=" + low
				+ ", volume=" + volume + ", price_change=" + price_change + ", p_change=" + p_change + ", ma5=" + ma5
				+ ", ma10=" + ma10 + ", ma20=" + ma20 + ", v_ma5=" + v_ma5 + ", v_ma10=" + v_ma10 + ", v_ma20=" + v_ma20
				+ ", turnover=" + turnover + ", trade_date=" + trade_date + "]";
	}
	
}
