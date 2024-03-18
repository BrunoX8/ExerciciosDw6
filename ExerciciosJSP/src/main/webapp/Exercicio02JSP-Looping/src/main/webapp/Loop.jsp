<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Looping</title>
</head>
<body>
	<%
		for(int i = 1; i <= 10; i++)
		{
			out.println(i);
		}
	%>
</body>
</html>