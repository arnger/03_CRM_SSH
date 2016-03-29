package com.tongna.shopdeals.domain;

import java.io.Serializable;
/**
 * city实体类
 * @author dell1
 *
 */
public class Cities implements Serializable{
	/**
	 *   city_id   城市id<br>
         city_name  城市名称<br>
         short_name  城市名称简写<br>
         city_pinyin  城市名称拼音<br>
         short_pinyin  城市名称拼音简写<br>
	 */
	private long city_id;
	private String city_name;
	private String short_name;
	private String city_pinyin;
	private	String short_pinyin;
	public long getCity_id() {
		return city_id;
	}
	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public String getCity_pinyin() {
		return city_pinyin;
	}
	public void setCity_pinyin(String city_pinyin) {
		this.city_pinyin = city_pinyin;
	}
	public String getShort_pinyin() {
		return short_pinyin;
	}
	public void setShort_pinyin(String short_pinyin) {
		this.short_pinyin = short_pinyin;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (city_id ^ (city_id >>> 32));
		result = prime * result + ((city_name == null) ? 0 : city_name.hashCode());
		result = prime * result + ((city_pinyin == null) ? 0 : city_pinyin.hashCode());
		result = prime * result + ((short_name == null) ? 0 : short_name.hashCode());
		result = prime * result + ((short_pinyin == null) ? 0 : short_pinyin.hashCode());
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
		Cities other = (Cities) obj;
		if (city_id != other.city_id)
			return false;
		if (city_name == null) {
			if (other.city_name != null)
				return false;
		} else if (!city_name.equals(other.city_name))
			return false;
		if (city_pinyin == null) {
			if (other.city_pinyin != null)
				return false;
		} else if (!city_pinyin.equals(other.city_pinyin))
			return false;
		if (short_name == null) {
			if (other.short_name != null)
				return false;
		} else if (!short_name.equals(other.short_name))
			return false;
		if (short_pinyin == null) {
			if (other.short_pinyin != null)
				return false;
		} else if (!short_pinyin.equals(other.short_pinyin))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cities [city_id=" + city_id + ", city_name=" + city_name + ", short_name=" + short_name
				+ ", city_pinyin=" + city_pinyin + ", short_pinyin=" + short_pinyin + "]";
	}
	
}