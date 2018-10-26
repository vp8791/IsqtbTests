<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Black Box: Enter Residency Details</title>
</head>
<body>
	<h3>Black Box:: Enter Residency Details</h3>

	<form:form method="POST" action="${pageContext.request.contextPath}/makeDecision" modelAttribute="decisionTable">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			
			<tr>
				<td><form:label path="indianResident">Indian Resident</form:label></td>
				<td><form:checkbox path = "indianResident" /></td>
			</tr>
			
			<tr>
				<td><form:label path="married">Marital Status</form:label></td>
				<td><form:checkbox path = "married" /></td>
			</tr>
			
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>

</html>