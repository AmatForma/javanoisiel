<%-- 
    Document   : candidature
    Created on : 10 avr. 2017, 16:28:18
    Author     : Amat
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Candidature</title>
</head>
<body>

 <%@include file="menu.jsp" %>

	<div class="corps">
		
		
			<h1>Liste des candidatures</h1>
	
	<table class="table">
		<thead class="thead-inverse">
		<tr>
			<th>idPersonne</th>
                        <th>idSession</th>
			<th>idEtatCandidature</th>
			<th>Date Candidature</th>
		</tr>

		</thead>
		<c:forEach items="${candidature}" var="candidature">
			<tr>
				<td>${candidature.idPersonne}</td>
                                <td>${candidature.idSession}</td>
				<td>${candidature.idEtatCandidature}</td>
				<td>${candidature.dateCandidature}</td>
			</tr>

		</c:forEach>
	</table>
	
	</div>
	
</body>
</html>