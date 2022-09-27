<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Resident here</title>
</head>
<body>
	<h2>Update Resident details</h2>
	<form action="updateResident" method="post">
	<table>
	<tr>
	<td><input type="hidden" name="id" value="${resident.id}"></td>
	</tr>
	<tr>
	<td>Name: <input type="text" name="Name" value="${resident.name}"></td>
	</tr>
	<tr>
	<td>City: <input type="text" name="City" value="${resident.city}"></td>
	</tr>
	<tr>
	<td>Age: <input type="text" name="Age" value="${resident.age}"></td>
	</tr>
	<tr>
	<td>Mobile: <input type="text" name="Mobile" value="${resident.mobile}"></td>
	</tr>
	<tr>
	<td>Email: <input type="text" name="Email" value="${resident.email}"></td>
	</tr>
	</table>
		<input type="submit" value="Update">
	</form>
	
</body>
</html>