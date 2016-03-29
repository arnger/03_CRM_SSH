package com.tongna.shopdeals.dto;

public class ShopDto {

	/**
	 * 城市ID
	 */
	Integer city_id;

	/**
	 * 分类的id，支持多个category合并查询， 多个一级分类用英文逗号,连接
	 */
	String cat_ids;

	/**
	 * 二级分类的id，支持多个subcategory合并查询， 多个二级分类用英文逗号,连接， 如1,2,3
	 */
	String subcat_ids;

	/**
	 * 行政区id， 支持多个，多个区用英文逗号,连接
	 */
	String district_ids;

	/**
	 * 商圈id, 支持多个查询， 多个商圈用英文逗号,连接
	 */
	String bizarea_ids;

	/**
	 * WGS84坐标;用户所在位置longitude<经度>, latitude <纬度> 如：38.76623,116.43213
	 */
	String location;

	/**
	 * X关键词，搜索商户名
	 */
	String keyword;

	/**
	 * 基于location,搜索的半径范围，单位是米。 可选（若传入该参数，必须同时传入合法的经纬度坐标， radius字段默认半径3000米）
	 */
	Integer radius;

	/**
	 * 页码，如不传入默认为1，即第一页
	 */
	Integer page = 1;
	/**
	 * 每页返回的团单结果条目数上限，最小值1，最大值50，如不传入默认为10
	 */
	Integer page_size = 50;
	/**
	 * 每页返回的团单结果条目数上限，最小值1，最大值50，如不传入默认为10
	 */
	Integer deals_per_shop = 50;

	public Integer getCity_id() {
		return city_id;
	}

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}

	public String getCat_ids() {
		return cat_ids;
	}

	public void setCat_ids(String cat_ids) {
		this.cat_ids = cat_ids;
	}

	public String getSubcat_ids() {
		return subcat_ids;
	}

	public void setSubcat_ids(String subcat_ids) {
		this.subcat_ids = subcat_ids;
	}

	public String getDistrict_ids() {
		return district_ids;
	}

	public void setDistrict_ids(String district_ids) {
		this.district_ids = district_ids;
	}

	public String getBizarea_ids() {
		return bizarea_ids;
	}

	public void setBizarea_ids(String bizarea_ids) {
		this.bizarea_ids = bizarea_ids;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPage_size() {
		return page_size;
	}

	public void setPage_size(Integer page_size) {
		this.page_size = page_size;
	}

	public Integer getDeals_per_shop() {
		return deals_per_shop;
	}

	public void setDeals_per_shop(Integer deals_per_shop) {
		this.deals_per_shop = deals_per_shop;
	}

}
