<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> <!-- Importação da biblioteca fmt para uso das tags -->
<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Curso JSP Diego</title>
</head>
<body>


	<form action="${linkServletAlteraEmpresa}" method="post"> <!-- Apontando para a requisição que será feita no navegador quando for submitido o formulario -->
		
		Nome: <input type="text" name="nome" value="${empresa.nome} "/>
		Data abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>" />
		<input type="hidden" name="id" value="${empresa.id }"/>
		<input type="submit"/>
	</form>
</body>
</html>