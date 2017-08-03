package com.spark.web;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class WXLoginAuthAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String execute() {

		return "success";

	}

	@SuppressWarnings("deprecation")
	public void redirect() {

		HttpServletResponse response = ServletActionContext.getResponse();

		String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxb4c7e9de3db7fe7a" + "&redirect_uri="
				+ URLEncoder.encode("http://b62fb529.ngrok.io/s2sh/wxLoginCallBackAction.action")
				+ "&response_type=code" + "&scope=snsapi_userinfo" + "&state=STATE#wechat_redirect";

		try {
			response.sendRedirect(url);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
