<%@page import="dao.ClienteDAO"%>
<%@page import="model.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%
	Cliente cliente = new Cliente();
	ClienteDAO clienteDAO = new ClienteDAO();
	cliente.setMatricula(Integer.parseInt(request.getParameter("matricula")));
	clienteDAO.delete(cliente);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Excluir Cliente</title>
</head>
<body>
	<h1>Cliente excluido com sucesso!</h1>
	<a href="consultar.jsp">Voltar</a><br>
</body>
</html>