<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Sess�es</title>
</head>
<body>
	<h1>Lista de Sess�es Agendadas</h1>
	
	<% int serviceId = Integer.parseInt(request.getParameter("id")); %>
	
	<% List<Session> sessions = getSessionListForService(serviceId); %>
	
	<% if (!sessions.isEmpty()) { %>
        <table border="1">
            <tr>
                <th>ID da Sess�o</th>
                <th>Data</th>
                <th>Hor�rio</th>
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
        <p>Nenhuma sess�o agendada para este servi�o.</p>
    <% } %>
</body>
</html>