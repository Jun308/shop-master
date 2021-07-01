<%-- 
    Document   : profile
    Created on : Nov 1, 2018, 11:36:56 AM
    Author     : Derick-T
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Profile</title>

        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css"> 
        <link rel="stylesheet" href="css/profile.css"> 



        <!--        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">-->
        <!--        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>-->
        <!--        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>-->

    </head>
    <body>
        <form action="profile" method="POST">
            <div class="container main-secction">

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12 image-section">
                        <img src="images/toco1.jpg" >
                    </div>
                    <div class="row user-left-part">
                        <div class="col-md-3 col-sm-3 col-xs-12 user-profil-part pull-left">
                            <div class="row ">
                                <div class="col-md-12 col-md-12-sm-12 col-xs-12 user-image text-center">
                                    <img src="https://www.jamf.com/jamf-nation/img/default-avatars/generic-user-purple.png" class="rounded-circle">
                                </div>
                                <div class="col-md-12 col-sm-12 col-xs-12 user-detail-section1 text-center">
                                    <a class="btn btn-success btn-block follow" href="profile">Thông Tin Cá Nhân</a> 
                                    <a class="btn btn-warning btn-block" href="controlmyorder">Thông Tin Order</a>                               
                                </div>
                                <div class="row user-detail-row">

                                </div>

                            </div>
                        </div>
                        <div class="col-md-9 col-sm-9 col-xs-12 pull-right profile-right-section">
                            <div class="row profile-right-section-row">
                                <div class="col-md-12 profile-header">
                                    <div class="row">
                                        <div class="col-md-8 col-sm-6 col-xs-6 profile-header-section1 pull-left">
                                            <h1>${accountDetail.name}</h1>
                                            <c:if test="${account.roleID ==1}">
                                                    
                                                       <h5>Admin</h5>
                                                    
                                            </c:if>
                                            <c:if test="${account.roleID ==2}">                                          
                                                       <h5>Customer</h5>
                                            </c:if>
                                            <c:if test="${account.roleID ==3}">                                          
                                                       <h5>Employee</h5>
                                            </c:if>
                                        </div>
                                        <div class="col-md-4 col-sm-6 col-xs-6 profile-header-section1 text-right pull-rigth">
                                            <a href="filter" class="btn btn-primary btn-block">Shopping</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="row">
                                        <div class="col-md-8">
                                            <ul class="nav nav-tabs" role="tablist">
                                                <li class="nav-item">
                                                    <a class="nav-link active" href="#profile" role="tab" data-toggle="tab"><i class="fas fa-user-circle"></i> Profile</a>
                                                </li>
                                                <li class="nav-item">
                                                    <a class="nav-link" href="#buzz" role="tab" data-toggle="tab"><i class="fas fa-info-circle"></i> Profile Detail</a>
                                                </li>                                                
                                            </ul>

                                            <!-- Tab panes -->
                                            <div class="tab-content">

                                                <div role="tabpanel" class="tab-pane fade show active" id="profile">

                                                    <div class="row">
                                                        <div class="col-md-2">
                                                            <label>ID</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <h7>${account.id}</h7>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                            <label>Name</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <h7>${accountDetail.name}</h7>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                            <label>Email</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <h7>${account.email}</h7>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                            <label>Telephone</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <h7>${accountDetail.mobile}</h7>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-2">
                                                            <label>Rule</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <c:if test="${account.roleID ==1}">                                                              
                                                                       <h7>Admin</h7>
                                                                </c:if>
                                                                <c:if test="${account.roleID ==2}">                                          
                                                                       <h7>Customer</h7>
                                                                </c:if>
                                                                <c:if test="${account.roleID ==3}">                                          
                                                                       <h7>Employee</h7>
                                                                </c:if>

                                                        </div>
                                                    </div>
                                                </div>
                                                <div role="tabpanel" class="tab-pane fade" id="buzz">
                                                    <div class="row">
                                                        <div class="col-md-6 ">
                                                            <label>Status</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <c:if test="${account.status ==1}">
                                                                       <h7>Active</h7>    
                                                                </c:if>
                                                                <c:if test="${account.status ==2}">                                          
                                                                       <h7>Pending</h7>
                                                                </c:if>
                                                                <c:if test="${account.status ==3}">                                          
                                                                       <h7>DeActive</h7>
                                                                </c:if>

                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Address</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <h7>${accountDetail.address}</h7>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Address Detail</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <h7>${accountDetail.note}</h7>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <label>Create Date</label>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <h7>${account.createDate}</h7>
                                                        </div>
                                                    </div>



                                                </div>

                                            </div>

                                        </div>
                                        <div class="col-md-4 img-main-rightPart">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <div class="row image-right-part">
                                                        <div class="col-md-6 pull-left image-right-detail">
                                                            <h6>Product By</h6>
                                                        </div>
                                                    </div>
                                                </div>
                                                <a href="filter">
                                                    <div class="col-md-12 image-right">
                                                        <img src="images/logo.jpg" class="img-rounded" style="width: 100% ;height: 150%">
                                                    </div>
                                                </a>
                                                <div class="col-md-12 image-right-detail-section2">

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </form>     
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
    </body>
</html>
