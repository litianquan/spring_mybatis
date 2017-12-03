<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试Validator接口验证</title>
</head>
<body>
<h3>登录页面</h3>
<!-- 绑定user -->
<form:form modelAttribute="user" method="post" action="login" >
	<table>
		<tr>
			<td>登录名:</td>
			<td><form:input path="loginname"/></td>
			<!-- 显示loginname属性的错误信息 -->
			<td><form:errors path="loginname" cssStyle= "color:red"/></td>
		</tr>
		<tr>
			<td>密码:</td>
			<td><form:input path="password"/></td>
			<!-- 显示password属性的错误信息 -->
			<td><form:errors path="password" cssStyle= "color:red"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"/></td>
		</tr>
	</table>
</form:form>
</body>
</html>