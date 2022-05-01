<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Produto</title>
</head>
<body>
	<form action="ProdutoServlet" method="post">
		<table>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="nome"></td>
				</tr>
				<tr>
					<td>Preço:</td>
					<td><input type="text" name="preco"></td>
				</tr>
				<tr>
					<td>Quantidade Estoque:</td>
					<td><input type="text" name="quantidadeEstoque"></td>
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