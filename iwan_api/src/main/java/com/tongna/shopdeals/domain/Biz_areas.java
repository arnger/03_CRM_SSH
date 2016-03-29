package com.tongna.shopdeals.domain;

/**
 * Biz_areas商圈实体类
 * @author dell1
 *
 */
public class Biz_areas {
	/**
	 *  biz_area_name   商圈名称<br>
        biz_area_id     商圈id<br>
	 */
	private String biz_area_name;
	private int biz_area_id ;
	public String getBiz_area_name() {
		return biz_area_name;
	}
	public void setBiz_area_name(String biz_area_name) {
		this.biz_area_name = biz_area_name;
	}
	public int getBiz_area_id() {
		return biz_area_id;
	}
	public void setBiz_area_id(int biz_area_id) {
		this.biz_area_id = biz_area_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + biz_area_id;
		result = prime * result + ((biz_area_name == null) ? 0 : biz_area_name.hashCode());
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
		Biz_areas other = (Biz_areas) obj;
		if (biz_area_id != other.biz_area_id)
			return false;
		if (biz_area_name == null) {
			if (other.biz_area_name != null)
				return false;
		} else if (!biz_area_name.equals(other.biz_area_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Biz_areas [biz_area_name=" + biz_area_name + ", biz_area_id=" + biz_area_id + "]";
	}
	
}
