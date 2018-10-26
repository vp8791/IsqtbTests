<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>White Box: Exam Results</title>
</head>
<body>

	<h2>White Box Testing Results</h2>
	<table>
		<tr>
			<td>X :</td>
			<td>${x}</td>
		</tr>
		<tr>
			<td>Y :</td>
			<td>${y}</td>
		</tr>
		<tr>
			<td>Z :</td>
			<td>${z}</td>
		</tr>
		<tr>
			<td style="font-weight:bold">Output :</td>
			<td style="font-weight:bold">${output}</td>
		</tr>
	</table>
</body>
</html>