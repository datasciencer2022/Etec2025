<%@page import="java.util.TreeSet"%>
<%@page import="java.util.SortedSet"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	HttpSession sessao = request.getSession();
	Map<Integer, Integer> solucao = null;
	if (sessao.getAttribute("solucao") != null){
		solucao = (Map<Integer,Integer>) sessao.getAttribute("solucao");
	}
	
	String valorStr = "";
	if (sessao.getAttribute("valorStr") != null){
		valorStr = (String) sessao.getAttribute("valorStr");
	}
	
	String message = null;
	if (sessao.getAttribute("message") != null){
		message = (String) sessao.getAttribute("message");
	}

%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		.conteudo{
			display: flex; 
			flex-direction: column; 
			align-items: center; 
			justify-content: center;
		}
	</style>
</head>
<body>
	<div class="conteudo">
		<h1> <%= valorStr %> divididos em:</h1>
		<%if (solucao != null){ 
			SortedSet<Integer> keys = new TreeSet<>(solucao.keySet());
		%>
			<table border="1">
				<tr>
					<th colspan="2">Solução</th>
				</tr>
				<tr>
					<th>Nota</th>
					<th>Quantidade</th>
				</tr>
			<%for (int chave: keys){%>	
				<tr>
					<td align="center"><%= chave %></td>
					<td align="center"><%= solucao.get(chave) %></td>
				</tr>
			<%
			}
			%>
			</table>
			
		<%} %>
	</div>
	<br><br>
	<%if (message != null) { %>
		<div class="conteudo">
			<p align="center">
				<%= message %>
			</p>
		</div>
	<%} %>
</body>
</html>