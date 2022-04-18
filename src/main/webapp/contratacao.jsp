<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@  page import="model.Pessoa"%>
<%@ page import="java.util.ArrayList"%>
<% 
ArrayList<Pessoa> lista = (ArrayList<Pessoa>) request.getAttribute("candidato");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="icon" href="imagens/mala.png">
<link rel="Stylesheet" href="style.css">
</head>
<h1>Candidato</h1>
<a href="Novo.html" class="Botao1">Cadastro de vagas</a>

<body>
	<table id="tab">
		<thead>
			<tr>
				<th>nome</th>
				<th>sobrenome</th>
				<th>data de nascimento</th>
				<th>cpf</th>
				<th>idade</th>
				<th>maior idade</th>
				<th>vaga</th>
			</tr>
		</thead>
		<tbody>

			<%
			for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getNome()%></td>
				<td><%=lista.get(i).getSobrenome()%></td>
				<td><%=lista.get(i).getCpf()%></td>
				<td><%=lista.get(i).getDataNascimento()%></td>
				<td><%=lista.get(i).getIdade()%></td>
				<td><%=lista.get(i).getMaiorIdade()%></td>
				<td><%=lista.get(i).getVaga()%></td>
			</tr>
			<%
			}
			%>
			
		</tbody>
	</table>
</body>
</html>