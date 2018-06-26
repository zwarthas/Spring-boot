package com.test.po;

public class UserClass {
	private int classid;
	private String classname;

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String toString() {
		return this.classid + "," + this.classname;
	}
}
