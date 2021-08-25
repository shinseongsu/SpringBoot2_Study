package com.spring.bluewalnut.vo;

public class AuthVO {
	
	private String username;
	private String auth;
	
	public String getUserid() {
		return username;
	}
	public void setUserid(String username) {
		this.username = username;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}

}
