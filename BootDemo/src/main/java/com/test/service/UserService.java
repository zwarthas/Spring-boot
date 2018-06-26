package com.test.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.test.po.User;
import com.test.vo.UserInsertVO;

public interface UserService {

	public List<User> getUsers();


	public boolean updateUser(User user);

	public boolean deleteUser(@Param("id") int id);

	public User getUserByid(@Param("id") int id);

	public int insertUser(UserInsertVO userinsertvo);
}
