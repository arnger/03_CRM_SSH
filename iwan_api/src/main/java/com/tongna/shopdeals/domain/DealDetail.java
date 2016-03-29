package com.tongna.shopdeals.domain;

import java.io.Serializable;
/**
 *  deal_id				商品id<br>
	city_ids			商品所在全部城市id<br>
	title	    		商品标题	<br>
	min_title			商品wap标题<br>
	description			商品描述	<br>
	long_title			长标题<br>
	cat_id				一级分类的id <br>
	subcat_ids			二级分类的id列表，一个商品可能属于多个二级分类<br>
	publish_time		商品发布时间	<br>
	purchase_deadline	商品购买的截止时间<br>
	coupon_start_time	券有效开始时间<br>
	coupon_end_time		券有效截止时间<br>
	market_price		商品原价，单位是分<br>
	current_price		团购价，单位是分	<br>
	promotion_price		糯米的当前售卖价格，活动后的价格，单位是分，没有活动价，与团购价相同 <br>
	sale_num			商品购买数量	<br>
	is_reservation_required	是否要求预约<br>
	image				商品大图	<br>
	mid_image			商品中图	<br>
	tiny_image			商品小图	<br>
	deal_url			pc的落地页<br>
	deal_murl			wap的落地页<br>
	buy_contents	    购买内容<br>
	consumer_tips	    消费提示<br>
	buy_details			购买详情	<br>
	shop_ description	商户环境	<br>
	shop_ids			商户列表<br>
	update_time			更新时间	<br>

 * @author dell1
 *
 */
import java.util.List;
public class DealDetail implements Serializable{

