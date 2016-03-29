package com.tongna.shopdeals.domain;

import java.io.Serializable;
import java.util.List;
/**
 * 定义行政区实体类
 * @author dell1
 *
 */
public class Districts implements Serializable{
	/**
	 * district_id  行政区id
       district_name  行政区名称
       biz_areas  商业圈
	 */
	private int district_id;
	private String district_name;
	private List<BizArea> biz_areas;
	public List<BizArea> getBiz_areas() {
		return biz_areas;
	}
	public void setBiz_areas(List<BizArea> biz_areas) {
		this.biz_areas = biz_areas;
	}
	public int getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((biz_areas == null) ? 0 : biz_areas.hashCode());
		result = prime * result + district_id;
		result = prime * result + ((district_name == null) ? 0 : district_name.hashCode());
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
		Districts other = (Districts) obj;
		if (biz_areas == null) {
			if (other.biz_areas != null)
				return false;
		} else if (!biz_areas.equals(other.biz_areas))
			return false;
		if (district_id != other.district_id)
			return false;
		if (district_name == null) {
			if (other.district_name != null)
				return false;
		} else if (!district_name.equals(other.district_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Districts [district_id=" + district_id + ", district_name=" + district_name + ", biz_areas=" + biz_areas
				+ "]";
	}
	
}
