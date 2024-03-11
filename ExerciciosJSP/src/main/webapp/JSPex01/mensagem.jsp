<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mensagem de Boas-Vindas</title>
</head>
<body>
	<%
		String nome = request.getParameter("nome");
		if(nome != null && !nome.isEmpty())
		{
	%>
		<h1>Olá, <%= nome %>! Bem vindo!</h1>
	<%
		} else {
	%>
		<h1>Olá, visitante! Bem-vindo!</h1>
	<%
		}
	%>
	
</body>
</html>