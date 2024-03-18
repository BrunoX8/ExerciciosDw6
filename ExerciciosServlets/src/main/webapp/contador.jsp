<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contador</title>
</head>
<body>
	<%
		Integer contador = (Integer) session.getAttribute("contadorParm");
	%>
	
	<h1>Contador = <%= contador %></h1>
	
	<h1>Username = <%= request.getAttribute("user")  %></h1>
</body>
</html>