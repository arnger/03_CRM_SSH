
package com.tongna.shopdeals.domain;

import java.io.Serializable;

/**
 * 
 * 
 * deal_id 团单id int <br/>
 * image 图片链接 string<br/>
 * tiny_image 小图链接 string<br/>
 * title 商户标题 string<br/>
 * description 商户描述 string<br/>
 * market_price 市场价格，单位是分 int <br/>
 * current_price 售卖价格，单位是分 int<br/>
 * promotion_price 活动价格，单位是分 int<br/>
 * sale_num 已售团单数量 int<br/>
 * score 用户评分 float <br/>
 * comment_num 用户评论个数 int <br/>
 * deal_url Pc团单详情页 string<br/>
 * deal_murl Wap团详情页 string
 * 
 * @author aniaojian
 *
 */
public class ShopDeals implements Serializable {

	private Integer deal_id;
	private String image;
	private	String tiny_image;
	private String title;
	private String description;
	private int market_price;
	private	int current_price;
	private int promotion_price;
	private int sale_num;
	private float score;
	private int comment_num;
	private String deal_url;
	private String deal_murl;
	public Integer getDeal_id() {
		return deal_id;
	}
	public void setDeal_id(Integer deal_id) {
		this.deal_id = deal_id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTiny_image() {
		return tiny_image;
	}
	public void setTiny_image(String tiny_image) {
		this.tiny_image = tiny_image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public int getComment_num() {
		return comment_num;
	}
	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + comment_num;
		result = prime * result + current_price;
		result = prime * result + ((deal_id == null) ? 0 : deal_id.hashCode());
		result = prime * result + ((deal_murl == null) ? 0 : deal_murl.hashCode());
		result = prime * result + ((deal_url == null) ? 0 : deal_url.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + market_price;
		result = prime * result + promotion_price;
		result = prime * result + sale_num;
		result = prime * result + Float.floatToIntBits(score);
		result = prime * result + ((tiny_image == null) ? 0 : tiny_image.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		ShopDeals other = (ShopDeals) obj;
		if (comment_num != other.comment_num)
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
		if (market_price != other.market_price)
			return false;
		if (promotion_price != other.promotion_price)
			return false;
		if (sale_num != other.sale_num)
			return false;
		if (Float.floatToIntBits(score) != Float.floatToIntBits(other.score))
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
		return true;
	}
	@Override
	public String toString() {
		return "ShopDeals [deal_id=" + deal_id + ", image=" + image + ", tiny_image=" + tiny_image + ", title=" + title
				+ ", description=" + description + ", market_price=" + market_price + ", current_price=" + current_price
				+ ", promotion_price=" + promotion_price + ", sale_num=" + sale_num + ", score=" + score
				+ ", comment_num=" + comment_num + ", deal_url=" + deal_url + ", deal_murl=" + deal_murl + "]";
	}
	
	
}
