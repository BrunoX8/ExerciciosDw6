<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Serviços</title>
</head>
<body>
	<!-- criando uma tabela  -->
	<h1>Lista de Serviços</h1>
	
	<table border="1">
		<tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Descrição</th>
            <th>Preço</th>
        </tr>
        
        <c:forEach var="service" items="${services}">
        	<tr>
        		<td>${service.id}</td>
        		<td>${service.name}</td>
        		<td>${service.description}</td>
        		<td>${service.price}</td>
				<td>
                    <a href="serviceDetails.jsp?id=${service.id}">Detalhes</a>
                    <form action="scheduleSession" method="post">
                        <input type="hidden" name="serviceId" value="${service.id}">
                        <input type="submit" value="Agendar">
                    </form>
                </td>
        	</tr>
        </c:forEach>
	</table>
</body>
</html>