	private Integer deal_id;	
	private	List city_ids;
	private String title;
	private String min_title;
	private String description;	
	private String long_title;
	private	int cat_id;
	private	List subcat_ids;	
	private	int publish_time;
	private int purchase_deadline;
	private int coupon_start_time;
	private int coupon_end_time;
	private int market_price;
	private int current_price;
	private int promotion_price;
	private int sale_num;
	private boolean is_reservation_required;
	private String image;
	private String mid_image;
	private String tiny_image;	
	private String deal_url;
	private String deal_murl;
	private String buy_contents;
	private String consumer_tips;
	private String buy_details;
	private String shop_description;
	private List shop_ids;
	private int update_time;
	public Integer getDeal_id() {
		return deal_id;
	}
	public void setDeal_id(Integer deal_id) {
		this.deal_id = deal_id;
	}
	public List getCity_ids() {
		return city_ids;
	}
	public void setCity_ids(List city_ids) {
		this.city_ids = city_ids;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMin_title() {
		return min_title;
	}
	public void setMin_title(String min_title) {
		this.min_title = min_title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLong_title() {
		return long_title;
	}
	public void setLong_title(String long_title) {
		this.long_title = long_title;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public List getSubcat_ids() {
		return subcat_ids;
	}
	public void setSubcat_ids(List subcat_ids) {
		this.subcat_ids = subcat_ids;
	}
	public int getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(int publish_time) {
		this.publish_time = publish_time;
	}
	public int getPurchase_deadline() {
		return purchase_deadline;
	}
	public void setPurchase_deadline(int purchase_deadline) {
		this.purchase_deadline = purchase_deadline;
	}
	public int getCoupon_start_time() {
		return coupon_start_time;
	}
	public void setCoupon_start_time(int coupon_start_time) {
		this.coupon_start_time = coupon_start_time;
	}
	public int getCoupon_end_time() {
		return coupon_end_time;
	}
	public void setCoupon_end_time(int coupon_end_time) {
		this.coupon_end_time = coupon_end_time;
	}
	public int getMarket_price() {
		return market_price;
	}
	public void setMarket_price(int market_price) {
		this.market_price = market_price;
	}
	public int getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(int current_price) {
		this.current_price = current_price;
	}
	public int getPromotion_price() {
		return promotion_price;
	}
	public void setPromotion_price(int promotion_price) {
		this.promotion_price = promotion_price;
	}
	public int getSale_num() {
		return sale_num;
	}
	public void setSale_num(int sale_num) {
		this.sale_num = sale_num;
	}
	public boolean isIs_reservation_required() {
		return is_reservation_required;
	}
	public void setIs_reservation_required(boolean is_reservation_required) {
		this.is_reservation_required = is_reservation_required;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMid_image() {
		return mid_image;
	}
	public void setMid_image(String mid_image) {
		this.mid_image = mid_image;
	}
	public String getTiny_image() {
		return tiny_image;
	}
	public void setTiny_image(String tiny_image) {
		this.tiny_image = tiny_image;
	}
	public String getDeal_url() {
		return deal_url;
	}
	public void setDeal_url(String deal_url) {
		this.deal_url = deal_url;
	}
	public String getDeal_murl() {
		return deal_murl;
	}
	public void setDeal_murl(String deal_murl) {
		this.deal_murl = deal_murl;
	}
	public String getBuy_contents() {
		return buy_contents;
	}
	public void setBuy_contents(String buy_contents) {
		this.buy_contents = buy_contents;
	}
	public String getConsumer_tips() {
		return consumer_tips;
	}
	public void setConsumer_tips(String consumer_tips) {
		this.consumer_tips = consumer_tips;
	}
	public String getBuy_details() {
		return buy_details;
	}
	public void setBuy_details(String buy_details) {
		this.buy_details = buy_details;
	}
	public String getShop_description() {
		return shop_description;
	}
	public void setShop_description(String shop_description) {
		this.shop_description = shop_description;
	}
	public List getShop_ids() {
		return shop_ids;
	}
	public void setShop_ids(List shop_ids) {
		this.shop_ids = shop_ids;
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
		result = prime * result + ((buy_contents == null) ? 0 : buy_contents.hashCode());
		result = prime * result + ((buy_details == null) ? 0 : buy_details.hashCode());
		result = prime * result + cat_id;
		result = prime * result + ((city_ids == null) ? 0 : city_ids.hashCode());
		result = prime * result + ((consumer_tips == null) ? 0 : consumer_tips.hashCode());
		result = prime * result + coupon_end_time;
		result = prime * result + coupon_start_time;
		result = prime * result + current_price;
		result = prime * result + ((deal_id == null) ? 0 : deal_id.hashCode());
		result = prime * result + ((deal_murl == null) ? 0 : deal_murl.hashCode());
		result = prime * result + ((deal_url == null) ? 0 : deal_url.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + (is_reservation_required ? 1231 : 1237);
		result = prime * result + ((long_title == null) ? 0 : long_title.hashCode());
		result = prime * result + market_price;
		result = prime * result + ((mid_image == null) ? 0 : mid_image.hashCode());
		result = prime * result + ((min_title == null) ? 0 : min_title.hashCode());
		result = prime * result + promotion_price;
		result = prime * result + publish_time;
		result = prime * result + purchase_deadline;
		result = prime * result + sale_num;
		result = prime * result + ((shop_description == null) ? 0 : shop_description.hashCode());
		result = prime * result + ((shop_ids == null) ? 0 : shop_ids.hashCode());
		result = prime * result + ((subcat_ids == null) ? 0 : subcat_ids.hashCode());
		result = prime * result + ((tiny_image == null) ? 0 : tiny_image.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		DealDetail other = (DealDetail) obj;
		if (buy_contents == null) {
			if (other.buy_contents != null)
				return false;
		} else if (!buy_contents.equals(other.buy_contents))
			return false;
		if (buy_details == null) {
			if (other.buy_details != null)
				return false;
		} else if (!buy_details.equals(other.buy_details))
			return false;
		if (cat_id != other.cat_id)
			return false;
		if (city_ids == null) {
			if (other.city_ids != null)
				return false;
		} else if (!city_ids.equals(other.city_ids))
			return false;
		if (consumer_tips == null) {
			if (other.consumer_tips != null)
				return false;
		} else if (!consumer_tips.equals(other.consumer_tips))
			return false;
		if (coupon_end_time != other.coupon_end_time)
			return false;
		if (coupon_start_time != other.coupon_start_time)
			return false;
		if (current_price != other.current_price)
			return false;
		if (deal_id == null) {
			if (other.deal_id != null)
				return false;
		} else if (!deal_id.equals(other.deal_id))
			return false;
		if (deal_murl == null) {
			if (other.deal_murl != null)
				return false;
		} else if (!deal_murl.equals(other.deal_murl))
			return false;
		if (deal_url == null) {
			if (other.deal_url != null)
				return false;
		} else if (!deal_url.equals(other.deal_url))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (is_reservation_required != other.is_reservation_required)
			return false;
		if (long_title == null) {
			if (other.long_title != null)
				return false;
		} else if (!long_title.equals(other.long_title))
			return false;
		if (market_price != other.market_price)
			return false;
		if (mid_image == null) {
			if (other.mid_image != null)
				return false;
		} else if (!mid_image.equals(other.mid_image))
			return false;
		if (min_title == null) {
			if (other.min_title != null)
				return false;
		} else if (!min_title.equals(other.min_title))
			return false;
		if (promotion_price != other.promotion_price)
			return false;
		if (publish_time != other.publish_time)
			return false;
		if (purchase_deadline != other.purchase_deadline)
			return false;
		if (sale_num != other.sale_num)
			return false;
		if (shop_description == null) {
			if (other.shop_description != null)
				return false;
		} else if (!shop_description.equals(other.shop_description))
			return false;
		if (shop_ids == null) {
			if (other.shop_ids != null)
				return false;
		} else if (!shop_ids.equals(other.shop_ids))
			return false;
		if (subcat_ids == null) {
			if (other.subcat_ids != null)
				return false;
		} else if (!subcat_ids.equals(other.subcat_ids))
			return false;
		if (tiny_image == null) {
			if (other.tiny_image != null)
				return false;
		} else if (!tiny_image.equals(other.tiny_image))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (update_time != other.update_time)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DealDetail [deal_id=" + deal_id + ", city_ids=" + city_ids + ", title=" + title + ", min_title="
				+ min_title + ", description=" + description + ", long_title=" + long_title + ", cat_id=" + cat_id
				+ ", subcat_ids=" + subcat_ids + ", publish_time=" + publish_time + ", purchase_deadline="
				+ purchase_deadline + ", coupon_start_time=" + coupon_start_time + ", coupon_end_time="
				+ coupon_end_time + ", market_price=" + market_price + ", current_price=" + current_price
				+ ", promotion_price=" + promotion_price + ", sale_num=" + sale_num + ", is_reservation_required="
				+ is_reservation_required + ", image=" + image + ", mid_image=" + mid_image + ", tiny_image="
				+ tiny_image + ", deal_url=" + deal_url + ", deal_murl=" + deal_murl + ", buy_contents=" + buy_contents
				+ ", consumer_tips=" + consumer_tips + ", buy_details=" + buy_details + ", shop_description="
				+ shop_description + ", shop_ids=" + shop_ids + ", update_time=" + update_time + "]";
	}
	
}
