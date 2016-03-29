package com.ada.iwan.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ada.data.entity.SortEntity;

/**
 * 友情链接
 * 
 * @author 年高
 *
 */
@Entity
@Table(name = "friendlink")
public class FriendLink extends SortEntity {

	/**
	 * 名称
	 */
	private String name;

	/**
	 * url
	 */
	private String url;

	/**
	 * 
	 */
	private Integer catalog;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getCatalog() {
		return catalog;
	}

	public void setCatalog(Integer catalog) {
		this.catalog = catalog;
	}

}
