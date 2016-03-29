package com.ada.iwan.service.stock.domain;

import java.io.Serializable;
/**
 * 一个返回信息的基类
 * @author dell1
 *
 */
public class Back implements Serializable{
	/**
	 *  total	返回行数
		success 返回true或false
		info   返回错误信息
	 */
	private int total;
	private boolean success;
	private String info;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return "Back [total=" + total + ", success=" + success + ", info=" + info + "]";
	}
}
