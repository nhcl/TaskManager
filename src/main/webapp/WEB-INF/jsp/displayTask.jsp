<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Tasks</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styleSheet.css" />
</head>
<body>
	Here are the list of ToDos: ${task}
	<br>
	<br>
	<form action="mainMenu" method="post">
		<input type="submit"value="Return">
		<br>
	</form>
</body>
</html>