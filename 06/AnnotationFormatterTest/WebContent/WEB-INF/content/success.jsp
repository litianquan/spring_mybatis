<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试AnnotationFormatterFactory</title>
</head>
<body>
<h3>测试表单数据格式化</h3>
<form:form modelAttribute="user" method="post" action="" >
<table>
	<tr>
		<td>日期类型:</td>
		<td><form:input path="birthday"/></td>
	</tr>
	<tr>
		<td>整数类型:</td>
		<td><form:input path="total"/></td>
	</tr>
	<tr>
		<td>百分数类型:</td>
		<td><form:input path="discount"/></td>
	</tr>
	<tr>
		<td>货币类型:</td>
		<td><form:input path="money"/></td>
	</tr>
</table>
</form:form>
</body>
</html>