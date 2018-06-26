package com.test.dao;

import org.springframework.stereotype.Repository;

import com.test.po.UserClass;

@Repository("userclassDao")
public interface UserClassDao {
	
	public void insertUserClass(UserClass userclass);
	public UserClass selectbyId(int id);
}
