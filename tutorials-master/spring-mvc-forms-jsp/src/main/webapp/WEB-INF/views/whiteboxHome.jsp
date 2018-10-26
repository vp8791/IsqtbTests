<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EnterX Y and Z Values</title>
</head>
<body>
	<h3>Enter X Y and Z Values</h3>

	<form:form method="POST" action="${pageContext.request.contextPath}/execute" modelAttribute="whitebox">
		<table>
			<tr>
				<td><form:label path="x">Enter X</form:label></td>
				<td><form:input path="x" /></td>
			</tr>
			<tr>
				<td><form:label path="y">Enter Y</form:label></td>
				<td><form:input path="y" /></td>
			</tr>
			<tr>
				<td><form:label path="z">Enter Z</form:label></td>
				<td><form:input path="z" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>

</html>