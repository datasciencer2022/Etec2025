<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cálculo do IMC</title>
</head>
<body>
	<center>
			<h1>Cálculo do IMC</h1>
			<br><br>
			<h3>Entre com os seguintes dados:</h3>
			<form method="GET" action="./imc.do">
				<table border="10">
					<tr>
						<td>Altura: (em metros)</td>
						<td> 
							<input type="text" name="altura">
						</td>
					</tr>
					<tr>
						<td>Peso (em kilogramas): </td>
						<td> 
							<input type="text" name="peso">
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="Calcular">
						</td>
					</tr>
				</table>
			</form>
		</center>
</body>
</html>