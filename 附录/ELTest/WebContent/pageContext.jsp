<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试pageContext隐式对象</title>
</head>
<body>
<h2>测试pageContext隐式对象</h2>
请求方式：${pageContext.request.method}<br>
请求方式：${pageContext["request"]["method"]}<br>
请求上下文路径：${pageContext.request.contextPath}<br>
请求上下文路径：${pageContext["request"]["contextPath"]}<br>
请求URL：${pageContext.request.requestURL}<br>
请求URL：${pageContext["request"]["requestURL"]}<br>
</body>
</html>