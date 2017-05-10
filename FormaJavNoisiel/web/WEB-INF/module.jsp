<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
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

       
        <link href="CSS/menustyle.css" rel="stylesheet">

        <title>Page Module</title>
    </head>
    <body>
        
        <div class="footer section">
            <div class="container">
                <h1 class="title text-center" id="contact">Saisie des Modules</h1>
                <div class="space"></div>
                <div class="row">
                    
                    
                    <div class="col-sm-6">
            <div class="footer-content">
                <p class="large">Merci de remplir tous les champs</p>
                
            </div>
        </div>

        <div class="col-sm-6">
            <div class="footer-content">
                <form action="module" method="post" role="form" id="footer-form">
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="name2">MODULE </label>
                        <input type="text" class="form-control" id="name2" placeholder="Intitulé" name="intitule" required="">
                       
                    </div>
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="name2">DESCRIPTION </label>
                        <input type="text" class="form-control" id="name2" placeholder="Description" name="description" required>
                       
                    </div>
                    <div class="form-group has-feedback">
                        <label class="sr-only" for="email2">NOMBRE DE JOUR</label>
                        <input type="text" class="form-control" id="email2" placeholder="Nombre de Jour" name="nbJour" required>
                        
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