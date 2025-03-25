<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int tresMaiores[] = (int []) 
				session.getAttribute("tresMaiores");
%>


<html>
<head>
<meta charset="UTF-8">
<title>RESPOSTA</title>
</head>
<body style="margin:auto;">
	<h1 style="text-align: center">
		Os três maiores números são:
	</h1>
	<%
		for (int i: tresMaiores){
	%>
		<p align="center"><%=i %></p>
	<%
		}
	%>

</body>
</html>