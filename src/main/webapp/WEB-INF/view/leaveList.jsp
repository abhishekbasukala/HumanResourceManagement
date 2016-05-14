<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leave Application</title>
</head>
<body>
<h1>Requested Leave</h1>
	<table>
	<c:forEach var="leave" items="${leaves}">
	<tr>
		<td>${leave.leaveType}</td>
		<td>${leave.description}</td>
		<td>${leave.noOfLeaveDays}</td>
		<td><a href="books/${leave.leaveId}">edit</a></td>
	</tr>
	</c:forEach>
	</table>
	
	<a href="applyLeave.html"> Apply for Leave</a>
</body>
</html>