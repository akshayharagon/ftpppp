<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reserved Flight Details</title>
</head>
<body>

<h2>Flight Details</h2>
Flight Number:${flight.flightNo}</br>
Operating Airline:${flight.operatingAirline}</br>
Departure City:${flight.departCity}</br>
Arrival City:${flight.arrivCity}</br>
Departure Date:${flight.departureDate}</br>
Departure Time:${flight.estimatedDepartTime}

<h2>Enter Passenger Details</h2>

<form action="reserveFlight" method="post">
<pre>
Passenger Name:<input type="text" name="name">
Mobile:<input type="text" name="mobile">
Email:<input type="text" name="email">
Card No:<input type="text" name="cardNo">
Expiry Date:<input type="text" name="expDate">
CVV:<input type="password" name="cvv">
<input type="hidden" name="flightId" value="${flight.id}" >
<input type="submit" value="Book Flight">
</pre>
</form>
</body>
</html>