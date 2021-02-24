<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Task</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styleSheet.css" />
</head>
<body>
	<form action="processDeleteTask" method="post">
		<label for="taskId">Enter Task Id:</label>
		<input type="text" id="taskId" name="taskId"><br>
		<br>
		<input type="submit" value="Delete">
		<br>
	</form>
	<br>
	<form action = "mainMenu" method="post">
		<input type="submit" value="Return"><br><br>
	</form>
	<br>
	<h4>${deleteTaskSuccess}</h4>
	<h4>${deleteTaskFail}</h4>
</body>
</html>