<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ClientServlet" method="get">
		<table>
				<tr>
					<td>Matricula:</td>
					<td><input type="text" name="matricula" value="<%=request.getParameter("matricula")%>"></td>
				</tr>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="nome" value="<%=request.getParameter("nome")%>"></td>
				</tr>
				<tr>
					<td>Endereco:</td>
					<td><input type="text" name="endereco" value="<%=request.getParameter("endereco")%>"></td>
				</tr>
				<tr>
					<td>Modalidade:</td>
					<td><input type="text" name="modalidade" value="<%=request.getParameter("modalidade")%>"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Atualizar">
						<input type="reset" value="Resetar">
					</td>
				</tr>
		</table>
	</form>
	<a href="consultar.jsp">Consultar</a><br>
	<a href="index.html">Inicio</a>

</body>
</html>