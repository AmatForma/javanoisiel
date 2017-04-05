<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Connection</title>
<link rel="stylesheet" href="CSS/style.css">
</head>
<body>
	<div class="container">
		<div class="top">
			<h1 id="title" class="hidden"><span id="logo">AMAT JAVA <span></span></span></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>CONNEXION UTILISATEUR </h2>
			</div>
                    <form action="connexion" method="POST">
			<label for="username">Utilisateur</label>
			<br/>
                        <input type="text" name="login" id="username" placeholder="Entrez votre mail" required="required">
			<br/>
			<label for="password">Mot De Pass</label>
			<br/>
                        <input type="password" name="password" id="password" placeholder="Votre mot de passe" required="required">
			<br/>
			<button type="submit">Se connecter</button>
			<br/>
                    </form>
                    <p>${pwdFaux}</p>
			<a href="inscription"><p class="small">Inscrivez vous ?</p></a>
		</div>
	</div>
</body>
</html>