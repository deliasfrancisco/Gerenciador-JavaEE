package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPeloId(id);
		System.out.println(empresa.getNome());
		
		request.setAttribute("empresa", empresa); // 1º nome de instancia, 2º variavel
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");// caminho para onde será dispachada a requisição
		rd.forward(request, response); // levando os dados para a pagina
	}

}
