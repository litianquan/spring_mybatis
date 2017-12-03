<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试checkbox标签</title>
</head>
<body>
<h3>form:checkbox测试</h3>
<form:form modelAttribute="user" method="post" action="checkboxForm" >
	<table>
		<tr>
			<td>选择课程:</td>
			<td>
				<form:checkbox path="courses" value="JAVAEE" label="JAVAEE"/>&nbsp;
				<form:checkbox path="courses" value="Mybatis" label="Mybatis"/>&nbsp;
				<form:checkbox path="courses" value="Spring" label="Spring"/>&nbsp;
			</td>
		</tr>
	</table>
	<form:checkbox path="reader" value="true"/>已经阅读相关协议
</form:form>
</body>
</html>