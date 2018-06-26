package com.test.po;

public class User {
	private int id;
	private String username;
	private String password;
	private UserClass userclass;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public UserClass getUserclass() {
		return userclass;
	}
	public void setUserclass(UserClass userclass) {
		this.userclass = userclass;
	}
}
