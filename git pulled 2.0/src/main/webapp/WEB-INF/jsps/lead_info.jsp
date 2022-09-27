<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="Menu.jsp" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>

	<h2>Lead | Info</h2>
	Name:${lead.name}<br/>
	Mobile:${lead.mobile}<br/>
	Email:${lead.email}<br/>
	Lead Source:${lead.leadSource}<br/>
	gender:${lead.gender}<br/>
	<form action="convertLead" method="post">
	<input type="hidden" name="id" value="${lead.id}">
	<input type="submit" value="Convert">
	</form>
</body>
</html>