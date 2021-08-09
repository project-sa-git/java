<%@ page language="java" contentType="text/html; charset=UTF-8" import= "ex.*" %>

<% Employee emp = new Employee("20", "takuya"); %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
	IDは<%= emp.getid() %>、 名前は<%= emp.getname() %>
</p>
</body>
</html>