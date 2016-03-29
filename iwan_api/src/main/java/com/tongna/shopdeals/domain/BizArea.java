package com.tongna.shopdeals.domain;



/**
 * 
 * 商圈实体类
 * 
 * @author ada
 *
 */
public class BizArea {

	/**
	 * 商圈id
	 */
	private Integer biz_area_id;

	/**
	 * 商圈名称
	 */
	private String biz_area_name;

	public Integer getBiz_area_id() {
		return biz_area_id;
	}

	public String getBiz_area_name() {
		return biz_area_name;
	}

	public void setBiz_area_id(Integer biz_area_id) {
		this.biz_area_id = biz_area_id;
	}

	public void setBiz_area_name(String biz_area_name) {
		this.biz_area_name = biz_area_name;
	}
	
	
}
