package com.tongna.shopdeals.domain;

public class Shops {
	/**
	 * 		city_id	 城市id
            shop_id  商户id
            shop_url   pc端商户详情url
            shop_murl  wap端商户详情url
            address    地址
            phone     电话 
            longitude  
            latitude
	 */
	
	private int city_id;
	private int shop_id;
	private String shop_url;
	private String shop_murl;
	private String address;
	private String phone;
	private float longitude;
	private float latitude;
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + city_id;
		result = prime * result + Float.floatToIntBits(latitude);
		result = prime * result + Float.floatToIntBits(longitude);
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + shop_id;
		result = prime * result + ((shop_murl == null) ? 0 : shop_murl.hashCode());
		result = prime * result + ((shop_url == null) ? 0 : shop_url.hashCode());
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
		Shops other = (Shops) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city_id != other.city_id)
			return false;
		if (Float.floatToIntBits(latitude) != Float.floatToIntBits(other.latitude))
			return false;
		if (Float.floatToIntBits(longitude) != Float.floatToIntBits(other.longitude))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (shop_id != other.shop_id)
			return false;
		if (shop_murl == null) {
			if (other.shop_murl != null)
				return false;
		} else if (!shop_murl.equals(other.shop_murl))
			return false;
		if (shop_url == null) {
			if (other.shop_url != null)
				return false;
		} else if (!shop_url.equals(other.shop_url))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Shops [city_id=" + city_id + ", shop_id=" + shop_id + ", shop_url=" + shop_url + ", shop_murl="
				+ shop_murl + ", address=" + address + ", phone=" + phone + ", longitude=" + longitude + ", latitude="
				+ latitude + "]";
	}
}
