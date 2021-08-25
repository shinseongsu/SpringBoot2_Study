package com.spring.bluewalnut.vo;

import java.util.List;

public class MemberVO {
	
	private String username;
	private String password;
	private List<AuthVO> authList;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<AuthVO> getAuthList() {
		return authList;
	}
	public void setAuthList(List<AuthVO> authList) {
		this.authList = authList;
	}
	
	
	
	
}
