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

            <div class="container">
                <div class="row">


                    <div class="col-md-12">
                        <h2>Liste des candidatures en attente à valider</h2>
                        <div class="table-responsive">


                            <table id="mytable" class="table table-bordred table-striped">

                                <thead >
                                <th><input type="checkbox" id="checkall" /></th>
                                <th>Nom</th>
                                <th>Prénom</th>
                                <th>Description</th>
                                <th>Date début</th>
                                <th>Date fin</th>
                                <th>Etat Candidature</th>
                                <th>Date Candidature</th>
                                <th>idSession</th>
                                </thead>

                                <tbody>
                                <form action="candidature" method="post" >
                                    <c:forEach items="${candidat}" var="candidat">
                                        <tr>
                                            <td><input type="checkbox" class="checkthis" /></td>
                                            <td>${candidat.nom}</td>
                                            <td>${candidat.prenom}</td>
                                            <td>${candidat.description}</td>
                                            <td>${candidat.dateDebut}</td>
                                            <td>${candidat.dateFin}</td>
                                            <td>${candidat.intitule}</td>
                                            <td>${candidat.dateCandidature}</td>
                                            <td>${candidat.idSession}</td>

                                            <td><input type="text" name="idSession" value="${candidat.idSession}"></td>
                                            <td> <button type="submit"  name="Accepter" value="accepter" key="button.btn-success" class="btn btn-success"><span class="glyphicon glyphicon-ok-sign"></span>Accepter</button></td>
                                            <td> <button type="submit"  name="Accepter" value="refuser"   key="button.btn-warning" class="btn btn-warning"><span class="glyphicon glyphicon-remove-sign"></span>Refuser</button></td>
<!--                                            <td><p data-placement="top" data-toggle="tooltip" title="Accepter"><button class="btn btn-success btn-xs" data-title="Accepter" data-toggle="modal" data-target="#accepter" ><span class="glyphicon glyphicon-ok-sign"></span></button></p></td>-->
<!--                                            <td><p data-placement="top" data-toggle="tooltip" title="Refuser"><button class="btn btn-warning btn-xs" data-title="Refuser" data-toggle="modal" data-target="#refuser" ><span class="glyphicon glyphicon-remove-sign"></span></button></p></td>-->
                                        
                                        </tr>
                                    </c:forEach>
                                </form>
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

            
                    <div class="modal fade" id="accepter" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                        <form action="candidature" method="post" >
                            
                            <div class="modal-dialog">
                                
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                                            <h4 class="modal-title custom_align" id="Heading">Valider la candidature</h4>
                                        </div>
                                        <div class="modal-body">
            
                                            <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Voulez-vous valider cette candidature ?</div><br/>
            
                                        </div>
                                        <div class="modal-footer ">
            
                                            
                                                <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok-sign"></span> Valider</button>
                                                <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Abandonner</button>
                                           
                                        </div>
                                        
                                        
                                    </div>
                                     /.modal-content  
                        </form>            
                                    
                               
                            </div>
                             /.modal-dialog  
                        </div>
                
           
                        <div class="modal fade" id="refuser" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                            <div class="modal-dialog">
                                
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                                            <h4 class="modal-title custom_align" id="Heading">Refuser la candidature</h4>
                                        </div>
                                        <div class="modal-body">
            
                                            <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Voulez-vous refuser cette candidature ?</div><br/>
            
                                        </div>
                                        <div class="modal-footer ">
            
                                            
                                                <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok-sign"></span> Valider</button>
                                                <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Abandonner</button>
                                           
                                                
                                        </div>
                                        
                                        
                                    </div>
                                     /.modal-content  
                                    
                                    
                               
                            </div>
                             /.modal-dialog  
                        </div>
                
                          

        </div>

    </script>

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="ressource/js/ap.js"></script>
</body>
</html>