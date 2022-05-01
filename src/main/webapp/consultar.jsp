<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="model.Produto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Produto produto = new Produto();
	ProdutoDAO produtoDAO = new ProdutoDAO();
	ArrayList<Produto> listaProdutos = new ArrayList<>();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consultar</title>
</head>
<body>
	<table border=1>
		<tr>
		<td style="width: :50px" align="center">ID</td>
		<td style="width: :50px" align="center">Nome</td>
		<td style="width: :50px" align="center">Preço</td>
		<td style="width: :50px" align="center">Quantidade</td>
		</tr>
	</table>
	<a href="index.html">Voltar</a>
</body>
</html>