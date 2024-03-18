<%@page import="calculadora.Calculadora" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Soma números</title>
</head>
<body>
	<%
		Calculadora calc = new Calculadora();
	%>
	
	soma = <%=calc.Somar(2,3) %>
</body>
</html>