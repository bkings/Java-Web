<%@page import="com.webdemo.models.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1 align = "center">List</h1>
	<hr>
	
	<table align = "center" cellpadding = "1px;" width = "100%">
	
		<tr bgcolor = "yellow">
			<td>First Name</td>
			<td>Last Name</td>
			<td>User Name</td>
			<td>Password</td>
		</tr>
	
	<%		// for java codes
	
			List<User> ulist = (List<User>)request.getAttribute("ulist");
			
			for(User u : ulist){
				
			%>	
		<tr bgcolor = "skyblue">
			<td><%= u.getFname() %></td>
			<td><%= u.getLname() %></td>
			<td><%= u.getUsername() %></td>
			<td><%= u.getPassword() %></td>
		</tr>
				
							
							<%}%>
	</table>
	
	<a href = "logout">Logout</a>

</body>
</html>