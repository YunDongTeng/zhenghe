package com.spark.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.spark.service.UserInfoService;

public class UserLoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserInfoService userInfoService;

	public String execute() {

		String updateResult;
		HttpServletRequest request = ServletActionContext.getRequest();

		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		String openId = request.getParameter("openid");

		int result = userInfoService.updateOpenId(userName, password, openId);

		updateResult = result > 0 ? "success" : "login";
		
		return updateResult;
	}

}
