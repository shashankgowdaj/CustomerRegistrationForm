<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Customer</title>
</head>
<body>
<h2>Delete Customer Based On First_Name</h2>
<form action="DeleteReg" method="post">
<pre>
first_name<input type="text" name="first_name"/>

<input type="submit" value="Delete"/>
</pre>

</form>
<%
if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
}
%>
</body>
</html>