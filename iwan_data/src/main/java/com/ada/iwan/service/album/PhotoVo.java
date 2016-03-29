package com.ada.iwan.service.album;

import java.util.List;

public class PhotoVo {
	private Integer count;
	
	private String icover;
	
	
	private Integer ncos;
	
	private String thumb;
	
	private String img;
	
	private String desc;
	
	private String id;
	
	private String preview;
	
	private Integer favs;
	
	private String wp;
	
	private List<String> tag;
	
	
	private Integer rank ;
	private Integer views ;
	private List<String>  cid;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getIcover() {
		return icover;
	}
	public void setIcover(String icover) {
		this.icover = icover;
	}
	public Integer getNcos() {
		return ncos;
	}
	public void setNcos(Integer ncos) {
		this.ncos = ncos;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	public Integer getFavs() {
		return favs;
	}
	public void setFavs(Integer favs) {
		this.favs = favs;
	}
	public String getWp() {
		return wp;
	}
	public void setWp(String wp) {
		this.wp = wp;
	}
	public List<String> getTag() {
		return tag;
	}
	public void setTag(List<String> tag) {
		this.tag = tag;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public List<String> getCid() {
		return cid;
	}
	public void setCid(List<String> cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Category [count=" + count + ", icover=" + icover + ", atime="
				 + ", ncos=" + ncos + ", thumb=" + thumb + ", img="
				+ img + ", desc=" + desc + ", id=" + id + ", preview="
				+ ", wp=" + wp + ", tag=" + tag + ", url="  + ", rank="
				+ rank + ", views=" + views + ", cid=" + cid + "]";
	}
}
