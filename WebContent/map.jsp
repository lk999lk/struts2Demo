<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/map.action" method="post">
	<!-- 设置key的值map 
		设置value值
		-->
		username:<input type="text" name="map['one'].username"><br/>
		password:<input type="text" name="map['one'].password"><br/>
		address:<input type="text" name="map['one'].address"><br/>
	<br/><br/>
		username:<input type="text" name="map['abc'].username"><br/>
		password:<input type="text" name="map['abc'].password"><br/>
		address:<input type="text" name="map['abc'].address"><br/>

		<input type="submit" value="提交"/>
	</form>
</body>
</html>