<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试options标签</title>
</head>
<body>
<h3>使用form:options标签items属性绑定Map</h3>
<form:form modelAttribute="user" method="post" action="selectForm" >
	<table>
		<tr>
			<td>学历:</td>
			<td>
				<form:select path="deptId">
					<form:options items="${deptMap}"/>
				</form:select>
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>