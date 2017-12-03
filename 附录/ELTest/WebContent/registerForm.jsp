<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
<h2>注册页面</h2>
<form action="register.jsp" method="post">
	<table>
		<tr>
			<td>登录名：</td>
			<td><input type="text" name="loginname"></td>
		</tr>
		<tr>
			<td>选择课程：</td>
			<td>
				<input type="checkbox" name="courses" value="JAVAEE">JAVAEE&nbsp;
				<input type="checkbox" name="courses" value="Spring">Spring&nbsp;
				<input type="checkbox" name="courses" value="Mybatis">Mybatis&nbsp;
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"></td>
		</tr>
	</table>
</form>
</body>
</html>