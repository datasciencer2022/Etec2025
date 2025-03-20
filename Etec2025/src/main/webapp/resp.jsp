<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String doc1 = (String) 
				session.getAttribute("doc1");
String doc2 = (String) 
				session.getAttribute("doc2");
%>


<html>
<head>
<meta charset="UTF-8">
<title>RESPOSTA</title>
</head>
<body>
	<h1 style="text-align: center">
		O documento1 solicitado foi: <%= doc1%>
	</h1>
	<h1 style="text-align: center">
		O(s) documento2(s) solicitado(s) foi(ram): <%= doc2%>
	</h1>
</body>
</html>