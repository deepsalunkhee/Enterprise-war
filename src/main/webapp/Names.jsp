<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@ include file="Home.jsp"  %>
	<h2>Selected APP : Names </h2>
	<form action="names" method="post">
		<input type="text" name="name" placeholder="Name" /> 
		<input type="submit" value="Add" />
	</form>
	
	<p>${message}</p>
	
	
</body>
</html>