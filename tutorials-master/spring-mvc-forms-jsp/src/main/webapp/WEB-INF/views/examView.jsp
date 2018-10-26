<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Black Box  Exam Results</title>
</head>
<body>

	<h2>Black Box Output: Student Exam Result</h2>
	<table>
		<tr>
			<td>Name :</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>Exam Marks :</td>
			<td>${examMarks}</td>
		</tr>
		<tr>
			<td style="font-weight:bold">Exam Result :</td>
			<td style="font-weight:bold">${result}</td>
		</tr>
	</table>
</body>
</html>