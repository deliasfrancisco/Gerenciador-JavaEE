package br.com.gerenciador.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi") // anota��o que configura a execu��o, mapeamento para ler a requisi��o quando a mesma vier com a palavra oi e responde com as instru��es do m�todo
public class OlaMundoServet extends HttpServlet { // extendendo a classe atual de HttpSerlet
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException { //metodo recebe dois parametros para a requisi��o HTTP que � a requisi��o e a resposta
		
		PrintWriter out = resp.getWriter(); // atribui no response a estrutura html a seguir
		out.println("<html>"); // o println n�o escreve em console, mas sim no fluxo de resposta para o navegador e cria as tags html
		out.println("<body>");
		out.println("Ol� mundo, voc� escreveu seu primeiro servlet.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Execu��o perfeita na console"); //exibe a mensagem no console do tomcat
	}
}
