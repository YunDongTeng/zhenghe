package com.spark.service;

public interface UserInfoService {
	String getUserName(String openid);

	int updateOpenId(String username, String password, String openid);
}
