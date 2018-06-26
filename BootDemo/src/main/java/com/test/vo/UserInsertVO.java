package com.test.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "user添加对象", description = "user")
public class UserInsertVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 123123131231231231L;

	//@ApiModelProperty(value = "用户名", required = false)
	private String username;
	//@ApiModelProperty(value = "密码", required = false)
	private String password;
	//@ApiModelProperty(value = "班级id", required = false)
	private int classid;

	public UserInsertVO() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

}
