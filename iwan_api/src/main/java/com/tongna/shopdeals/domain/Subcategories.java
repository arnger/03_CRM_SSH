package com.tongna.shopdeals.domain;
/**
 * 商品二级分类实体类
 * @author dell1
 *
 */
public class Subcategories {
	/**
	 *  subcat_name   二级分类名称<br>
        subcat_id     二级分类id<br>
	 */
	private String subcat_name;
	private int subcat_id;
	public String getSubcat_name() {
		return subcat_name;
	}
	public void setSubcat_name(String subcat_name) {
		this.subcat_name = subcat_name;
	}
	public int getSubcat_id() {
		return subcat_id;
	}
	public void setSubcat_id(int subcat_id) {
		this.subcat_id = subcat_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + subcat_id;
		result = prime * result + ((subcat_name == null) ? 0 : subcat_name.hashCode());
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
		Subcategories other = (Subcategories) obj;
		if (subcat_id != other.subcat_id)
			return false;
		if (subcat_name == null) {
			if (other.subcat_name != null)
				return false;
		} else if (!subcat_name.equals(other.subcat_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Subcategories [subcat_name=" + subcat_name + ", subcat_id=" + subcat_id + "]";
	}
}
