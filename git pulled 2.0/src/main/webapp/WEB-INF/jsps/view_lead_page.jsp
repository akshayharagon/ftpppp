<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>
<body>
	<h2>Lead | Create</h2>
	<form action="saveLead" method="post">
	<pre>
	Name<input type="text" name="name">
	Mobile<input type="number" name="mobile">
	Email<input type="text" name="email">
	Lead Source<select name="leadSource">
		<option value="TV">TV</option>
		<option value="News Paper">News Paper</option>
		<option value="Trade">Trade Show</option>
		<option value="radio">Radio</option>
		</select>
	Gender
	Male<input type="radio" name="gender" value="male">
	Female<input type="radio" name="gender" value="female">
	<input type="submit" value="Save">
	</pre>
	</form>
</body>
</html>