<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
	<c:if test="${not empty empresa }">
		Empresa ${ empresa } cadastrada com sucesso! <!-- O sinal de "=" subistitui o println e imprime na tela -->
	</c:if>
	<c:if test="${empty empresa }">
		Nenhuma empresa cadastrada!
	</c:if>
</body>
</html>