<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Home page</title>
</head>
<body>
<h1>Home page</h1>
<p>
Welcome to "Isqtb Testing".<br/>
<i>${message}</i><br/>

<!-- Black Box -->
<!--  
<h2>Black Box</h2>
<a href="${pageContext.request.contextPath}/employee/initial.html">Employee Salary</a><br/>
<a href="${pageContext.request.contextPath}/exams/initial.html">Exam Results</a><br/>
<br></br>
-->

<!-- Decision Tables -->
<h2>Decision Tables</h2>
<a href="${pageContext.request.contextPath}/decisionTable/initial.html">Decision Tree on Age/Residency/Married Status</a><br/>
<!--  
<a href="${pageContext.request.contextPath}/carRentals/initial.html">Decision Tree on Car Rentals</a><br/>
<a href="${pageContext.request.contextPath}/insurance/initial.html">Decision Tree on Insurances</a><br/>
-->
<br></br>

<!-- White Box  -->
<!--  
<h2>White Box</h2>
<a href="${pageContext.request.contextPath}/whiteBox/initial.html">Flow Chart</a><br/>
</p>
-->

</body>
</html>