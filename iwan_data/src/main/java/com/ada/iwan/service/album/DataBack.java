package com.ada.iwan.service.album;

import java.io.Serializable;

public class DataBack implements Serializable {

	private String msg;

	private Integer code;

	private CategoryList res;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public CategoryList getRes() {
		return res;
	}

	public void setRes(CategoryList res) {
		this.res = res;
	}
}
