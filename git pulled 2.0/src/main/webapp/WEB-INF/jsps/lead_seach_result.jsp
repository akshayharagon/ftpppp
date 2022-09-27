<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="Menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Result</title>
</head>
<body>
	<h2>Lead | Search Result</h2>
	<table>
	<tr>
		<th>Name</th>
		<th>email</th>
		<th>mobile</th>
		<th>Gender</th>
		<th>Lead Source</th>
		
	</tr>
	
	<c:forEach items="${leads}" var="lead">
		<tr>
		<td><a href="/getLeadById?id=${lead.id}">${lead.name}</a></td>
		<td>${lead.email}</td>
		<td>${lead.mobile}</td>
		<td>${lead.leadSource}</td>
		<td>${lead.gender}</td>
	</tr>
	</c:forEach>
	
	</table>
</body>
</html>