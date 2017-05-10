<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
        
<!--        <script type="text/javascript">
                function confirmer(url) {
                        var rep = confirm("Etes vous sûre de  vouloir supprimer ?");
                        if (rep == true) {
                                document.location = url;
                        }
                }
        </script>-->
    </head>
    <body>

        <%@include file="menu.jsp" %>

        <div class="corps" >

            <div class="container">
                <div class="row">


                    <div class="col-md-12">
                        <h2>Liste des modules </h2>
                        <div class="table-responsive">
                            
                            <table id="mytable" class="table table-bordred table-striped">
                                <thead >
                                <th><input type="checkbox" id="checkall" /></th>
                                <th>Intitule</th>
                                <th>Descrition</th>
                                <th>Nombre de Jour</th>
                                </thead>

                                <tbody>
                                    <c:forEach items="${modules}" var="module">
                                        <tr>
                                            <td><input type="checkbox" class="checkthis" /></td>
                                            <td>${module.intitule}</td>
                                            <td>${module.description}</td>
                                            <td>${module.nbJour}</td>
                                            <td><p data-placement="top"  data-toggle="tooltip" title="Edit"><button name="action" value="edit" type="submit" class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button></p></td>
                                            <td><p data-placement="top" name="action" value="delete" data-toggle="tooltip" title="Delete" ><button  type="submit" name="delete" value="delete" class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>

<!--                        <div class="clearfix"></div>
                            <ul class="pagination pull-right">
                                <li class="disabled"><a href="#"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
                                <li class="active"><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">5</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
                           </ul>-->

                        </div>
                    </div>
                </div>
            </div>
            
            <form:form commandName="editMeal" method="post"
    class="form-horizontal form-width">
<!


            <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                            <h4 class="modal-title custom_align" id="Heading">Editer un module</h4>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input class="form-control " type="text" name="intitule" value="" placeholder="intitule">
                            </div>
                            
                            <div class="form-group">

                                <input class="form-control " type="text" name="description" placeholder="description">
                            </div>
                            
                            <div class="form-group">

                                <input class="form-control " type="text" name="nbJour" placeholder="nombre de jour">
                            </div>
                            
                           
                        </div>
                        <div class="modal-footer ">
                            <button onclick="" id="modifier" type="button" class="btn btn-default btn-lg" action="modifier" style="width: 30px;"><span class="glyphicon glyphicon-ok-sign"></span> Modifier</button>
                        </div>
                    </div>
                    <!-- /.modal-content --> 
                </div>
                <!-- /.modal-dialog --> 
            </div>



<!--            <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                            <h4 class="modal-title custom_align" id="Heading">Supprimer un module</h4>
                        </div>
                        <div class="modal-body">

                            <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Voulez vous supprimer ce module ?</div>

                        </div>
                        <div class="modal-footer ">
                            <button type="button" class="btn btn-success" action="delete"><span class="glyphicon glyphicon-ok-sign"></span> Oui</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Non</button>
                        </div>
                    </div>
                     /.modal-content  
                </div>
                 /.modal-dialog  
            </div>-->


        </div>
       
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="ressource/js/ap.js"></script>
    </body>
</html>