<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align = "center">Sign Up</h1>
	<hr>
	
	<form action = "SignupServlet" method = "post">
	
	UserName : <input type = "text" name = "username"><br/><br/>
	Password : <input type = "password" name = "password"><br/><br/>
	First Name : <input type = "text" name = "fname"><br/><br/>
	Last Name : <input type = "text" name = "lname"><br/>
			<input type = "submit" value = "Sign Up"/>

	</form>

</body>
</html>