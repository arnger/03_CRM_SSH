package com.tongna.shopdeals.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 返回的基类
 * 
 * @author aniaojian
 *
 */
public class Back implements Serializable {

	/**
	 * 错误代码
	 */
	private int errno;

	/**
	 * 返回的消息
	 * 
	 */
	private String msg;

	public int getErrno() {
		return errno;
	}

	public void setErrno(int errno) {
		this.errno = errno;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Back [errno=" + errno + ", msg=" + msg + "]";
	}

}
