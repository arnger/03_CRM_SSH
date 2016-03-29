package com.tongna.stock.domain;
/**
 * 季报十大股东基类
 * @author dell1
 *
 */
public class Sdlt {
	/**
	 * 
	 *  "createtime":		系统更新时间（系统处理时间无意义）
		"com_uni_code":		股票代码
		"end_date":			公告日期
		"decl_date":		发布日期
		"hld_num":			排名
		"hld_name":			持股人
		"hld_vol":			持有量
		"hld_ratio":		占比
		"hld_kind":			持股类型
	 */
	
	private String createtime;
	private String com_uni_code;
	private String end_date;
	private String decl_date;
	private Integer hld_num;
	private String hld_name;
	private Integer hld_vol;
	private	float hld_ratio;
	private String hld_kind;
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getCom_uni_code() {
		return com_uni_code;
	}
	public void setCom_uni_code(String com_uni_code) {
		this.com_uni_code = com_uni_code;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getDecl_date() {
		return decl_date;
	}
	public void setDecl_date(String decl_date) {
		this.decl_date = decl_date;
	}
	public Integer getHld_num() {
		return hld_num;
	}
	public void setHld_num(Integer hld_num) {
		this.hld_num = hld_num;
	}
	public String getHld_name() {
		return hld_name;
	}
	public void setHld_name(String hld_name) {
		this.hld_name = hld_name;
	}
	public Integer getHld_vol() {
		return hld_vol;
	}
	public void setHld_vol(Integer hld_vol) {
		this.hld_vol = hld_vol;
	}
	public float getHld_ratio() {
		return hld_ratio;
	}
	public void setHld_ratio(float hld_ratio) {
		this.hld_ratio = hld_ratio;
	}
	public String getHld_kind() {
		return hld_kind;
	}
	public void setHld_kind(String hld_kind) {
		this.hld_kind = hld_kind;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((com_uni_code == null) ? 0 : com_uni_code.hashCode());
		result = prime * result + ((createtime == null) ? 0 : createtime.hashCode());
		result = prime * result + ((decl_date == null) ? 0 : decl_date.hashCode());
		result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
		result = prime * result + ((hld_kind == null) ? 0 : hld_kind.hashCode());
		result = prime * result + ((hld_name == null) ? 0 : hld_name.hashCode());
		result = prime * result + ((hld_num == null) ? 0 : hld_num.hashCode());
		result = prime * result + Float.floatToIntBits(hld_ratio);
		result = prime * result + ((hld_vol == null) ? 0 : hld_vol.hashCode());
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
		Sdlt other = (Sdlt) obj;
		if (com_uni_code == null) {
			if (other.com_uni_code != null)
				return false;
		} else if (!com_uni_code.equals(other.com_uni_code))
			return false;
		if (createtime == null) {
			if (other.createtime != null)
				return false;
		} else if (!createtime.equals(other.createtime))
			return false;
		if (decl_date == null) {
			if (other.decl_date != null)
				return false;
		} else if (!decl_date.equals(other.decl_date))
			return false;
		if (end_date == null) {
			if (other.end_date != null)
				return false;
		} else if (!end_date.equals(other.end_date))
			return false;
		if (hld_kind == null) {
			if (other.hld_kind != null)
				return false;
		} else if (!hld_kind.equals(other.hld_kind))
			return false;
		if (hld_name == null) {
			if (other.hld_name != null)
				return false;
		} else if (!hld_name.equals(other.hld_name))
			return false;
		if (hld_num == null) {
			if (other.hld_num != null)
				return false;
		} else if (!hld_num.equals(other.hld_num))
			return false;
		if (Float.floatToIntBits(hld_ratio) != Float.floatToIntBits(other.hld_ratio))
			return false;
		if (hld_vol == null) {
			if (other.hld_vol != null)
				return false;
		} else if (!hld_vol.equals(other.hld_vol))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sdlt [createtime=" + createtime + ", com_uni_code=" + com_uni_code + ", end_date=" + end_date
				+ ", decl_date=" + decl_date + ", hld_num=" + hld_num + ", hld_name=" + hld_name + ", hld_vol="
				+ hld_vol + ", hld_ratio=" + hld_ratio + ", hld_kind=" + hld_kind + "]";
	}
 
}
