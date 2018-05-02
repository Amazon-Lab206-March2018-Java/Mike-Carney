<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Numba Game</title>
</head>
<body>
	<h1>Welcome to the Numba Game</h1>
	<p>Pick a Numba between 1-100!</p>
	<form action="index" method="POST">
		<input type="text" name="roll">
		<input type="submit" value="Submit">
	</form>
	<c:if test="${ roll == numb }">
		<p><c:out value="${ numb }"/> You got it!</p>
	</c:if>
	<form action="index" method="POST">
		<input type="hidden" name="reroll" value="true">
		<input type="submit" value="Try Again">
	</form>
	<c:if test="${ roll < numb }">
		<p>Too low!</p>
	</c:if>
	<c:if test="${ roll > numb }">
		<p>Too high!</p>
	</c:if>
</body>
</html>