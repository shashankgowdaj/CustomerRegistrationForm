<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login Here...</h1>
<form action="verifyLogin" method="post">
Login_id<input type="text" name="email"/>
Password<input type="password" name="password"/>
<input type="submit" value="login"/>
</form>
<%
if(request.getAttribute("error")!=null){
	out.println(request.getAttribute("error"));
}
%>
</body>
</html>