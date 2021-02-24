<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Options</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styleSheet.css" />
</head>
<body>
	<form action="addTask" method="post">
		
		<input type="submit" value="Add Task">
	</form>
	<br>
	<form action="displayTask" method="post">
		
		<input type="submit" value="Diplay Task">
	</form>
	<br>
	<form action="deleteTask" method="post">
		
		<input type="submit" value="Delete Task">
	</form>
	<br>
	<form action="findTaskToUpdate" method="post">
	
		<input type="submit" value="Update Task">
	</form>
	<br>
	<form action = "ShowWelcome" method="post">
		<input type="submit" value="Return"><br><br>
	</form>
</body>
</html>