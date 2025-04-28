<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css"> 
<meta charset="UTF-8">
<title>Clientes</title>
<script type="text/javascript" src="js/javascript.js"></script>
</head>
<body>
	<div class="conteudo">
		<h1> Cadastro de Clientes</h1>
		<form method="post" action="./controle" name="formulario" 
			onsubmit="return validarCliente(document.formulario.cpf.value)">
			<table>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="nome" required></td>
				</tr>
				<tr>
					<td>CPF:</td>
					<td><input type="text" name="cpf" required></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="Enviar" required>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>