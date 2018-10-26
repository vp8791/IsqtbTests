<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Black Box:: Output</title>
</head>
<body>

	<h2>Black Box: Residency Output</h2>
	<table>
	
		<table>
		<tr>
			<td>Name :</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>Age :</td>
			<td>${age}</td>
		</tr>
		<tr>
			<td>Clean Driving Record :</td>
			<td>${cleandrivingrecord}</td>
		</tr>
			
		<tr>
			<td>On Businesss :</td>
			<td>${onbusiness}</td>
		</tr>
		
		
		<tr>
			<td style="font-weight:bold">Supply Rental Car :</td>
			<td style="font-weight:bold">${supplyrentalcar}</td>
		</tr>
		
		<tr>
			<td style="font-weight:bold">Premium Charge:</td>
			<td style="font-weight:bold">${premiumcharge}</td>
		</tr>
		
			
	</table>
</body>
</html>