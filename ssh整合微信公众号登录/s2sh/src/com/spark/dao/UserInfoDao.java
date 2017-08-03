package com.spark.dao;

public interface UserInfoDao {

	String getUserName(String openid);

	int updateOpenId(String username, String password, String openid);

}
