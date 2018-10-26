<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Black Box:: Employee Tax Details</title>
</head>
<body>

	<h2>Black Box: Output</h2>
	<table>
		<tr>
			<td>Name :</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>Salary :</td>
			<td>${salary}</td>
		</tr>
		<tr>
			<td style="font-weight:bold">Tax :</td>
			<td style="font-weight:bold">${tax}</td>
		</tr>
	</table>
</body>
</html>