<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%@include file="menu.jsp" %>

	<div class="corps">
		
		
			<h1>Liste des personnes test test test test test test </h1>
	
	<table class="table">
		<thead class="thead-inverse">
		<tr>
			<th>Nom</th>
			<th>Mail</th>
			<th>Password</th>
		</tr>
		</thead>
		<c:forEach items="${membres}" var="membre">
			<tr>
				<td>${membre.nom}</td>
				<td>${membre.mail}</td>
				<td>${membre.password}</td>
			</tr>
		</c:forEach>
	</table>
	
	</div>
	
</body>
</html>