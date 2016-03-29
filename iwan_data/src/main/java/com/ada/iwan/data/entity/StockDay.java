package com.ada.iwan.data.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ada.data.entity.AbstractEntity;

@Entity
@Table(name = "stock_day")
public class StockDay extends AbstractEntity {

	@ManyToOne
	private Stock stock;
	private String name;// : "sz002230", //股票代码，SZ指在深圳交易的股票
	private String code;// : "sz002230", //股票代码，SZ指在深圳交易的股票
	private String date;// : "2014-09-22", //当前显示股票信息的日期
	private String time;// : "09:26:11", //具体时间
	private float OpenningPrice;// : 27.34, //今日开盘价
	private float closingPrice;// 27.34, //昨日收盘价
	private float currentPrice;// 27.34, //当前价格
	private float hPrice;// 27.34, //今日最高价
	private float lPrice;// 27.34, //今日最低价
	private float competitivePrice;// 27.30, //买一报价
	private float auctionPrice;// 27.34, //卖一报价
	private float totalNumber;// 47800, //成交的股票数
	private float turnover;// 1306852.00, //成交额，以元为单位
	private float buyOne;// 6100, //买一
	private float buyOnePrice;// 27.30, //买一价格
	private float buyTwo;// 7500, //买二
	private float buyTwoPrice;// 27.29, //买二价格
	private float buyThree;// 2000, //买三
	private float buyThreePrice;// 27.27, //买三价格
	private float buyFour;// 100, //买四
	private float buyFourPrice;// 27.25, //买四价格
	private float buyFive;// 5700, //买五
	private float buyFivePrice;// 27.22, //买五价格
	private float sellOne;// 10150, //卖一
	private float sellOnePrice;// 27.34, //卖一价格
	private float sellTwo;// 15200, //卖二
	private float sellTwoPrice;// 27.35, //卖二价格
	private float sellThree;// 5914, //卖三
	private float sellThreePrice;// 27.36, //卖三价格
	private float sellFour;// 400, //卖四
	private float sellFourPrice;// 27.37, //卖四价格
	private float sellFive;// 3000, //卖五
	private float sellFivePrice;// 27.38 //卖五价格
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public float getOpenningPrice() {
		return OpenningPrice;
	}
	public void setOpenningPrice(float openningPrice) {
		OpenningPrice = openningPrice;
	}
	public float getClosingPrice() {
		return closingPrice;
	}
	public void setClosingPrice(float closingPrice) {
		this.closingPrice = closingPrice;
	}
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}
	public float gethPrice() {
		return hPrice;
	}
	public void sethPrice(float hPrice) {
		this.hPrice = hPrice;
	}
	public float getlPrice() {
		return lPrice;
	}
	public void setlPrice(float lPrice) {
		this.lPrice = lPrice;
	}
	public float getCompetitivePrice() {
		return competitivePrice;
	}
	public void setCompetitivePrice(float competitivePrice) {
		this.competitivePrice = competitivePrice;
	}
	public float getAuctionPrice() {
		return auctionPrice;
	}
	public void setAuctionPrice(float auctionPrice) {
		this.auctionPrice = auctionPrice;
	}
	public float getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(float totalNumber) {
		this.totalNumber = totalNumber;
	}
	public float getTurnover() {
		return turnover;
	}
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	public float getBuyOne() {
		return buyOne;
	}
	public void setBuyOne(float buyOne) {
		this.buyOne = buyOne;
	}
	public float getBuyOnePrice() {
		return buyOnePrice;
	}
	public void setBuyOnePrice(float buyOnePrice) {
		this.buyOnePrice = buyOnePrice;
	}
	public float getBuyTwo() {
		return buyTwo;
	}
	public void setBuyTwo(float buyTwo) {
		this.buyTwo = buyTwo;
	}
	public float getBuyTwoPrice() {
		return buyTwoPrice;
	}
	public void setBuyTwoPrice(float buyTwoPrice) {
		this.buyTwoPrice = buyTwoPrice;
	}
	public float getBuyThree() {
		return buyThree;
	}
	public void setBuyThree(float buyThree) {
		this.buyThree = buyThree;
	}
	public float getBuyThreePrice() {
		return buyThreePrice;
	}
	public void setBuyThreePrice(float buyThreePrice) {
		this.buyThreePrice = buyThreePrice;
	}
	public float getBuyFour() {
		return buyFour;
	}
	public void setBuyFour(float buyFour) {
		this.buyFour = buyFour;
	}
	public float getBuyFourPrice() {
		return buyFourPrice;
	}
	public void setBuyFourPrice(float buyFourPrice) {
		this.buyFourPrice = buyFourPrice;
	}
	public float getBuyFive() {
		return buyFive;
	}
	public void setBuyFive(float buyFive) {
		this.buyFive = buyFive;
	}
	public float getBuyFivePrice() {
		return buyFivePrice;
	}
	public void setBuyFivePrice(float buyFivePrice) {
		this.buyFivePrice = buyFivePrice;
	}
	public float getSellOne() {
		return sellOne;
	}
	public void setSellOne(float sellOne) {
		this.sellOne = sellOne;
	}
	public float getSellOnePrice() {
		return sellOnePrice;
	}
	public void setSellOnePrice(float sellOnePrice) {
		this.sellOnePrice = sellOnePrice;
	}
	public float getSellTwo() {
		return sellTwo;
	}
	public void setSellTwo(float sellTwo) {
		this.sellTwo = sellTwo;
	}
	public float getSellTwoPrice() {
		return sellTwoPrice;
	}
	public void setSellTwoPrice(float sellTwoPrice) {
		this.sellTwoPrice = sellTwoPrice;
	}
	public float getSellThree() {
		return sellThree;
	}
	public void setSellThree(float sellThree) {
		this.sellThree = sellThree;
	}
	public float getSellThreePrice() {
		return sellThreePrice;
	}
	public void setSellThreePrice(float sellThreePrice) {
		this.sellThreePrice = sellThreePrice;
	}
	public float getSellFour() {
		return sellFour;
	}
	public void setSellFour(float sellFour) {
		this.sellFour = sellFour;
	}
	public float getSellFourPrice() {
		return sellFourPrice;
	}
	public void setSellFourPrice(float sellFourPrice) {
		this.sellFourPrice = sellFourPrice;
	}
	public float getSellFive() {
		return sellFive;
	}
	public void setSellFive(float sellFive) {
		this.sellFive = sellFive;
	}
	public float getSellFivePrice() {
		return sellFivePrice;
	}
	public void setSellFivePrice(float sellFivePrice) {
		this.sellFivePrice = sellFivePrice;
	}
	@Override
	public String toString() {
		return "StockDetail [stock=" + stock + ", name=" + name + ", code=" + code + ", date=" + date + ", time=" + time
				+ ", OpenningPrice=" + OpenningPrice + ", closingPrice=" + closingPrice + ", currentPrice="
				+ currentPrice + ", hPrice=" + hPrice + ", lPrice=" + lPrice + ", competitivePrice=" + competitivePrice
				+ ", auctionPrice=" + auctionPrice + ", totalNumber=" + totalNumber + ", turnover=" + turnover
				+ ", buyOne=" + buyOne + ", buyOnePrice=" + buyOnePrice + ", buyTwo=" + buyTwo + ", buyTwoPrice="
				+ buyTwoPrice + ", buyThree=" + buyThree + ", buyThreePrice=" + buyThreePrice + ", buyFour=" + buyFour
				+ ", buyFourPrice=" + buyFourPrice + ", buyFive=" + buyFive + ", buyFivePrice=" + buyFivePrice
				+ ", sellOne=" + sellOne + ", sellOnePrice=" + sellOnePrice + ", sellTwo=" + sellTwo + ", sellTwoPrice="
				+ sellTwoPrice + ", sellThree=" + sellThree + ", sellThreePrice=" + sellThreePrice + ", sellFour="
				+ sellFour + ", sellFourPrice=" + sellFourPrice + ", sellFive=" + sellFive + ", sellFivePrice="
				+ sellFivePrice + "]";
	}
	
	
}
