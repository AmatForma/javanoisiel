<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	
	<div class="corps">
            <h1> Bonjour ${membre.mail} ${membre.getNom()} </h1>
        </div>
</body>
</html>