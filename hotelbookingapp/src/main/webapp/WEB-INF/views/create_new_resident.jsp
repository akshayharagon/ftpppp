<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel booking</title>
</head>
<body>
	<h2>Enter new Resident details</h2>
	<form action="saveResident" method="post">
	<table>
	<tr>
	<td>Name: <input type="text" name="Name"></td>
	</tr>
	<tr>
	<td>City: <input type="text" name="City"></td>
	</tr>
	<tr>
	<td>Age: <input type="text" name="Age"></td>
	</tr>
	<tr>
	<td>Mobile: <input type="text" name="Mobile"></td>
	</tr>
	<tr>
	<td>Email: <input type="text" name="Email"></td>
	</tr>
	</table>
		<input type="submit" value="Save">
	</form>
	
	${saveMsg}
</body>
</html>