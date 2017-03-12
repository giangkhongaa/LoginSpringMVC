<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<spring:form method="post" commandName="acc" action="login.html">
	Username:	<spring:input path="user" />
		<br>
	PassWord:	<spring:input path="pass" />
		<br>
		<input type="submit" value="login">
	</spring:form>
	<center>
	<h2>Username right:</h2> ${acc.getUser()} <br>
	<h2>Password right:</h2> ${acc.getPass()}
	</center>
	${message}
</body>
</html>