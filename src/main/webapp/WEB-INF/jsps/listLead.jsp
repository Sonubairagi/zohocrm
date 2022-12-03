<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file ="menu.jsp" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Leads</title>
</head>
<body>
	<h1>List Of Leads</h1>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>source</th>
		</tr>
		<c:forEach items = "${leads}" var = "leads">
			<tr>
				<td><a href = "leadInfo?id=${leads.id}">${leads.firstName}</a></td>
				<td>${leads.lastName}</td>
				<td>${leads.email}</td>
				<td>${leads.mobile}</td>
				<td>${leads.source}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>