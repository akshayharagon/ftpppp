<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
	<h2>Bill | Contact</h2>
	<form action="generateBill" method="post">
	<pre>
	Name<input type="text" name="name" value="${contact.name}">
	Mobile<input type="number" name="mobile" value="${contact.mobile}">
	Email<input type="text" name="email" value="${contact.email}">
	Product Name<input type="text" name="productName">
	Bill Amount<input type="text" name="billAmount">
	
	<input type="submit" value="Generate Bill">
	</pre>
	</form>
</body>
</html>