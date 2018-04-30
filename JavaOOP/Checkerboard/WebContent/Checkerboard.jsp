<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="static/style.css">
</head>
<body>
	<% int width = 0;%>
	<% int height = 0;%>
	<% if(request.getParameter("width") != null) { %>
		<% width = Integer.valueOf(request.getParameter("width")); %>
		<% } %>
	
	<% if(request.getParameter("height") != null) { %>
		<% height = Integer.valueOf(request.getParameter("height")); %>
		<% } %>
		
	<h1>Checkerboard</h1>
		<% for(int i=0; i<height; i++){%>
			<div class="main">
				<% for(int x=0; x<width; x++){%>
					<% if(i % 2 == 0){%>
						<% if(x % 2 == 0){%>
							<div class="black"></div>
						<%} else {%>
							<div class="red"></div>
						<%}%>
					<%} else {%>
						<% if(x % 2 == 0){%>
							<div class="red"></div>
						<%} else { %>
							<div class="black"></div>
							<%}%>
						<%}%>
					<%}%>
				<%}%>
			</div>
</body>
</html>