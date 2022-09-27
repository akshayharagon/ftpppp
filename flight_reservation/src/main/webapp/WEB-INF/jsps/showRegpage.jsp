<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
<h2> Create new account</h2>
<form action="saveReg" method="post">
Name<input type="text" name="name">
Email<input type="text" name="email">
Password<input type="password" name="password">
<input type="submit" value="Save">
</form>

</body>
</html>