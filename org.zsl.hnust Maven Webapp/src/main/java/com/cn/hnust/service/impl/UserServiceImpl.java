package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public int deleteByPrimaryKey(User user) {

		return userDao.deleteByPrimaryKey(user);
	}

	public int insert(User user) {

		return userDao.insert(user);
	}

	public User selectByPrimaryKey(User user) {

		return userDao.selectByPrimaryKey(user);
	}

	public int updateByPrimaryKey(User user) {

		return userDao.updateByPrimaryKey(user);
	}

	public List<User> findList(User user) {
		return userDao.findList(user);
	}

}
