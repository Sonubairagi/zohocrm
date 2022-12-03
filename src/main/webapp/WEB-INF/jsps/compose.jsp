<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
	<h1>Send Email</h1>
	<div>
		${msg}
	</div>
	<form action="sendEmail" method = "post">
		To <input type = "text" name = "to" value = "${email}"/><br>
		Subject <input type = "text" name = "subject"/><br>
		Message <textarea name = "message" rows="4" cols="50"></textarea><br>
		<input type = "submit" value = "Send"/>
	</form>
</body>
</html>