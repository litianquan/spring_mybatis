<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试接收XML格式的数据</title>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	sendxml();
});

function sendxml(){
	var xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><book><id>1</id><name>疯狂Java讲义</name><author>李刚</author></book>";
	$.ajax("${pageContext.request.contextPath}/sendxml",// 发送请求的URL字符串。
			{
   			type : "POST", //  请求方式 POST或GET
		   contentType:"application/xml", //  发送信息至服务器时的内容编码类型
		   // 发送到服务器的数据。
		   data: xmlData,
		   async:  true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
	});
}
</script>
</head>
<body>

</body>
</html>