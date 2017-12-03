<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试EL的四个scope</title>
</head>
<body>
<h2>测试EL的四个scope</h2>
<%
	// 往jsp的四个scope中分别设置了一个名称为key的值
	pageContext.setAttribute("key", "pageContext"); // 页面
	request.setAttribute("key", "request");  // 请求
	session.setAttribute("key", "session");  // 会话
	application.setAttribute("key", "application"); // 上下文
%>
pageScope隐式对象取值：${pageScope.key}<br>
requestScope隐式对象取值：${requestScope.key}<br>
sessionScope隐式对象取值：${sessionScope.key}<br>
applicationScope隐式对象取值：${applicationScope.key}<br>
scope默认取值：${key}<br>
<h2>测试scope访问JavaBean</h2>
<jsp:useBean id="user" class="org.fkit.domain.User" scope="page"/>
用户名：${pageScope.user.username }<br>
部门名称：${pageScope.user.dept.name }<br>
</body>
</html>