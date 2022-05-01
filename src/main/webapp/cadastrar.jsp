<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Cliente</title>
</head>
<body>
	<form action="ClientServlet" method="post">
		<table>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="nome"></td>
				</tr>
				<tr>
					<td>Endereco:</td>
					<td><input type="text" name="endereco"></td>
				</tr>
				<tr>
					<td>Modalidade:</td>
					<td><input type="text" name="modalidade"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Cadastrar">
						<input type="reset" value="Limpar">
					</td>
				</tr>
		</table>
	</form>
	<a href="index.html">Voltar</a>

</body>
</html>