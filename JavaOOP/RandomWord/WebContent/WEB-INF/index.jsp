<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Words</title>
</head>
<body>
	<h2><c:out value="${ word }"/></h2>
		<form action="" method="POST">
			<input type="submit" name="word" value="Generate">
		</form>
	<p>You have generated <c:out value="${ count }"/> words</p>
	<p>Your last word was generated at <c:out value="${ time_stamp }"/>
</body>
</html>