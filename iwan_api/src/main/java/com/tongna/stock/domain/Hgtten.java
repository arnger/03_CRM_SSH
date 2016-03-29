package com.tongna.stock.domain;
/**
 * 股票数据实体
 * @author dell1
 *
 */
public class Hgtten {
	
	/**
	 * 		"dattrade":    日期
            "numorder":    当日排名
            "vc2marcode":  股票代码
            "vc2name":     股票名称
            "numclose":    收盘价
            "numratio":    当日涨幅
            "numbmount":   买入量
            "numsmount":   卖出量
            "numsummount": 总成交量
	 */
	
	
	private String dattrade;
	private int numorder;
	private String vc2marcode;
	private String vc2name;
	private float numclose;
	private float numratio;
	private int numbmount;
	private int numsmount;
	private int numsummount;
	public String getDattrade() {
		return dattrade;
	}
	public void setDattrade(String dattrade) {
		this.dattrade = dattrade;
	}
	public int getNumorder() {
		return numorder;
	}
	public void setNumorder(int numorder) {
		this.numorder = numorder;
	}
	public String getVc2marcode() {
		return vc2marcode;
	}
	public void setVc2marcode(String vc2marcode) {
		this.vc2marcode = vc2marcode;
	}
	public String getVc2name() {
		return vc2name;
	}
	public void setVc2name(String vc2name) {
		this.vc2name = vc2name;
	}
	public float getNumclose() {
		return numclose;
	}
	public void setNumclose(float numclose) {
		this.numclose = numclose;
	}
	public float getNumratio() {
		return numratio;
	}
	public void setNumratio(float numratio) {
		this.numratio = numratio;
	}
	public int getNumbmount() {
		return numbmount;
	}
	public void setNumbmount(int numbmount) {
		this.numbmount = numbmount;
	}
	public int getNumsmount() {
		return numsmount;
	}
	public void setNumsmount(int numsmount) {
		this.numsmount = numsmount;
	}
	public int getNumsummount() {
		return numsummount;
	}
	public void setNumsummount(int numsummount) {
		this.numsummount = numsummount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dattrade == null) ? 0 : dattrade.hashCode());
		result = prime * result + numbmount;
		result = prime * result + Float.floatToIntBits(numclose);
		result = prime * result + numorder;
		result = prime * result + Float.floatToIntBits(numratio);
		result = prime * result + numsmount;
		result = prime * result + numsummount;
		result = prime * result + ((vc2marcode == null) ? 0 : vc2marcode.hashCode());
		result = prime * result + ((vc2name == null) ? 0 : vc2name.hashCode());
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
		Hgtten other = (Hgtten) obj;
		if (dattrade == null) {
			if (other.dattrade != null)
				return false;
		} else if (!dattrade.equals(other.dattrade))
			return false;
		if (numbmount != other.numbmount)
			return false;
		if (Float.floatToIntBits(numclose) != Float.floatToIntBits(other.numclose))
			return false;
		if (numorder != other.numorder)
			return false;
		if (Float.floatToIntBits(numratio) != Float.floatToIntBits(other.numratio))
			return false;
		if (numsmount != other.numsmount)
			return false;
		if (numsummount != other.numsummount)
			return false;
		if (vc2marcode == null) {
			if (other.vc2marcode != null)
				return false;
		} else if (!vc2marcode.equals(other.vc2marcode))
			return false;
		if (vc2name == null) {
			if (other.vc2name != null)
				return false;
		} else if (!vc2name.equals(other.vc2name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rows [dattrade=" + dattrade + ", numorder=" + numorder + ", vc2marcode=" + vc2marcode + ", vc2name="
				+ vc2name + ", numclose=" + numclose + ", numratio=" + numratio + ", numbmount=" + numbmount
				+ ", numsmount=" + numsmount + ", numsummount=" + numsummount + "]";
	}
	
}
