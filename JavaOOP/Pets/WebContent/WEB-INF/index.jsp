<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pets</title>
</head>
<body>
	<h1>Choose your dog!</h1>
		 <form action="/Pets/DogController" method="POST">
			 <p>Name<input type="text" name="name"></p>
			 <p>Breed<input type="text" name="breed"></p>
			 <p>Weight<input type="number" name="weight"></p>
			 <input type="submit" value="submit">
		 </form>
		 <h1>Which cat chooses you?</h1>
		 <form action="/Pets/CatController" method="POST">
		 	<p>Name<input type="text" name="name"></p>
		 	<p>Breed<input type="text" name="breed"></p>
		 	<p>Weight<input type="number" name="weight"></p>
		 	<input type="submit" name="submit">
		 </form>
</body>
</html>