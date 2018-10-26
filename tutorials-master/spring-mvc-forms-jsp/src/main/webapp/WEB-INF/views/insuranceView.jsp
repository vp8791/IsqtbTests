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
				<td>Existing Medical Conditions :</td>
				<td>${existingMedicalCondition}</td>
			</tr>

			<tr>
				<td>Smoker :</td>
				<td>${smoker}</td>
			</tr>

			<tr>
				<td>Skiing :</td>
				<td>${skiing}</td>
			</tr>

			<tr>
				<td style="font-weight: bold">Insure Person :</td>
				<td style="font-weight: bold">${insureperson}</td>
			</tr>

			<tr>
				<td style="font-weight: bold">Offer Discount:</td>
				<td style="font-weight: bold">${offerDiscount}</td>
			</tr>


		</table>
</body>
</html>