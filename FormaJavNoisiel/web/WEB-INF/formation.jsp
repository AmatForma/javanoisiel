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
		
		
			<h1>Liste des Formation </h1>
	
	<table class="table">
		<thead class="thead-inverse">
		<tr>
			<th>Intitule</th>
			<th>Description</th>
			
		</tr>
		</thead>
		<c:forEach items="${formations}" var="formations">
			<tr>
				<td>${formations.intitule}</td>
				<td>${formations.description}</td>
				
			</tr>
		</c:forEach>
	</table>
	
	</div>
	
</body>
</html>