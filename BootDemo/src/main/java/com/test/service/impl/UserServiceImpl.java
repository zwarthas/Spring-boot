package com.test.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.*;
import com.test.po.User;
import com.test.po.UserClass;
import com.test.service.UserService;
import com.test.vo.UserInsertVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserClassDao userclassDao;

	public User getUserByid(int id) {
		return userDao.getUserByid(id);
	}

	public List<User> getUsers() {
		return userDao.getUsers();
	}

	public int insertUser(UserInsertVO vouser) {

		int id = vouser.getClassid();

		UserClass userclass = userclassDao.selectbyId(id);
		if (userclass == null) {
			return 0;
		} else {

			User user = new User();
			user.setUsername(vouser.getUsername());
			user.setPassword(vouser.getPassword());
			user.setUserclass(userclass);

			userDao.insertUser(user);
			return 1;
		}
	}

	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	public boolean deleteUser(int id) {
		return userDao.deleteUser(id);
	}

}
