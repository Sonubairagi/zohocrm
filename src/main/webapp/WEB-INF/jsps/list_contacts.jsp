<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file ="menu.jsp" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
</head>
<body>
	<h1>Contacts</h1>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>source</th>
			<th>Bill</th>
		</tr>
		<c:forEach items = "${allContacts}" var = "allContacts">
			<tr>
				<td><a href = "allContacts?id=${allContacts.id}">${allContacts.firstName}</a></td>
				<td>${allContacts.lastName}</td>
				<td>${allContacts.email}</td>
				<td>${allContacts.mobile}</td>
				<td>${allContacts.source}</td>
				<td><a href = "bill?id=${allContacts.id}">Bill</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>