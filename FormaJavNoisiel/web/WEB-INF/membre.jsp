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

            <div class="container">
                <div class="row">


                    <div class="col-md-12">
                        <h2>Liste des personnes </h2>
                        <div class="table-responsive">


                            <table id="mytable" class="table table-bordred table-striped">

                                <thead >
                                <th><input type="checkbox" id="checkall" /></th>
                                <th>Prenom</th>
                                <th>Nom</th>
                                <th>Email</th>
                                <th>Adresse</th>
                                <th>CodePostal</th>
                                <th>Ville</th>
                                <th>Téléphone</th>
                                </thead>

                                <tbody>
                                    <c:forEach items="${membres}" var="membre">
                                        <tr>
                                            <td><input type="checkbox" class="checkthis" /></td>
                                            <td>${membre.prenom}</td>
                                            <td>${membre.nom}</td>
                                            <td>${membre.mail}</td>
                                            <td>${membre.adresse}</td>
                                            <td>${membre.codePostal}</td>
                                            <td>${membre.ville}</td>
                                            <td>${membre.telephone}</td>
                                            <td><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button></p></td>
                                            <td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p></td>

                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>

                            <div class="clearfix"></div>
                            <ul class="pagination pull-right">
                                <li class="disabled"><a href="#"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
                                <li class="active"><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">5</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
                            </ul>

                        </div>
                    </div>
                </div>
            </div>


            <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                            <h4 class="modal-title custom_align" id="Heading">Editer un membre</h4>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input class="form-control " type="text" name="prenom" placeholder="prenom">
                            </div>
                            
                            <div class="form-group">

                                <input class="form-control " type="text" name="nom" placeholder="nom">
                            </div>
                            
                            <div class="form-group">

                                <input class="form-control " type="mail" name="mail" placeholder="email">
                            </div>
                            
                            <div class="form-group">

                                <input class="form-control " type="text" name="adresse" placeholder="rue">
                            </div>
                            
                            <div class="form-group">

                                <input class="form-control " type="number" name="codePostal" placeholder="code postal">
                            </div>
                            
                            <div class="form-group">

                                <input class="form-control " type="text" name="ville" placeholder="ville">
                            </div>
                            
                            <div class="form-group">

                                <input class="form-control " type="tel" name="telephone" placeholder="téléphone">
                            </div>
                            
                        </div>
                        <div class="modal-footer ">
                            <button type="button" class="btn btn-default btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> Modifier</button>
                        </div>
                    </div>
                    <!-- /.modal-content --> 
                </div>
                <!-- /.modal-dialog --> 
            </div>



            <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                            <h4 class="modal-title custom_align" id="Heading">Supprimer un membre</h4>
                        </div>
                        <div class="modal-body">

                            <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Voulez vous supprimer cet utilisateur ?</div>

                        </div>
                        <div class="modal-footer ">
                            <button type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> Oui</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Non</button>
                        </div>
                    </div>
                    <!-- /.modal-content --> 
                </div>
                <!-- /.modal-dialog --> 
            </div>


        </div>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="ressource/js/ap.js"></script>
    </body>
</html>