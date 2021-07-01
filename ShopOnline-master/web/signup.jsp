<%-- 
    Document   : SignUp
    Created on : Aug 19, 2018, 12:10:58 AM
    Author     : DerickT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="css/signup.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <link rel="stylesheet" href="css/baseMargin.css">
    </head>
    <body>
        <%@include file="nav.jsp" %>
        <div class ="panel" >
            <h1 class="text-center ">Sign Up</h1>
            <p class="text-center">Create your ToCoToCo Account</p>

            <form class="panel-signup form-control" action="register" method="POST" >
                <%
                    String message = (String) request.getAttribute("errorMessage") == null ? "&nbsp;" : (String) request.getAttribute("errorMessage");

                %>
                <p class ="text-center" style="color: red;">
                    <%=message%>
                </p>
                <div class="row">
                    <div class="col">
                        <div class="form-group">
                            <label for="exampleInputEmail1"><i class="far fa-envelope mg-right-20"></i>Email address</label>
                            <input type="email" class="form-control" name ="txtEmail" placeholder="example@example.com">
                        </div>
                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="exampleInputName">Full name</label>
                            <input type="text" class="form-control" name ="txtName" placeholder="Enter Fullname">
                        </div>
                    </div>
                </div>

                <div class="row"> 
                    <div class="col">
                        <div class="form-group">
                            <label for="inputPassword6">Password</label>
                            <input type="password" id="inputPassword6" class="form-control" name ="txtPassword" placeholder="Must be 8-20 characters long">
                        </div>
                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="Phone">Number Phone</label>
                            <input type="text" class="form-control" name ="txtPhone" placeholder="Must be 9-11 Numbers">
                        </div>
                    </div>
                </div>
                <div class="row"> 
                    <div class="col">
                        <div class="form-group">
                            <label for="inputPassword6">Repeat Password</label>
                            <input type="password" id="inputPassword6" class="form-control" name ="txtPasswordCf" placeholder="The same Password">
                        </div>
                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="inputPassword6">Address</label>
                            <input type="text" class="form-control" name ="txtAddress" placeholder="Enter your address">
                        </div>
                    </div>
                </div>
                <div class="row"> 
                    <div class="col">
                        <label >Gender</label>
                        <div class="row"> 
                            <div class="col">
                                <div class="form-check">
                                    <label class="form-check-label" for="radio1">
                                        <input type="radio" class="form-check-input" id="radio1" name="optradio" value="1" checked>Male
                                    </label>
                                </div>
                            </div>
                            <div class="col mg-right-30">
                                <div class="form-check">
                                    <label class="form-check-label" for="radio2">
                                        <input type="radio" class="form-check-input" id="radio2" name="optradio" value="0">Female
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">

                        <div class ="form-group mg-top-10">
                            <div class="form-group form-check ">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">I agree to all rules</label>
                            </div>
                            <button  type="submit" class="btn btn-success container ">Sign Up</button>
                            <div class="form-group" style="margin-top: 10px;">
                                <div class="col">
                                    <a class="link-effect mt-1" href="login.jsp">
                                        <i class="fas fa-sign-in-alt mr-1"></i> Đăng nhập
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
    </body>

</html>
