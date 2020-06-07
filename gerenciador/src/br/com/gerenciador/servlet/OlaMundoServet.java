package br.com.gerenciador.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi") // anotação que configura a execução, mapeamento para ler a requisição quando a mesma vier com a palavra oi e responde com as instruções do método
public class OlaMundoServet extends HttpServlet { // extendendo a classe atual de HttpSerlet
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException { //metodo recebe dois parametros para a requisição HTTP que é a requisição e a resposta
		
		PrintWriter out = resp.getWriter(); // atribui no response a estrutura html a seguir
		out.println("<html>"); // o println não escreve em console, mas sim no fluxo de resposta para o navegador e cria as tags html
		out.println("<body>");
		out.println("Olá mundo, você escreveu seu primeiro servlet.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Execução perfeita na console"); //exibe a mensagem no console do tomcat
	}
}
