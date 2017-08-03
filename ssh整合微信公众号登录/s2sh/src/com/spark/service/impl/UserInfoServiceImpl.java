package com.spark.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spark.dao.UserInfoDao;
import com.spark.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public String getUserName(String openid) {
		return userInfoDao.getUserName(openid);
	}

	@Override
	public int updateOpenId(String username, String password, String openid) {
		return userInfoDao.updateOpenId(username, password, openid);
	}

}
