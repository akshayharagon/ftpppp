<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Details</title>
</head>
<body>
<h2> Flight Display Result</h2>

<table border="1">
	<tr>
		<th>Airlines</th>
		<th>Departure</th>
		<th>Arrival City</th>
		<th>Departure Time</th>
		<th>Select Flight</th>
	</tr>
	<c:forEach items="${flights}" var="flight">
		<tr>
		<td>${flight.operatingAirline}</td>
		<td>${flight.departCity}</td>
		<td>${flight.arrivCity}</td>
		<td>${flight.estimatedDepartTime}</td>
		<td><a href="selectflight?flightId=${flight.id}">Select</a></td>
	</c:forEach>
	
	</table>
</body>
</html>