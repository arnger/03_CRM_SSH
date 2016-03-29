package com.ada.iwan.service.album;

public class WallpaperBack {

	private String msg;

	private Integer code;

	private Wallpaper res;

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

	public Wallpaper getRes() {
		return res;
	}

	public void setRes(Wallpaper res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "WallpaperBack [msg=" + msg + ", code=" + code + ", res=" + res
				+ "]";
	}

}
