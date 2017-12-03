<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试EL运算符</title>
</head>
<body>
<h2>测试EL运算符</h2>
<hr>
<!-- 算术表达式 -->
1+1: ${1+1 }<br> <!-- 2 -->
10-5:${10-5 }<br><!-- 5 -->
2*2:${2*2 }<br><!-- 4 -->
10/5:${10/5 }<br><!-- 2 -->
10取模3:${10%3 }<br><!-- 1 -->
<!-- 关系表达式 -->
<hr>
1 = 1 : ${1==1}<br><!-- true -->
1 != 1 : ${1!=1}<br><!-- false -->
1 > 1 : ${1>1}<br><!-- false -->
1 < 1 : ${1<1}<br><!-- false -->
1 >= 1 : ${1>=1}<br><!-- true -->
1 <= 1 : ${1<=1}<br><!-- true -->
<!-- 逻辑表达式 -->
<hr>
true && true : ${true && true }<br><!-- true -->
true && false : ${true && false }<br><!-- false -->
true || true : ${true || true }<br><!-- true -->
true || false : ${true || false }<br><!-- true -->
<!-- empty运算符判断作用范围域中是否有该变量存在,然后再判断该变量是否为null或者空字符串-->
<%
	String abc = "a";
	pageContext.setAttribute("abc", abc);
	pageContext.setAttribute("user", null);
	pageContext.setAttribute("password", "");
%>
abc是否为空: ${empty abc }<br><!-- false -->
user是否为空: ${empty user }<br><!-- true -->
password是否为空: ${empty password }<br><!-- true -->
clazz是否为空: ${empty clazz }<br><!-- true -->
</body>
</html>