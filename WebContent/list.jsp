<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/list.action" method="post">
	<!-- list[0]：代表list集合中的第一个 user 对象 -->
		username:<input type="text" name="list[0].username"><br/>
		password:<input type="text" name="list[0].password"><br/>
		address:<input type="text" name="list[0].address"><br/>
	<br/><br/>
		username:<input type="text" name="list[1].username"><br/>
		password:<input type="text" name="list[1].password"><br/>
		address:<input type="text" name="list[1].address"><br/>

		<input type="submit" value="提交"/>
	</form>
</body>
</html>