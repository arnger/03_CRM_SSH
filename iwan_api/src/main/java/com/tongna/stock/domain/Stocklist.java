package com.tongna.stock.domain;
/**
 * 股票列表实体类
 * @author dell1
 *
 */
public class Stocklist {
	/**
	 * 	"code":          代码
		"name":          名称
		"industry":      所属行业
		"area":          地区
		"pe":            市盈率
		"outstanding":   流通股本
		"totals":        总股本(万)
		"totalassets":   总资产(万)
		"liquidassets":  流动资产
		"fixedassets":   固定资产
		"reserved":      公积金
		"reservedpershare":每股公积金
		"eps":           每股收益
		"bvps":          每股净资
		"pb":			  市净率
		"timetomarket":	  上市日期
	 */
	
	private String code;
	private String name;
	private String industry;
	private String area;
	private float pe;
	private float outstanding;
	private float totals;
	private float totalassets;
	private float liquidassets;
	private float fixedassets;
	private float reserved;
	private float reservedpershare;
	private float eps;
	private float bvps;
	private float pb;
	private String timetomarket;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public float getPe() {
		return pe;
	}
	public void setPe(float pe) {
		this.pe = pe;
	}
	public float getOutstanding() {
		return outstanding;
	}
	public void setOutstanding(float outstanding) {
		this.outstanding = outstanding;
	}
	public float getTotals() {
		return totals;
	}
	public void setTotals(float totals) {
		this.totals = totals;
	}
	public float getTotalassets() {
		return totalassets;
	}
	public void setTotalassets(float totalassets) {
		this.totalassets = totalassets;
	}
	public float getLiquidassets() {
		return liquidassets;
	}
	public void setLiquidassets(float liquidassets) {
		this.liquidassets = liquidassets;
	}
	public float getFixedassets() {
		return fixedassets;
	}
	public void setFixedassets(float fixedassets) {
		this.fixedassets = fixedassets;
	}
	public float getReserved() {
		return reserved;
	}
	public void setReserved(float reserved) {
		this.reserved = reserved;
	}
	public float getReservedpershare() {
		return reservedpershare;
	}
	public void setReservedpershare(float reservedpershare) {
		this.reservedpershare = reservedpershare;
	}
	public float getEps() {
		return eps;
	}
	public void setEps(float eps) {
		this.eps = eps;
	}
	public float getBvps() {
		return bvps;
	}
	public void setBvps(float bvps) {
		this.bvps = bvps;
	}
	public float getPb() {
		return pb;
	}
	public void setPb(float pb) {
		this.pb = pb;
	}
	public String getTimetomarket() {
		return timetomarket;
	}
	public void setTimetomarket(String timetomarket) {
		this.timetomarket = timetomarket;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + Float.floatToIntBits(bvps);
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + Float.floatToIntBits(eps);
		result = prime * result + Float.floatToIntBits(fixedassets);
		result = prime * result + ((industry == null) ? 0 : industry.hashCode());
		result = prime * result + Float.floatToIntBits(liquidassets);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(outstanding);
		result = prime * result + Float.floatToIntBits(pb);
		result = prime * result + Float.floatToIntBits(pe);
		result = prime * result + Float.floatToIntBits(reserved);
		result = prime * result + Float.floatToIntBits(reservedpershare);
		result = prime * result + ((timetomarket == null) ? 0 : timetomarket.hashCode());
		result = prime * result + Float.floatToIntBits(totalassets);
		result = prime * result + Float.floatToIntBits(totals);
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
		Stocklist other = (Stocklist) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (Float.floatToIntBits(bvps) != Float.floatToIntBits(other.bvps))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (Float.floatToIntBits(eps) != Float.floatToIntBits(other.eps))
			return false;
		if (Float.floatToIntBits(fixedassets) != Float.floatToIntBits(other.fixedassets))
			return false;
		if (industry == null) {
			if (other.industry != null)
				return false;
		} else if (!industry.equals(other.industry))
			return false;
		if (Float.floatToIntBits(liquidassets) != Float.floatToIntBits(other.liquidassets))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(outstanding) != Float.floatToIntBits(other.outstanding))
			return false;
		if (Float.floatToIntBits(pb) != Float.floatToIntBits(other.pb))
			return false;
		if (Float.floatToIntBits(pe) != Float.floatToIntBits(other.pe))
			return false;
		if (Float.floatToIntBits(reserved) != Float.floatToIntBits(other.reserved))
			return false;
		if (Float.floatToIntBits(reservedpershare) != Float.floatToIntBits(other.reservedpershare))
			return false;
		if (timetomarket == null) {
			if (other.timetomarket != null)
				return false;
		} else if (!timetomarket.equals(other.timetomarket))
			return false;
		if (Float.floatToIntBits(totalassets) != Float.floatToIntBits(other.totalassets))
			return false;
		if (Float.floatToIntBits(totals) != Float.floatToIntBits(other.totals))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Stocklist [code=" + code + ", name=" + name + ", industry=" + industry + ", area=" + area + ", pe=" + pe
				+ ", outstanding=" + outstanding + ", totals=" + totals + ", totalassets=" + totalassets
				+ ", liquidassets=" + liquidassets + ", fixedassets=" + fixedassets + ", reserved=" + reserved
				+ ", reservedpershare=" + reservedpershare + ", eps=" + eps + ", bvps=" + bvps + ", pb=" + pb
				+ ", timetomarket=" + timetomarket + "]";
	}
}
