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
	<a href="/dojo/new">Create new Dojo</a>
		<a href="/ninja/new">Create new  Ninja</a>
		<table>
			<thead>
				<th>Dojo Name</th>
				<th>Ninja Count</th>
			</thead>
			<tbody>
				<c:forEach var="dojo" items="${dojos}">
				<tr>
					<td><c:out value="${dojo.getName()}"/></td>
					<td><c:out value="${dojo.getNinjas().size()}"/></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>