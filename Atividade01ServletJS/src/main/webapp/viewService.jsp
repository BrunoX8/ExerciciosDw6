<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visualizar servi�o</title>
</head>
<body>
	<h1>Detalhes do Servi�o</h1>
    
    <div>
        <strong>Nome:</strong> ${service.name}<br>
        <strong>Descri��o:</strong> ${service.description}<br>
        <strong>Pre�o:</strong> ${service.price}
    </div>
</body>
</html>