package com.tongna.shopdeals.domain;

import java.util.List;

public class CitiesListBack extends Back {
	/**
	 *  定义city集合
	 */
	private List<Cities> cities;

	public List<Cities> getCities() {
		return cities;
	}

	public void setCities(List<Cities> cities) {
		this.cities = cities;
	}
	
}
