<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Rentals</title>
</head>
<body>
	<h3>Black Box:: Enter Residency Details</h3>

	<form:form method="POST" action="${pageContext.request.contextPath}/makeCarRentalsDecision" modelAttribute="carrentals">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" /></td>
			</tr>
			
			
			<tr>
				<td><form:label path="cleandrivingrecord">Clean Driving Record</form:label></td>
				<td><form:checkbox path = "cleandrivingrecord" /></td>
			</tr>
			
			<tr>
				<td><form:label path="onbusiness">On Businesss</form:label></td>
				<td><form:checkbox path = "onbusiness" /></td>
			</tr>
			
			
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>

</html>