<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Update</title>
</head>
<body>
	<h2>Lead | Update</h2>
	<form action="UpdateLead" method="post">
		<pre>
			<input type="hidden" name="id" value="${lead.id}"/>
			firs tname<input type="text" name="firstName" value="${lead.firstName}"/>
			last name<input type="text" name="lastName" value="${lead.lastName}"/>
			email<input type="text" name="email" value="${lead.email}"/>
			mobile<input type="text" name="mobile" value="${lead.mobile}"/>
			<input type="submit" value="update"/>
		</pre>
	</form>
</body>
</html>