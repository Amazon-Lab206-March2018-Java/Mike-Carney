<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<a href="/languages">Dashboard</a>
			<p><c:out value="${language.name}"/></p>
			<p><c:out value="${language.creator}"/></p>
			<p><c:out value="${language.version}"/></p>
		<a href="/languages/edit/<c:out value="${language.id}"/>">Edit</a>
		<a href="/languages/delete/<c:out value="${language.id}"/>">Delete</a>
</body>
</html>