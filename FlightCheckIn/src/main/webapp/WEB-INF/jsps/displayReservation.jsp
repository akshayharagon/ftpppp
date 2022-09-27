<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reseration Details</title>
</head>
<body>
<h2>Reservation Details</h2>
<h2>Passenger Details</h2>

Passenger Name: ${reservation.getPassenger().name}<br/>
Email: ${reservation.getPassenger().email}<br/>
Mobile No: ${reservation.getPassenger().mobile}<br/>
<h2>Flight Details</h2>

Airline: ${reservation.getFlight().operatingAirline}<br/>
Flight No: ${reservation.getFlight().flightNo}<br/>
Departure City: ${reservation.getFlight().departCity}<br/>
Arrival City: ${reservation.getFlight().arrivCity}<br/>
Date of Departure: ${reservation.getFlight().departureDate}<br/>

<h2>Update No of Bags & CheckIn Status</h2>
<form action ="proceedToCheckIn" method="post">
<pre>
Reservation Id<input type="text" name="id" value="${reservation.id}" readonly>
No Of Bags<input type="number" name="noOfBags">
<input type="submit" value="Confirm">
</pre>
</form>




</body>
</html>