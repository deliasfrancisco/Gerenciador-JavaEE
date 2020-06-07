package br.com.gerenciador.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // metodo doPost e nativo do Java e aceita somente o envio de requisições post
		System.out.println("Cadastrando uma nova empresa");
		
		String nomeEmpresa = request.getParameter("nome"); //nome da requisição que vem no parametro
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //  Faz o parse da string para o tipo de data
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("empresa", empresa.getNome()); // insere na requisição o valor do nome da empresa para que possa ser usado no jsp, primeiro parametro nome para instancia e segundo com valor
		response.sendRedirect("listaEmpresas"); // ao cadastrar uma nova empresa o servlet responde ao cliente(navegador) um redirecionamento para o servlet que tem a lista de empresas
		
//		RequestDispatcher rq = request.getRequestDispatcher("/listaEmpresas"); // dispacha a requisição para o jsp e recebe na variavel do tipo RequestDispacher o que a pagina processou
//		request.setAttribute("empresa", empresa.getNome()); // insere na requisição o valor do nome da empresa para que possa ser usado no jsp
//		rq.forward(request, response); // passa a requisição e recebe a resposta
	}

}
