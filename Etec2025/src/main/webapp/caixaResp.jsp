<%@page import="java.util.TreeSet"%>
<%@page import="java.util.SortedSet"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	HttpSession sessao = request.getSession();
	Map<Integer, Integer> primeiraSolucao = null;
	if (sessao.getAttribute("primeiraSolucao") != null){
		primeiraSolucao = (Map<Integer,Integer>) sessao.getAttribute("primeiraSolucao");
	}
	
	Map<Integer, Integer> segundaSolucao = null;
	if (sessao.getAttribute("segundaSolucao") != null){
		segundaSolucao = (Map<Integer,Integer>) sessao.getAttribute("segundaSolucao");
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
	<%if (primeiraSolucao == null){ %>
		<h1>Não foi possível calcular</h1>
	<%} else {
		SortedSet<Integer> keys = new TreeSet<>(primeiraSolucao.keySet());
	%>
		<table border="1">
			<tr>
				<th colspan="2">Solução 1</th>
			</tr>
			<tr>
				<th>Nota</th>
				<th>Quantidade</th>
			</tr>
		<%for (int chave: keys){%>	
			<tr>
				<td align="center"><%= chave %></td>
				<td align="center"><%= primeiraSolucao.get(chave) %></td>
			</tr>
		<%
		}
		%>
		</table>
		
	<%} %>
	
	<br><br><br>
	
	<%if (segundaSolucao != null){ 
			SortedSet<Integer> keys = new TreeSet<>(segundaSolucao.keySet());
	%>
		<table border="1">
			<tr>
				<th colspan="2">Solução 2</th>
			</tr>
			<tr>
				<th>Nota</th>
				<th>Quantidade</th>
			</tr>
		<%for (int chave: keys){%>	
			<tr>
				<td align="center"><%= chave %></td>
				<td align="center"><%= segundaSolucao.get(chave) %></td>
			</tr>
		<%
		}
		%>
		</table>
		
	<%} %>
	</div>
</body>
</html>