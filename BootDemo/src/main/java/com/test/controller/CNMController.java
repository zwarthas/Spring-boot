package com.test.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.po.User;
import com.test.service.UserService;
import com.test.vo.UserInsertVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = "/hello")
@Api(value = "用户后端管理接口", tags = "用户后端管理接口2")
public class CNMController {

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "/getById.do")
	@ApiOperation(httpMethod = "POST", value = "获取指定id用户")
	@ApiImplicitParam(paramType = "query", name = "id", value = "用户id", required = true, dataType = "int")
	public String getUsername(int id) throws JsonProcessingException {
		User u = userService.getUserByid(id);
		ObjectMapper mapper = new ObjectMapper();

		return mapper.writeValueAsString(u);
	}

	@RequestMapping(value = "/delete.do")
	@ApiOperation(httpMethod = "POST", value = "删除用户")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", dataType = "int", name = "id", value = "信息id", required = true),
			@ApiImplicitParam(paramType = "query", dataType = "String", name = "username", value = "yonghuming", required = true) })
	public String deleteUser(int id, String username) {
		boolean a = userService.deleteUser(id);
		if (a)
			return "出错";
		else
			return "OK";
	}

	@RequestMapping(value = "/all.do")
	@ApiOperation(httpMethod = "POST", value = "获取所有用户")
	public String getAllUsers() throws JsonProcessingException {
		List<User> users = userService.getUsers();
		ObjectMapper mappers = new ObjectMapper();
		return mappers.writeValueAsString(users);
	}

	@RequestMapping(value = "/insert.do")
	@ApiOperation(httpMethod = "POST", value = "新增用户")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", dataType = "String", name = "username", value = "用户名", required = true),
			@ApiImplicitParam(paramType = "query", dataType = "String", name = "password", value = "密码", required = true),
			@ApiImplicitParam(paramType = "query", dataType = "int", name = "classid", value = "班级id", required = true) })
	public String insertUser(UserInsertVO userinsertvo) throws UnsupportedEncodingException {
		int resu = userService.insertUser(userinsertvo);

		switch (resu) {
		case 1:
			return "ok";
		case 0:
			return "重新插入";
		default:
			return "gunchu wode conglin";
		}
	}


}
