<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>may tinh BMI</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/bmi/calculator">
		<label for="weight">Weight (kg): </label>
		<input type="number" id="weight" name="weight" required><br><br>
		<label for="height">Height (m): </label>
		<input type="number" step="0.01" id="height" name="height" required><br><br>
		<input type="submit" value="Calculate">
	</form>
</body>
</html>