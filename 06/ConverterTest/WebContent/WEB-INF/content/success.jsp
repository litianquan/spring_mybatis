<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试ConversionService</title>
</head>
<body>
登录名：${requestScope.user.loginname }<br>
生日：<fmt:formatDate value="${requestScope.user.birthday}" 
	pattern="yyyy年MM月dd日"/><br>
</body>
</html>