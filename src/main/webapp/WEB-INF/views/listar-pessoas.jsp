<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="./base.jsp"%>

<div class="container mt-3">
	<div class="card card-custom-width-two">
		<div class="card-body">
			<h1 class="text-center">Pessoas Cadastradas</h1>
			<table class="table table-bordered table-striped">
				<thead>
					<tr>
						<th class="text-center">Nome</th>
						<th class="text-center">CPF</th>
						<th class="text-center">Data de Nascimento</th>
						<th class="text-center">Funcionário? S/N</th>
						<th class="text-center">Opções</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="pessoa" items="${pessoas}">
						<tr>
							<td class="align-middle">${pessoa.nome}</td>
							<td class="align-middle text-center">${pessoa.cpf}</td>
							<td class="align-middle text-center">${pessoa.dataNascimento}</td>
							<td class="align-middle text-center"><c:choose>
									<c:when test="${pessoa.funcionario}">
										Sim
									</c:when>
									<c:otherwise>
										Não
									</c:otherwise>
								</c:choose></td>
							<td class="align-middle text-center"><form:form
									method="POST" action="/arsolemtec/pessoas/remover/${pessoa.id}">
									<c:choose>
										<c:when test="${gerentesResponsaveis.contains(pessoa)}">
											<button type="submit" value="excluir" class="btn btn-danger"
												onclick="return exibirMensagem();">
												<i id="boot-icon" class="bi bi-trash"></i>
											</button>
										</c:when>
										<c:otherwise>
											<button type="submit" value="excluir" class="btn btn-danger"
												onclick="return confirmarExclusao();">
												<i id="boot-icon" class="bi bi-trash"></i>
											</button>
										</c:otherwise>
									</c:choose>
									<a href="/arsolemtec/pessoas/editar/${pessoa.id}"
										class="btn btn-primary"> <i id="boot-icon"
										class="bi bi-pencil-fill"></i>
									</a>
								</form:form></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<script>
	function confirmarExclusao() {
		return confirm("Tem certeza que deseja excluir esta pessoa?");
	}

	function exibirMensagem() {
		alert("Essa pessoa está atribuída ao cargo de gerente em algum projeto. \nAltere o gerente responsável no respectivo projeto e tente novamente.");
		return false;
	}
</script>
<jsp:include page="rodape.jsp" />