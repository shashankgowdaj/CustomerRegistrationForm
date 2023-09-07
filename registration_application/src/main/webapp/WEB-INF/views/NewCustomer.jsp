<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
<h2>Customer Registration</h2>
<form action="saveReg" method="post">
<pre>
first_name<input type="text" name="first_name"/>
last_name<input type="text" name="last_name"/>
street<input type="text" name="street"/>
address<input type="text" name="address"/>
city<input type="text" name="city"/>
state<input type="text" name="state"/>
email<input type="text" name="email"/>
phone<input type="text" name="phone"/>
<input type="submit" value="save"/>
</pre>

</form>
<%
if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
}
%>
</body>
</html>