package com.tongna.shopdeals.domain;

import java.util.List;

public class Data {
	/**
	 * total  总数
	 * deals 下团单详情
	 * shops 相应商户信息
	 */
	
	private int total;
	private List<Deals> deals;
	private List<Shops2> shops;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Deals> getDeals() {
		return deals;
	}
	public void setDeals(List<Deals> deals) {
		this.deals = deals;
	}
	public List<Shops2> getShops() {
		return shops;
	}
	public void setShops(List<Shops2> shops) {
		this.shops = shops;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deals == null) ? 0 : deals.hashCode());
		result = prime * result + ((shops == null) ? 0 : shops.hashCode());
		result = prime * result + total;
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
		Data other = (Data) obj;
		if (deals == null) {
			if (other.deals != null)
				return false;
		} else if (!deals.equals(other.deals))
			return false;
		if (shops == null) {
			if (other.shops != null)
				return false;
		} else if (!shops.equals(other.shops))
			return false;
		if (total != other.total)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Data [total=" + total + ", deals=" + deals + ", shops=" + shops + "]";
	}
	
}
