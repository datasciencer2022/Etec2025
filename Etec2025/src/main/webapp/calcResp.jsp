<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
LocalDate dtIniTmp = (LocalDate) session.getAttribute("dtIni");
LocalDate dtFimTmp = (LocalDate) session.getAttribute("dtFim");

Date dtIni = java.sql.Date.valueOf(dtIniTmp);
Date dtFim = java.sql.Date.valueOf(dtFimTmp);

int resp = (int) session.getAttribute("resp");

SimpleDateFormat sdf = 
new SimpleDateFormat("dd/MM/yy");
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
			<%= sdf.format(dtIni) %>
			</td>
		</tr>
		<tr>
			<td>
			Data Fim:
			</td>
			<td>
			<%= sdf.format(dtFim) %>
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