<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Contador e loop</title>
</head>
<body>
	<table>
	<%
		for(int i = 1; i <= 10; i++) {
	%>
	
		<tr>
			<td><%=i%></td>
		</tr>
		
		<% } %>
	</table>
</body>
</html>