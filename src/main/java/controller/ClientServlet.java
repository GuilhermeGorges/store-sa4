package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import model.Cliente;

@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClientServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Cliente cliente = new Cliente();
		ClienteDAO clienteDAO = new ClienteDAO();
		
		cliente.setMatricula(Integer.parseInt(request.getParameter("matricula")));
		cliente.setNome(request.getParameter("nome"));
		cliente.setEndereco(request.getParameter("endereco"));
		cliente.setModalidade(request.getParameter("modalidade"));
		clienteDAO.update(cliente);

		response.getWriter().print("Cliente "+cliente.getNome() + " atualizado com sucesso.");
		response.sendRedirect("consultar.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		Cliente cliente = new Cliente();
		ClienteDAO clienteDAO = new ClienteDAO();
		cliente.setNome(request.getParameter("nome"));
		cliente.setEndereco(request.getParameter("endereco"));
		cliente.setModalidade(request.getParameter("modalidade"));
		clienteDAO.create(cliente);
		response.getWriter().print("Cliente "+cliente.getNome() + " cadastrado com sucesso.");		
	}

}
