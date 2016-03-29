package com.ada.iwan.service.stock.domain;

import java.io.Serializable;
import java.util.Date;

public class StockBack implements Serializable{

	/**
	 * 地区
	 */
	private String area;
	/**
	 * 每股净资
	 */
	private float bvps;
	
	/**
	 * 	"code":          代码
		"name":          名称
		"industry":      所属行业
		"area":          地区
		"pe":            市盈率
		"outstanding":   流通股本
		"totals":        总股本(万)
		"totalassets":   总资产(万)
		"liquidassets":  流动资产
		"fixedassets":   固定资产
		"reserved":      公积金
		"reservedpershare":每股公积金
		"eps":           每股收益
		"bvps":          每股净资
		"pb":			  市净率
		"timetomarket":	  上市日期
	 */
	/**
	 * 代码
	 */
	private String code;
	
	/**
	 * 每股收益
	 */
	private float eps;
	
	/**
	 * 固定资产
	 */
	private float fixedassets;
	
	/**
	 * 所属行业
	 */
	private String industry;
	
	/**
	 * 流动资产
	 */
	private float liquidassets;
	
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 流通股本
	 */
	private float outstanding;
	
	/**
	 * 市净率
	 */
	private float pb;
	
	/**
	 * 市盈率
	 */
	private float pe;
	
	private String pinyin;
	
	private String pinyinHead;
	
	/**
	 * 公积金
	 */
	private float reserved;
	
	/**
	 * 每股公积金
	 */
	private float reservedpershare;
	
	/**
	 * 上市日期
	 */
	private Date timetomarket;
	
	
	/**
	 * 总资产(万)
	 */
	private float totalassets;
	
	/**
	 * 总股本(万)
	 */
	private float totals;
	
	public String getArea() {
		return area;
	}
	public float getBvps() {
		return bvps;
	}
	public String getCode() {
		return code;
	}
	public float getEps() {
		return eps;
	}
	public float getFixedassets() {
		return fixedassets;
	}
	public String getIndustry() {
		return industry;
	}
	public float getLiquidassets() {
		return liquidassets;
	}
	public String getName() {
		return name;
	}
	public float getOutstanding() {
		return outstanding;
	}
	public float getPb() {
		return pb;
	}
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
	public void setPinyinHead(String pinyinHead) {
		this.pinyinHead = pinyinHead;
	}
	public float getPe() {
		return pe;
	}
	public String getPinyin() {
		return pinyin;
	}
	public String getPinyinHead() {
		return pinyinHead;
	}
	public float getReserved() {
		return reserved;
	}
	public float getReservedpershare() {
		return reservedpershare;
	}
	public Date getTimetomarket() {
		return timetomarket;
	}
	public float getTotalassets() {
		return totalassets;
	}
	public float getTotals() {
		return totals;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setBvps(float bvps) {
		this.bvps = bvps;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setEps(float eps) {
		this.eps = eps;
	}
	public void setFixedassets(float fixedassets) {
		this.fixedassets = fixedassets;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public void setLiquidassets(float liquidassets) {
		this.liquidassets = liquidassets;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOutstanding(float outstanding) {
		this.outstanding = outstanding;
	}
	public void setPb(float pb) {
		this.pb = pb;
	}
	public void setPe(float pe) {
		this.pe = pe;
	}
	public void setReserved(float reserved) {
		this.reserved = reserved;
	}
	public void setReservedpershare(float reservedpershare) {
		this.reservedpershare = reservedpershare;
	}
	public void setTimetomarket(Date timetomarket) {
		this.timetomarket = timetomarket;
	}
	public void setTotalassets(float totalassets) {
		this.totalassets = totalassets;
	}
	public void setTotals(float totals) {
		this.totals = totals;
	}
	@Override
	public String toString() {
		return "StockBack [code=" + code + ", name=" + name + ", industry=" + industry + ", area=" + area + ", pe=" + pe
				+ ", outstanding=" + outstanding + ", totals=" + totals + ", totalassets=" + totalassets
				+ ", liquidassets=" + liquidassets + ", fixedassets=" + fixedassets + ", reserved=" + reserved
				+ ", reservedpershare=" + reservedpershare + ", eps=" + eps + ", bvps=" + bvps + ", pb=" + pb
				+ ", timetomarket=" + timetomarket + "]";
	}
	
	
}
