<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String nome = (String) session.getAttribute("nome");
	String cpf = (String) session.getAttribute("cpf");
%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css"> 
<meta charset="UTF-8">
<title>Clientes</title>
</head>
<body>
	<div class="conteudo">
		<h1>Confirmação de Cadastro de Clientes</h1>
		<p>O nome do cliente é: <%= nome %></p>
		<p>O cpf do cliente é: <%= cpf %></p>
	</div>
</body>
</html>