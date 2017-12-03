<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试checkboxes标签</title>
</head>
<body>
<h3>form:checkboxes测试</h3>
<form:form modelAttribute="user" method="post" action="checkboxesForm2" >
	<table>
		<tr>
			<td>选择课程:</td>
			<td>
				<form:checkboxes items="${courseMap}" path="courses"/>
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>