package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProdutoDAO;
import model.Produto;

/**
 * Servlet implementation class GerenciamentoProdutos
 */
@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
    	response.getWriter().print("done");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Produto produto = new Produto();
		ProdutoDAO produtoDAO = new ProdutoDAO();		
		produto.setNome(request.getParameter("nome"));
		produto.setPreco(Double.parseDouble(request.getParameter("preco")));
		produto.setQuantidadeEstoque(Integer.parseInt(request.getParameter("quantidadeEstoque")));
		produtoDAO.create(produto);
		response.getWriter().print("Produto "+produto.getNome() + " cadastrado com sucesso.");
	}

}
