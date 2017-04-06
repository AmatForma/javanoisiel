<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap core CSS -->
        <link href="RESSOURCE/bootstrap/css/bootstrap.css" rel="stylesheet">

        <!-- Font Awesome CSS -->
        <link href="RESSOURCE/fonts/font-awesome/css/font-awesome.css" rel="stylesheet">

        <!-- Plugins -->
        <link href="RESSOURCE/css/animations.css" rel="stylesheet">

        <!-- Worthy core CSS file -->
        <link href="RESSOURCE/css/style.css" rel="stylesheet">

        <!-- Custom css --> 
        <link href="RESSOURCE/css/custom.css" rel="stylesheet">

        <title>Acceuil</title>
        <link href="CSS/menustyle.css" rel="stylesheet">

        <title>Insert title here</title>
    </head>
    <body>
        
        <div class="footer section">
            <div class="container">
                <h1 class="title text-center" id="contact">Page D'inscription </h1>
                <div class="space"></div>
                <div class="row">
                    
                    
                    <div class="col-sm-6">
            <div class="footer-content">
                <p class="large">Merci de remplir tous les champs</p>
                <ul class="list-icons">
                    <li><i class="fa fa-copyright pr-10"></i> www.joelbpro.com </li>
                </ul>
                <ul class="social-links">
<!--                    <li class="facebook"><a target="_blank" href=""><i class="fa fa-facebook"></i></a></li>
                    <li class="twitter"><a target="_blank" href=""><i class="fa fa-twitter"></i></a></li>
                    <li class="googleplus"><a target="_blank" href=""><i class="fa fa-google-plus"></i></a></li>
                    <li class="skype"><a target="_blank" href=""><i class="fa fa-skype"></i></a></li>
                    <li class="linkedin"><a target="_blank" href=""><i class="fa fa-linkedin"></i></a></li>
                    <li class="youtube"><a target="_blank" href=""><i class="fa fa-youtube"></i></a></li>
                    <li class="flickr"><a target="_blank" href=""><i class="fa fa-flickr"></i></a></li>
                    <li class="pinterest"><a target="_blank" href=""><i class="fa fa-pinterest"></i></a></li>-->
                </ul>
            </div>
        </div>


        <div class="col-sm-6">
            <div class="footer-content">
                <form action="inscription" method="post" role="form" id="footer-form">
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="name2">Prenom </label>
                        <input type="text" class="form-control" id="name2" placeholder="Prenom" name="prenom" required>
                        <i class="fa fa-user form-control-feedback"></i>
                    </div>
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="name2">Nom </label>
                        <input type="text" class="form-control" id="name2" placeholder="Nom" name="nom" required>
                        <i class="fa fa-user form-control-feedback"></i>
                    </div>
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="email2">Adress Email</label>
                        <input type="email" class="form-control" id="email2" placeholder="Entrer L'Email" name="mail" required>
                        <i class="fa fa-envelope form-control-feedback"></i>
                    </div>
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="email2">Adresse Rue</label>
                        <input type="email" class="form-control" id="email2" placeholder="Rue" name="adresse" required>
                        <i class="fa fa-map-marker form-control-feedback"></i>
                    </div>
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="email2">Code Postal</label>
                        <input type="email" class="form-control" id="email2" placeholder="Code Postal" name="codePostal" required>
                        <i class="fa fa-map-marker form-control-feedback"></i>
                    </div>
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="email2">Ville</label>
                        <input type="email" class="form-control" id="email2" placeholder="Ville" name="ville" required>
                        <i class="fa fa-map-marker form-control-feedback"></i>
                    </div>
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="email2">Mot de passe</label>
                        <input type="email" class="form-control" id="email2" placeholder="Mot de passe" name="password" required>
                        <i class="fa fa-pencil form-control-feedback"></i>
                    </div>
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="email2">Téléphone</label>
                        <input type="email" class="form-control" id="email2" placeholder="Numéro de téléphone" name="telephone" required>
                        <i class="fa fa-phone form-control-feedback"></i>
                    </div>
                    <input type="submit" value="Envoyer" class="btn btn-default">
                </form>
            </div>
        </div>


                </div>  
            </div>  
        </div>
    </div>



</body>
</html>