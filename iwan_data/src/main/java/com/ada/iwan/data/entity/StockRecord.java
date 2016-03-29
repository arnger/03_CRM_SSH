package com.ada.iwan.data.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ada.data.entity.AbstractEntity;


@Entity
@Table(name = "stock_record")
public class StockRecord extends AbstractEntity{

	@ManyToOne
	private Stock stock;
	
	

	/**
	 * 每股净资
	 */
	private float bvps;

	/**
	 * 每股收益
	 */
	private float eps;
	
	/**
	 * 固定资产
	 */
	private float fixedassets;
	
	/**
	 * 流动资产
	 */
	private float liquidassets;
	
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
	
	
	/**
	 * 公积金
	 */
	private float reserved;
	
	/**
	 * 每股公积金
	 */
	private float reservedpershare;
	
	
	/**
	 * 总资产(万)
	 */
	private float totalassets;
	
	/**
	 * 总股本(万)
	 */
	private float totals;

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public float getBvps() {
		return bvps;
	}

	public void setBvps(float bvps) {
		this.bvps = bvps;
	}

	public float getEps() {
		return eps;
	}

	public void setEps(float eps) {
		this.eps = eps;
	}

	public float getFixedassets() {
		return fixedassets;
	}

	public void setFixedassets(float fixedassets) {
		this.fixedassets = fixedassets;
	}

	public float getLiquidassets() {
		return liquidassets;
	}

	public void setLiquidassets(float liquidassets) {
		this.liquidassets = liquidassets;
	}

	public float getOutstanding() {
		return outstanding;
	}

	public void setOutstanding(float outstanding) {
		this.outstanding = outstanding;
	}

	public float getPb() {
		return pb;
	}

	public void setPb(float pb) {
		this.pb = pb;
	}

	public float getPe() {
		return pe;
	}

	public void setPe(float pe) {
		this.pe = pe;
	}

	public float getReserved() {
		return reserved;
	}

	public void setReserved(float reserved) {
		this.reserved = reserved;
	}

	public float getReservedpershare() {
		return reservedpershare;
	}

	public void setReservedpershare(float reservedpershare) {
		this.reservedpershare = reservedpershare;
	}

	public float getTotalassets() {
		return totalassets;
	}

	public void setTotalassets(float totalassets) {
		this.totalassets = totalassets;
	}

	public float getTotals() {
		return totals;
	}

	public void setTotals(float totals) {
		this.totals = totals;
	}
	
	
}
