<%-- 
    Document   : userdash.jsp
    Created on : Jan 14, 2025, 5:13:28 PM
    Author     : LENOVO
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Welcome to Parking Management System</h1>
    <form action="bookingServlet" method="GET">
        <label for="location">Choose Location:</label>
        <select id="location" name="location">
            <option value="Location1">Location 1</option>
            <option value="Location2">Location 2</option>
        </select><br><br>
        
        <label for="date">Select Date:</label>
        <input type="date" id="date" name="date"><br><br>
        
        <label for="time">Select Time:</label>
        <input type="time" id="time" name="time"><br><br>
        
        <input type="submit" value="Check Availability">
    </form>
    </body>
</html>
