<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Curso JSP Diego</title>
</head>
<body>


	<form action="${linkServletNovaEmpresa}" method="post"> <!-- Apontando para a requisição que será feita no navegador quando for submitido o formulario -->
		
		Nome: <input type="text" name="nome"/>
		Data abertura: <input type="text" name="data"/>
		
		<input type="submit"/>
	</form>
</body>
</html>