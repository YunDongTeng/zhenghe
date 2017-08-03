package com.spark.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.ClientProtocolException;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.spark.service.UserInfoService;
import com.spark.util.HttpClientUtil;

import net.sf.json.JSONObject;

public class WXLoginCallBackAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private UserInfoService userInfoService;

	public String execute() throws ClientProtocolException, IOException {

		HttpServletRequest request = ServletActionContext.getRequest();

		String code = request.getParameter("code");

		System.out.println(code);
		String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + HttpClientUtil.APPID + "&secret="
				+ HttpClientUtil.APPSECRET + "&code=" + code + "&grant_type=authorization_code";

		JSONObject jsonObject = HttpClientUtil.doGet(url);

		String openid = jsonObject.getString("openid");
		String access_token = jsonObject.getString("access_token");

		System.out.println(openid);

		System.out.println(access_token);

		String userInfoUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=" + access_token + "&openid=" + openid
				+ "&lang=zh_CN";

		JSONObject userinfo = HttpClientUtil.doGet(userInfoUrl);

		// 1、没有自己的用户体系，直接使用微信用户信息
		/*
		 * request.setAttribute("userinfo", userinfo); System.out.println(userinfo);
		 */

		// 2、拥有自己的用户体系，和微信绑定
		String username = userInfoService.getUserName(openid);

		if (username == null) {
			request.setAttribute("openId", openid);
			return "login";
		} else {

			request.setAttribute("userinfo", userinfo);
			return "success";
		}

	}

}
