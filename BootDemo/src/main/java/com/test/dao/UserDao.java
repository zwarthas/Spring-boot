package com.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.test.po.User;

@Repository("userDao")
public interface UserDao {
	
	public List<User> getUsers();

	public void insertUser(User user);

	public boolean updateUser(User user);
	
	public boolean deleteUser(@Param("id")int id);
	
	public User getUserByid(int id);

}
