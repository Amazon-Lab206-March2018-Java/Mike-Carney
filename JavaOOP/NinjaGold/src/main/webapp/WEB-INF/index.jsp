<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
<%@include file="css/style.css" %>
</style>
</head>
<body>
			<h2>Your gold: <c:out value ="${gold}"/></h2>
        <div id="farm">
            <h2>Farm</h2>
            <h3>Earns 10-20 golds</h3>
            <form action="/farm" method="post">
                <input type="hidden" name="farm" value="farm" />
                <input type="submit" value="Find Gold!"/>
              </form>
        </div>
        <div id ="cave">
            <h2>Cave</h2>
            <h3>Earns 5-10 golds</h3>
            <form action="/cave" method="post">
                <input type="hidden" name="cave" value="cave" />
                <input type="submit" value="Find Gold!"/>
            </form>
        </div>
        <div id="house">
            <h2>House</h1></h2>
            <h3>Earns 2 - 5 golds</h3>
            <form action="/house" method="post">
                <input type="hidden" name="house" value="house" />
                <input type="submit" value="Find Gold!"/>
            </form>
        </div>
        <div id="casino">
            <h2>Casino</h2>
            <h3>Earns/takes 0-50 golds</h3>
            <form action="/casino" method="post">
                <input type="hidden" name="casino" value="casino" />
                <input type="submit" value="Find Gold!"/>
            </form>
        </div>
        <h3>Activities</h3>
        <div id="activity">
            <c:forEach var="act" items="${activity}">
            	<p><c:out value ="${act}"/></p>
            </c:forEach>
        </div>
		
		
		
	
</body>
</html>