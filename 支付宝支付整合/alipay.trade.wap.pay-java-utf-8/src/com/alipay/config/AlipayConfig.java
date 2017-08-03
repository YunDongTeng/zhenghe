package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016073100129708";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIv+9Xx35YyDjnM/UPtDdPmBQQnoZWHILUxSeabe4PM7yj97qcFeFls/W3tPUfG7XPRs92mxPs0+vkurNSna6UwLqVF8IRecT4Cj/XQ4prrf90uOOHVWUi5e8A2vTjENWWzfYno+p/ZAUChtwEJpEQ4zLR5+Hp42l6oz6YN/9ZCzAgMBAAECgYBp+uhCgs2O8yTK0DrxDB8opxXid0EQpibMqX8YuY9X84JnTqmzDhQknbEWh3TEaA+1piwioiCl5gLPa9vCRMvpNraJjKKBHINiRwO7wD9NiKzsTF9rrbJbDR0XTF/Af1Im9B2uIQiWvw2FhS56Mt2hrOYq/QPEl0Kyn5KmHVZUYQJBAOXucuOEHGeINKw8AxqdpqeXHgNGxuZ0qCu/qhdwhz84XIyS7E1Ps+x2YxGpl8ig1liVW7mriM0PQnOX78VBifECQQCb3ja3eCf2n97pE1dzr1vu4rA3dn94eiKB7c7oP0OiBMaLmQcz6M+L7B3hRuEGsumpoDVNNGMkMn+Bln/+HEDjAkEAg9Ub+mcdAh+OU9J01SXfD+gNRUOndysb4TmbhKT4Zr8iEVeMNSelucaHNvFOHbJaM6AvX12CqlA9gZlz2F2jgQJBAJrB4XX8uUEnrr2gVJ4qKI9hSDFpWFsYeRakNWFnHxHIyBFm2T3zE88LmwdHxrlN/q5KwWFseFtCQFM8SMzW5J0CQCcBNZd69KQOoSHRzcfmXTCqvIv+VvqTxLmI0ynpVN0eQ+Dq/dnBONd/ZcXWIRCHbOKvQBE2gbtMn6nF70yZ3vw=";

	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://www.baidu.com";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://www.baidu.com";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB+V9JilLqSa7N7sVqwpvv8zWChgXhX/A96hEg97Oxe6GKUmzaZRNh0cZZ88vpkn5tlgL4mH/dhSr3Ip00kvM4rHq9PwuT4k7z1DpZAf1eghK8Q5BgxL88d0X07m9X96Ijd0yMkXArzD7jg+noqfbztEKoH3kPMRJC2w4ByVdweWUT2PwrlATpZZtYLmtDvUKG/sOkNAIKEMg3Rut1oKWpjyYanzDgS7Cg3awr1KPTl9rHCazk15aNYowmYtVabKwbGVToCAGK+qQ1gT3ELhkGnf3+h53fukNqRH+wIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA";
}
