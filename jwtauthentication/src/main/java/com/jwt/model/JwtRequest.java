package com.jwt.model;

public class JwtRequest {
	
	String username;
	String password;
	
	
	
	public JwtRequest() {
		super();
	}



	public JwtRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public String getUsername() {
		return username;
	}



	public void setUserName(String userName) {
		this.username = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
