<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.gerenciador.servlet.Empresa" %> <!-- Fazendo a importa��o da classe Empresa e do java.util.List para ser usado na parte logica do jsp -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Prefix: usado para pegar a tag da biblioteca -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> <!-- Importa��o da biblioteca fmt para uso das tags -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty empresa }">
		Empresa ${ empresa } cadastrada com sucesso! <!-- O sinal de "=" subistitui o println e imprime na tela -->
	</c:if>
	</br>
	Lista de empresas: </br>
	
	<ul> <!-- Define quais elementos ser�o utlizados para fazer o la�o, ler a lista de empresas-->
        <c:forEach items="${empresas}" var="empresa">
            <li>
            	${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> <!-- Formatando a data -->
            	<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">edita</a>
            	<a href="/gerenciador/removeEmpresa?id=${empresa.id}">remove</a> <!-- Link para a remo��o da empresa que chama o servlet removeEmpresa, o ? � para verificar se o nome da empresa  selecionada corresponde ao id -->
           	</li> 
        </c:forEach>
    </ul>
	
</body>
</html>