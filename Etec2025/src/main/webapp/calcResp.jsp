<%@page import="pacote.UtilsData"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
LocalDate dtIni = (LocalDate) session.getAttribute("dtIni");
LocalDate dtFim = (LocalDate) session.getAttribute("dtFim");

int resp = (int) session.getAttribute("resp");
UtilsData utils = new UtilsData();
%>



<html>
<head>
<meta charset="UTF-8">
<title>Resposta da diferença entre datas</title>
</head>
<body>
<br><br>
	<table style="margin:auto;">
		<tr>
			<td colspan="2" align="center">
				<h1>Cálculo de diferença de datas</h1>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				&nbsp;
			</td>
		</tr>
		<tr>
			<td>
			Data Início:
			</td>
			<td>
			<%= utils.formataLocalDate(dtIni) %>
			</td>
		</tr>
		<tr>
			<td>
			Data Fim:
			</td>
			<td>
			<%= utils.formataLocalDate(dtFim) %>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				&nbsp;
			</td>
		</tr>
		<tr>
			<td>
			Diferença em dias:
			</td>
			<td>
			<%= resp %>
			</td>
		</tr>
	</table>
</body>
</html>