<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试EL隐式对象</title>
</head>
<body>
<h2>测试EL隐式对象</h2>
param隐式对象获取单个参数：${param.loginname}<br>
paramValues隐式对象获取多个参数：${paramValues.courses[0]}-${paramValues.courses[1]}-${paramValues.courses[2]}<br>
header隐式对象获取标题：${header.connection}<br>
header隐式对象获取标题：${header["accept-language"]}<br>
headerValues隐式对象获取标题：${headerValues["accept-language"][0]}<br>
cookie隐式对象获取JSESSIONID对象：${cookie.JSESSIONID}<br>
cookie隐式对象获取JSESSIONID对象的名称：${cookie.JSESSIONID.name}<br>
cookie隐式对象获取JSESSIONID对象的值：${cookie.JSESSIONID.value}<br>
initParam隐式对象获取：${initParam.username}<br>
</body>
</html>