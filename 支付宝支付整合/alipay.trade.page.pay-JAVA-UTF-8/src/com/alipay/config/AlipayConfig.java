package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016073100129708";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIv+9Xx35YyDjnM/UPtDdPmBQQnoZWHILUxSeabe4PM7yj97qcFeFls/W3tPUfG7XPRs92mxPs0+vkurNSna6UwLqVF8IRecT4Cj/XQ4prrf90uOOHVWUi5e8A2vTjENWWzfYno+p/ZAUChtwEJpEQ4zLR5+Hp42l6oz6YN/9ZCzAgMBAAECgYBp+uhCgs2O8yTK0DrxDB8opxXid0EQpibMqX8YuY9X84JnTqmzDhQknbEWh3TEaA+1piwioiCl5gLPa9vCRMvpNraJjKKBHINiRwO7wD9NiKzsTF9rrbJbDR0XTF/Af1Im9B2uIQiWvw2FhS56Mt2hrOYq/QPEl0Kyn5KmHVZUYQJBAOXucuOEHGeINKw8AxqdpqeXHgNGxuZ0qCu/qhdwhz84XIyS7E1Ps+x2YxGpl8ig1liVW7mriM0PQnOX78VBifECQQCb3ja3eCf2n97pE1dzr1vu4rA3dn94eiKB7c7oP0OiBMaLmQcz6M+L7B3hRuEGsumpoDVNNGMkMn+Bln/+HEDjAkEAg9Ub+mcdAh+OU9J01SXfD+gNRUOndysb4TmbhKT4Zr8iEVeMNSelucaHNvFOHbJaM6AvX12CqlA9gZlz2F2jgQJBAJrB4XX8uUEnrr2gVJ4qKI9hSDFpWFsYeRakNWFnHxHIyBFm2T3zE88LmwdHxrlN/q5KwWFseFtCQFM8SMzW5J0CQCcBNZd69KQOoSHRzcfmXTCqvIv+VvqTxLmI0ynpVN0eQ+Dq/dnBONd/ZcXWIRCHbOKvQBE2gbtMn6nF70yZ3vw=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://www.baidu.com";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://www.baidu.com";

	// 签名方式
	public static String sign_type = "RSA";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	//public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
		
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

