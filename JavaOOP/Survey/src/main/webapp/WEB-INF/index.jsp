<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action='/results' method='POST'>
	        <label for="name">Your Name:</label>
	        	<input type='text' name="name" id="name">
	        	<br>
	        <label for="location">Dojo Location:</label>
		        <select name="location" id="location">
		            <option value="SJO">SJO</option>
		            <option value="AZA">AZA</option>
		            <option value="STL">STL</option>
		        </select>
		        <br>
	        <label for="language">Favorite Language:</label>
		        <select name="language" id="language">
		            <option value="Java">Java</option>
		            <option value="Python">Python</option>
		            <option value="JavaScript">JavaScript</option>
		        </select>
		        <br>
	        <label for="comment">Comment(optional):</label>
	        	<textarea id="comment" name="comment"></textarea>
	        <input type="submit" value="Submit">
		</form>
</body>
</html>