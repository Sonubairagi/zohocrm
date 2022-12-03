<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
	<h1>Create Lead</h1>
	<form action="saveLead" method = "post">
		First Name : <input type = "text" name = "firstName"/><br>
		Last Name : <input type = "text" name = "lastName"/><br>
		Email : <input type = "text" name = "email"/><br>
		Mobile : <input type = "text" name = "mobile"/><br>
		source : <select name = "source">
					<option>radio</option>
					<option>news paper</option>
					<option>trade</option>
					<option>other</option>
				</select><br>
				<input type = "submit" value = "save"/>
	</form>
</body>
</html>