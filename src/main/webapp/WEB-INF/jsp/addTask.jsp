<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Tasks</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styleSheet.css" />
</head>
<body>
	<p>Please enter the details of your task:</p>
	
	<form action = "addTaskToTable" method="post">    
	    <label for="taskName">Task Name:</label>
	    <input type="text" id="taskName" name="taskName"><br><br>
	    
	    <label for="startDate">Start Date:</label>
	    <input type="date" id="startDate" name="startDate"><br><br>
	    
	    <label for="endDate">End Date:</label>
	    <input type="date" id="endDate" name="endDate"><br><br>
	    
	    <label for="description">Description:</label>
	    <textarea id="description" name="description" rows="4" cols="50">
		</textarea><br><br>
		
	    <label for="email">Email:</label>
	    <input type="text" id="email" name="email"><br><br>
	    
	    <label for="severity">Severity:</label>
	    <select name="severity" id="severity">
	        <option value="high">High</option>
	        <option value="medium">Medium</option>
	        <option value="low">Low</option>
	    </select> <br><br>
	    
	    <input type="submit" value="Submit"><br><br>
	<!--     <input type="reset" value="Reset"><br><br> -->
	</form>
	<br>
	<form action = "mainMenu" method="post">
		 <input type="submit" value="Return">
	</form>
	<br><br>
	<h4>${successAdd}</h4>
	<h4>${UserId}  ${Id}</h4>
	
</body>
</html>