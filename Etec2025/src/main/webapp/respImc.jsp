<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String imc = (String) session.getAttribute("imc");
%>


<html>
<head>
<meta charset="UTF-8">
<title>RESPOSTA</title>
</head>
<body>
	<h1 style="text-align: center">
		IMC = <%= imc%>
	</h1>
</body>
</html>