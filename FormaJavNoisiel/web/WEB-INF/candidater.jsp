<%-- 
    Document   : candidater
    Created on : 12 avr. 2017, 10:59:52
    Author     : Amat
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Candidater</title>
    </head>
    <body>

        <%@include file="menu.jsp" %>

        <div class="corps">

            <div class="container">
                <div class="row">


                    <div class="col-md-12">
                        <h2>Liste des sessions à candidater</h2>
                        <div class="table-responsive">


                            <table id="mytable" class="table table-bordred table-striped">

                                <thead >
                                <th><input type="checkbox" id="checkall" /></th>
                                <th>Formation</th>
                                <th>Description</th>
                                <th>Date début</th>
                                <th>Date fin</th>
                                </thead>

                                <tbody>
                                    <c:forEach items="${session}" var="session">
                                        <tr>
                                            <td><input type="checkbox" class="checkthis" /></td>
                                            <td>${session.intitule}</td>
                                            <td>${session.description}</td>
                                            <td>${session.dateDebut}</td>
                                            <td>${session.dateFin}</td>
                                            <td><p data-placement="top" data-toggle="tooltip" title="Record"><button class="btn btn-danger btn-xs" data-title="Record" data-toggle="modal" data-target="#Record" ><span class="glyphicon glyphicon-record"></span></button></p></td>

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


            <div class="modal fade" id="Record" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                <div class="modal-dialog">
                    <form action="candidater" method="post" >
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                            <h4 class="modal-title custom_align" id="Heading">Valider la session</h4>
                        </div>
                        <div class="modal-body">
                               
                            <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Voulez vous valider cette session ?</div><br/>

                        </div>
                        <div class="modal-footer ">
                            <button type="submit" class="btn btn-default" ><span class="glyphicon glyphicon-ok-sign"></span> Valider</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Non</button>
                        </div>
                    </div>
                    <!-- /.modal-content --> 
                    </form>
                </div>
                <!-- /.modal-dialog --> 
            </div>


        </div>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="ressource/js/ap.js"></script>
    </body>
</html>