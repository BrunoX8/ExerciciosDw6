<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agendar sessão</title>
</head>
<body>
	<h1>Agendar Sessão</h1>
    
    <form action="ScheduleSessionServlet" method="post">
        <label for="serviceId">ID do Serviço:</label>
        <input type="text" id="serviceId" name="serviceId" required><br>
        
        <label for="date">Data:</label>
        <input type="date" id="date" name="date" required><br>
        
        <label for="time">Horário:</label>
        <input type="time" id="time" name="time" required><br>
        
        <input type="submit" value="Agendar">
    </form>
</body>
</html>