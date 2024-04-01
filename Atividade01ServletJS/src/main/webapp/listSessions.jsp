<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Sessões</title>
</head>
<body>
	<h1>Lista de Sessões Agendadas</h1>
	
	<% int serviceId = Integer.parseInt(request.getParameter("id")); %>
	
	<% List<Session> sessions = getSessionListForService(serviceId); %>
	
	<% if (!sessions.isEmpty()) { %>
        <table border="1">
            <tr>
                <th>ID da Sessão</th>
                <th>Data</th>
                <th>Horário</th>
            </tr>
            <c:forEach var="session" items="${sessions}">
                <tr>
                    <td>${session.id}</td>
                    <td>${session.date}</td>
                    <td>${session.time}</td>
                </tr>
            </c:forEach>
        </table>
    <% } else { %>
        <p>Nenhuma sessão agendada para este serviço.</p>
    <% } %>
</body>
</html>