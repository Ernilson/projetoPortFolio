<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<img src="${pageContext.request.contextPath}/imagens/logo.jpg" alt="AR - Soluções em Tecnologia" class="logo-cabecalho">
	</div>
		<div class="card-body text-center mt-3">
			<a href="${pageContext.request.contextPath}/pessoas/novo"
				class="btn btn-primary">Cadastrar Pessoa</a>			
			<a href="${pageContext.request.contextPath}/pessoas/listar"
				class="btn btn-primary">Pessoas Cadastradas</a>
			<a href="${pageContext.request.contextPath}/projetos/novo"
				class="btn btn-primary">Cadastrar Projeto</a>		
			<a href="${pageContext.request.contextPath}/projetos/listar"
				class="btn btn-primary">Projetos Cadastrados</a>
		</div>	
</body>
</html>