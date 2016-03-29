package com.tongna.shopdeals.domain;

import java.util.List;

public class Data2 {
	private int total;
	private List<ShopsAndDeals> shops;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<ShopsAndDeals> getShops() {
		return shops;
	}
	public void setShops(List<ShopsAndDeals> shops) {
		this.shops = shops;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Data2 other = (Data2) obj;
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
		return "Data2 [total=" + total + ", shops=" + shops + ", deals="  + "]";
	}
}
