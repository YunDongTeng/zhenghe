
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<center>
			<form action="<%=request.getContextPath() %>/userLogin.action">
				用户名：<input type="text" name="username" id="username"></br>
				密码：<input type="password" name="password" id="password"></br>
				<input type="hidden" name="openid" id="openid" value="${openId}"></br>
				<input type="submit" value="登录"/>
			</form>
		</center>
	</h1>
</body>
</html>