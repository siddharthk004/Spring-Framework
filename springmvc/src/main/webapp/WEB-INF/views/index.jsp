<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" %>

<!Doctype html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h2>This is home page</h2>
<h1>Called by home controller</h1>
<%
    String name = (String) request.getAttribute("name");
 %>
 <h1>Name is <%=name%></h1>
</body>
</html> 