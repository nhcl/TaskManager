<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Task To Update</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styleSheet.css" />
</head>
<body>
<form action="processFindTaskToUpdate" method="post">
		<label for="taskId">Enter Task Id:</label>
		<input type="text" id="taskId" name="taskId"><br>
		<br>
		<input type="submit" value="Update">
		<br>
	</form>
	<br>
	<form action = "mainMenu" method="post">
		<input type="submit" value="Return"><br><br>
	</form>
	<br>
	<h4>${NotFoundTask}</h4>
	<h4>${UpdateTaskSuccess}</h4>
</body>
</html>