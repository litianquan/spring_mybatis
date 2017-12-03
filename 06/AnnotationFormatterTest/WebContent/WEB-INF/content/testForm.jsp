<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试AnnotationFormatterFactory	接口</title>
</head>
<body>
<h3>测试表单数据格式化</h3>
<form action="test" method="post">
     <table>
          <tr>
         	<td><label>日期类型: </label></td>
             <td><input type="text" id="birthday" name="birthday" ></td>
         </tr>
         <tr>
         	<td><label>整数类型: </label></td>
             <td><input type="text" id="total" name="total" ></td>
         </tr>
         <tr>
         	<td><label>百分数类型: </label></td>
             <td><input type="text" id="discount" name="discount" ></td>
         </tr>
         <tr>
         	<td><label>货币类型: </label></td>
             <td><input type="text" id="money" name="money" ></td>
         </tr>
         <tr>
             <td><input id="submit" type="submit" value="提交"></td>
         </tr>
     </table>
</form>
</body>
</html>