package com.tongna.shopdeals.domain;

import java.io.Serializable;
import java.util.Set;


public class ShopInfo implements Serializable{ 
	/**
	 *  shops			商户列表数组	<br>
		shop_id			商户id<br>
		city_id			城市id<br>
		shop_name		商户名称<br>
		shop_url		商户PC的url<br>
		shop_murl		商户移动端url<br>
		address			商户地址	<br>
		district_id		行政区id	<br>
		bizarea_id		商圈id<br>
		phone			商户电话<br>
		open_time		营业时间<br>
		longitude		经度<br>
		latitude		纬度	<br>
		traffic_info	交通信息	<br>
		update_time		更新时间，合作方可根据该字段选择是否更新<br>
	 * @author dell1
	 *
	 */
	private Set shops;
	private Integer shop_id	;
	private int city_id;
	private String shop_name;
	private String shop_url;
	private String shop_murl;
	private String address;
	private int district_id;
	private int bizarea_id;
	private String phone;
	private String open_time;
	private float longitude;
	private float latitude;
	private String traffic_info;
	private int update_time;
	public Set getShops() {
		return shops;
	}
	public void setShops(Set shops) {
		this.shops = shops;
	}
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getShop_url() {
		return shop_url;
	}
	public void setShop_url(String shop_url) {
		this.shop_url = shop_url;
	}
	public String getShop_murl() {
		return shop_murl;
	}
	public void setShop_murl(String shop_murl) {
		this.shop_murl = shop_murl;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}
	public int getBizarea_id() {
		return bizarea_id;
	}
	public void setBizarea_id(int bizarea_id) {
		this.bizarea_id = bizarea_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOpen_time() {
		return open_time;
	}
	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public String getTraffic_info() {
		return traffic_info;
	}
	public void setTraffic_info(String traffic_info) {
		this.traffic_info = traffic_info;
	}
	public int getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(int update_time) {
		this.update_time = update_time;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bizarea_id;
		result = prime * result + city_id;
		result = prime * result + district_id;
		result = prime * result + Float.floatToIntBits(latitude);
		result = prime * result + Float.floatToIntBits(longitude);
		result = prime * result + ((open_time == null) ? 0 : open_time.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((shop_id == null) ? 0 : shop_id.hashCode());
		result = prime * result + ((shop_murl == null) ? 0 : shop_murl.hashCode());
		result = prime * result + ((shop_name == null) ? 0 : shop_name.hashCode());
		result = prime * result + ((shop_url == null) ? 0 : shop_url.hashCode());
		result = prime * result + ((shops == null) ? 0 : shops.hashCode());
		result = prime * result + ((traffic_info == null) ? 0 : traffic_info.hashCode());
		result = prime * result + update_time;
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
		ShopInfo other = (ShopInfo) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bizarea_id != other.bizarea_id)
			return false;
		if (city_id != other.city_id)
			return false;
		if (district_id != other.district_id)
			return false;
		if (Float.floatToIntBits(latitude) != Float.floatToIntBits(other.latitude))
			return false;
		if (Float.floatToIntBits(longitude) != Float.floatToIntBits(other.longitude))
			return false;
		if (open_time == null) {
			if (other.open_time != null)
				return false;
		} else if (!open_time.equals(other.open_time))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (shop_id == null) {
			if (other.shop_id != null)
				return false;
		} else if (!shop_id.equals(other.shop_id))
			return false;
		if (shop_murl == null) {
			if (other.shop_murl != null)
				return false;
		} else if (!shop_murl.equals(other.shop_murl))
			return false;
		if (shop_name == null) {
			if (other.shop_name != null)
				return false;
		} else if (!shop_name.equals(other.shop_name))
			return false;
		if (shop_url == null) {
			if (other.shop_url != null)
				return false;
		} else if (!shop_url.equals(other.shop_url))
			return false;
		if (shops == null) {
			if (other.shops != null)
				return false;
		} else if (!shops.equals(other.shops))
			return false;
		if (traffic_info == null) {
			if (other.traffic_info != null)
				return false;
		} else if (!traffic_info.equals(other.traffic_info))
			return false;
		if (update_time != other.update_time)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ShopInfo [shops=" + shops + ", shop_id=" + shop_id + ", city_id=" + city_id + ", shop_name=" + shop_name
				+ ", shop_url=" + shop_url + ", shop_murl=" + shop_murl + ", address=" + address + ", district_id="
				+ district_id + ", bizarea_id=" + bizarea_id + ", phone=" + phone + ", open_time=" + open_time
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", traffic_info=" + traffic_info
				+ ", update_time=" + update_time + "]";
	}
	
	
}
