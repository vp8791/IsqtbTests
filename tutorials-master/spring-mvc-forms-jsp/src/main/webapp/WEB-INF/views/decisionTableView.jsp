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
			<td>Indian Resident :</td>
			<td>${indianResident}</td>
		</tr>
			
		<tr>
			<td>Marital Status :</td>
			<td>${married}</td>
		</tr>
		
		
		<tr>
			<td style="font-weight:bold">Issue MemberShip :</td>
			<td style="font-weight:bold">${issueMemberShip}</td>
		</tr>
		
		<tr>
			<td style="font-weight:bold">Offer 10% Discount:</td>
			<td style="font-weight:bold">${offer10PercentDiscount}</td>
		</tr>
		
			
	</table>
</body>
</html>