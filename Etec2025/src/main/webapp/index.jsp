<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Solicitação de documentos</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/javascript.js"></script>
</head>
<body>
	<h1 style="text-align: center">
		Solicitação de Documentos
	</h1>
	<form method="post" action="./servlet.do"
	     onsubmit="return checarNumDocs()">
	  <table>
		<tr>
			<td>Documento 1:</td>
			<td>
					<input name = "doc1" type = "radio" value="nascimento" required>Nascimento<br>
					<input name = "doc1" type = "radio" value="casamento">Casamento<br>
					<input name = "doc1" type = "radio" value="divorcio">Divórcio
			</td>
		</tr>
		<tr>
			<td>Documento 2:</td>
			<td>
					<input name = "doc2[]" type = "checkbox" value="nascimento">Nascimento<br>
					<input name = "doc2[]" type = "checkbox" value="casamento">Casamento<br>
					<input name = "doc2[]" type = "checkbox" value="divorcio">Divórcio
			</td>
			<td>
				<p class="mensagem">Escolha pelo menos 2 documentos desse item</p>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Enviar">
			</td>
		</tr>
	  </table>
	</form>
</body>
</html>