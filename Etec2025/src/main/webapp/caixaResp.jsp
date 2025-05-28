<%@page import="java.util.TreeSet"%>
<%@page import="java.util.SortedSet"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	HttpSession sessao = request.getSession();
	Map<Integer, Integer> resp = null;
	if (sessao.getAttribute("resp") != null){
		resp = (Map<Integer,Integer>) sessao.getAttribute("resp");
	}
	
	String valorStr = "";
	if (sessao.getAttribute("valorStr") != null){
		valorStr = (String) sessao.getAttribute("valorStr");
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
	<%if (resp == null){ %>
		<h1>Não foi possível calcular</h1>
	<%} else {
		SortedSet<Integer> keys = new TreeSet<>(resp.keySet());
	%>
		<table border="1">
			<tr>
				<th>Nota</th>
				<th>Quantidade</th>
			</tr>
		<%for (int chave: keys){%>	
			<tr>
				<td><%= chave %></td>
				<td align="center"><%= resp.get(chave) %></td>
			</tr>
		<%}
		%>
		</table>
		
	<%} %>
	</div>
</body>
</html>