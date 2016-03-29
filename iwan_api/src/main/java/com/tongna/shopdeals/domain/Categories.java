package com.tongna.shopdeals.domain;

import java.util.List;

/**
 * 商品一级分类实体类
 * @author dell1
 *
 */
public class Categories {
	/**
	 *  cat_id    一级分类id
        cat_name    一级分类名称
        subcategories  商品二级分类对象
	 */
	private int cat_id;
	private String cat_name;
	private List<CategoriesChild> subcategories;
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public List<CategoriesChild> getSubcategories() {
		return subcategories;
	}
	public void setSubcategories(List<CategoriesChild> subcategories) {
		this.subcategories = subcategories;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cat_id;
		result = prime * result + ((cat_name == null) ? 0 : cat_name.hashCode());
		result = prime * result + ((subcategories == null) ? 0 : subcategories.hashCode());
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
		Categories other = (Categories) obj;
		if (cat_id != other.cat_id)
			return false;
		if (cat_name == null) {
			if (other.cat_name != null)
				return false;
		} else if (!cat_name.equals(other.cat_name))
			return false;
		if (subcategories == null) {
			if (other.subcategories != null)
				return false;
		} else if (!subcategories.equals(other.subcategories))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Categories [cat_id=" + cat_id + ", cat_name=" + cat_name + ", subcategories=" + subcategories + "]";
	}
	
}
