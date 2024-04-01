<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visualizar serviço</title>
</head>
<body>
	<h1>Detalhes do Serviço</h1>
    
    <div>
        <strong>Nome:</strong> ${service.name}<br>
        <strong>Descrição:</strong> ${service.description}<br>
        <strong>Preço:</strong> ${service.price}
    </div>
</body>
</html>