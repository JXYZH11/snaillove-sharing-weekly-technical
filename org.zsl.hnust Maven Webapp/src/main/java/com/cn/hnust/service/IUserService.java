package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface IUserService {
	List<User> findList(User user);
	
	int deleteByPrimaryKey(User user);

	int insert(User user);

	User selectByPrimaryKey(User user);

	int updateByPrimaryKey(User user);
}
