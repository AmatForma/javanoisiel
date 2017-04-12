<!-- 
    Document   : session.jsp
    Created on : 6 avr. 2017, 11:19:10
    Author     : MHADJIRI-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> page Session</title>
    </head>
    <body>
        <%@ include file="menu.jsp" %>
        <div class="corps">
		
		
			<h1>Liste des sessions </h1>
	
	<table class="table">
		<thead class="thead-inverse">
		<tr>
			<th>nomFormation</th>
			<th>dateDebut</th>
			<th>dateFin</th>
                        <th> nbPlace</th>
		</tr>
		</thead>
		<c:forEach items="${sessions}" var="session">
			<tr>
				<td>${session.nomFormation}</td>
				<td>${session.dateDebut}</td>
				<td>${date.dateFin}</td>
                                <td>${session.nbPlace}</td>
			</tr>
		</c:forEach>
	</table>
	
	</div>
	
   
    </body>
</html>