<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Bill</title>
</head>
<body>
	<h1>Generate Bill</h1>
	<hr>
	<div>
		${msg}
	</div>
	<form action="generateBill" method = "post">
		<pre>
			First Name <input type = "text" name = "firstName" value = "${contact.firstName}"/><br/>
			Last Name <input type = "text" name = "lastName" value = "${contact.lastName}"/><br/>
			Email <input type = "text" name = "email" value = "${contact.email}"/><br/>
			Mobile <input type = "text" name = "mobile" value = "${contact.mobile}"/><br/>
			Product <input type = "text" name = "product"/><br/>
			Amount <input type = "text" name = "amount"/><br/>
			<input type = "submit" value = "Generate Bill"/>
		</pre>
	</form>
</body>
</html>