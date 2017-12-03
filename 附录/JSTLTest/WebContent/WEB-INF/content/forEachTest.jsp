<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>测试forEach标签</title>
<style> 
.table-b table tr td{border:1px solid;text-align:center; } 
</style> 
</head>
<body>
<div class="table-b"> 
<font color="red">普通循环</font><br>
<table width="400" border="0" cellspacing="0" cellpadding="0">
	<tr><td>index</td><td>count</td><td>isFirst</td><td>isLast</td></tr>
	<c:forEach begin="1" end="5" step="2" varStatus="vs">
		<tr align="center">
			<td>${vs.index}</td><td>${vs.count}</td>
			<td>${vs.first}</td><td>${vs.last}</td>
		</tr>
	</c:forEach>
</table>
<br>
<font color="red">遍历List集合元素是String</font><br>
<table width="400" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<c:forEach items="${requestScope.courseList }" var="course">
		 	<td>${course}</td>
		</c:forEach>
	</tr>
</table>
<br>
<font color="red">遍历List集合元素是对象</font><br>
<table width="400" border="0" cellspacing="0" cellpadding="0">
	<tr><td>编号</td><td>书名</td><td>作者</td></tr>
	<c:forEach items="${requestScope.bookList }" var="book">
		<tr>
			<td>${book.id}</td><td>${book.name}</td><td>${book.author}</td>
		</tr>
	</c:forEach>
</table>
<br>
<font color="red">遍历Map集合</font><br>
<table width="400" border="0" cellspacing="0" cellpadding="0">
	<tr><td>Key</td><td>编号</td><td>书名</td><td>作者</td></tr>
	<c:forEach items="${requestScope.bookMap }" var="entry">
		<tr>
			<td>${entry.key}</td><td>${entry.value.id}</td>
			<td>${entry.value.name}</td><td>${entry.value.author}</td>
		</tr>
	</c:forEach>
</table>

</div>
</body>
</html>