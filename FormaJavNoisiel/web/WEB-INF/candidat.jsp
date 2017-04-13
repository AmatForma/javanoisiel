<%-- 
    Document   : candidat
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
<title>Candidat</title>
</head>
<body>

 <%@include file="menu.jsp" %>

	<div class="corps">
		
		
			<h1>Liste des candidats</h1>
	
	<table class="table">
		<thead class="thead-inverse">
		<tr>
			<th>Nom</th>
                        <th>Prénom</th>
			<th>Description</th>
			<th>Date début</th>
                        <th>Date fin</th>
                        <th>Etat Candidature</th>
			<th>Date Candidature</th>
		</tr>

		</thead>
		<c:forEach items="${candidat}" var="candidat">
			<tr>
				<td>${candidat.nom}</td>
                                <td>${candidat.prenom}</td>
				<td>${candidat.description}</td>
				<td>${candidat.dateDebut}</td>
                                <td>${candidat.dateFin}</td>
                                <td>${candidat.intitule}</td>
				<td>${candidat.dateCandidature}</td>
			</tr>

		</c:forEach>
	</table>
	
	</div>
	
</body>
</html>