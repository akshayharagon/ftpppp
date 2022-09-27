<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Entered Residents</title>
</head>
<body>
	<table>
	<tr>
		<th>Name</th>
		<th>City</th>
		<th>Age</th>
		<th>Mobile</th>
		<th>Email</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
	<c:forEach items="${residents}" var="resid">
	<tr>
		<td>${resid.name}</td>
		<td>${resid.city}</td>
		<td>${resid.age}</td>
		<td>${resid.mobile}</td>
		<td>${resid.email}</td>
		<td><a href="delete?id=${resid.id}">Delete</a></td>
		<td><a href="update?id=${resid.id}">Update</a></td>
	</tr>
	</c:forEach>	
	
	</table>
</body>
</html>