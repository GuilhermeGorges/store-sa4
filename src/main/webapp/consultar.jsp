<%@page import="java.util.ArrayList"%>
<%@page import="dao.ClienteDAO"%>
<%@page import="model.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cliente cliente = new Cliente();
	ClienteDAO clienteDAO = new ClienteDAO();
	ArrayList<Cliente> listaClientes = new ArrayList<>();
	listaClientes = clienteDAO.read();
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
			<td style="width: :50px" align="center">Matricula</td>
			<td style="width: :100px" align="center">Nome</td>
			<td style="width: :50px" align="center">Endereco</td>
			<td style="width: :100px" align="center">Modalidade</td>
			<td style="width: :100px" align="center" colspan="2">Ações</td>
	<%for (int cont=0; cont<listaClientes.size(); cont++){ %>
		</tr>
			<td align="center"><%=listaClientes.get(cont).getMatricula()%></td>
			<td align="center"><%=listaClientes.get(cont).getNome()%></td>
			<td align="center"><%=listaClientes.get(cont).getEndereco()%></td>
			<td align="center"><%=listaClientes.get(cont).getModalidade()%></td>
			<td><a href="alterar.jsp?matricula=<%=listaClientes.get(cont).getMatricula()%>
										&nome=<%=listaClientes.get(cont).getNome()%>
										&endereco=<%=listaClientes.get(cont).getEndereco()%>
										&modalidade=<%=listaClientes.get(cont).getModalidade()%>">Alterar</a></td>

			<td><a href="excluir.jsp?matricula=<%=listaClientes.get(cont).getMatricula()%>">Excluir</a></td>
		</tr>
	<%} %>
	</table>
	<a href="index.html">Voltar</a>
</body>
</html>