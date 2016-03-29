package com.tongna.shopdeals.domain;

import java.io.Serializable;

public class CategoriesChild implements Serializable {

	private String subcat_name;
	private Integer subcat_id;

	public String getSubcat_name() {
		return subcat_name;
	}

	public void setSubcat_name(String subcat_name) {
		this.subcat_name = subcat_name;
	}

	public Integer getSubcat_id() {
		return subcat_id;
	}

	public void setSubcat_id(Integer subcat_id) {
		this.subcat_id = subcat_id;
	}

}
