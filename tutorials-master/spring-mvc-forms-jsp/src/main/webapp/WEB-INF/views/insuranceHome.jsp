<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Rentals</title>
</head>
<body>
	<h3>Black Box:: Enter Medical Conditions, Medical and Skiing</h3>

	<form:form method="POST" action="${pageContext.request.contextPath}/makeInsuranceDecision" modelAttribute="insurance">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
		
			
			<tr>
				<td><form:label path="existingMedicalCondition">Existing Medical Condition</form:label></td>
				<td><form:checkbox path = "existingMedicalCondition" /></td>
			</tr>
			
			<tr>
				<td><form:label path="smoker">Smoker</form:label></td>
				<td><form:checkbox path = "smoker" /></td>
			</tr>
			
			
			<tr>
				<td><form:label path="skiing">Skieng</form:label></td>
				<td><form:checkbox path = "skiing" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>

</html>