<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试@SessionAttributes注解</title>
</head>
<body>
访问request作用范围域中的user对象：${requestScope.user.username }<br>
访问session作用范围域中的user对象：${sessionScope.user.username }<br>
<br>
</body>
</html>