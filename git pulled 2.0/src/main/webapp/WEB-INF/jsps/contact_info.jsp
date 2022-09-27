<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="Menu.jsp" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info</title>
</head>
<body>

	<h2>Contact | Info</h2>
	Name:${contact.name}<br/>
	Mobile:${contact.mobile}<br/>
	Email:${contact.email}<br/>
	Lead Source:${contact.leadSource}<br/>
	gender:${contact.gender}<br/>

</body>
</html>