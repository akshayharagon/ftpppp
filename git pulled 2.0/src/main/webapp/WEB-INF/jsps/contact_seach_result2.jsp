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
	<h2>Contact | Search Result</h2>
	<table>
	<tr>
		<th>Name</th>
		<th>email</th>
		<th>mobile</th>
		<th>Lead Source</th>
		<th>Gender</th>
		<th>Bill Contact</th>
		
	</tr>
	
	<c:forEach items="${conts}" var="cont">
		<tr>
		<td><a href="getContactById?id=${cont.id}">${cont.name}</a></td>
		<td>${cont.email}</td>
		<td>${cont.mobile}</td>
		<td>${cont.leadSource}</td>
		<td>${cont.gender}</td>
		<td><a href="generateBill?id=${cont.id}">Bill here</a></td>
	</tr>
	</c:forEach>
	
	</table>
</body>
</html>