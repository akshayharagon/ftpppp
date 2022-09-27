<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights</title>
</head>
<body>
<h2>Search Flights Here</h2>
<form action="searchFlight" method="post">
From:<input type="text" name="from">
To:<input type="text" name="to">
Date of Dearture:<input type="text" name="departureDate">
<input type="submit" name="Search">
</form>
</body>
</html>