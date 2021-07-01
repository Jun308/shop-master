<%-- 
    Document   : login
    Created on : Aug 14, 2018, 2:15:31 PM
    Author     : DerickT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">  
        <link rel="stylesheet" href="css/login.css">  
        <link rel="stylesheet" href="css/baseMargin.css">  
    </head>
    <body>

        <div class ="panel">
            <h2 class="text-center mg-bottom-30 color">Đăng nhập</h2>
            <form action="Login" method="GET" class="panel-login" class="button">
                <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" name ="txtEmail" aria-describedby="emailHelp">
                    <small id="emailHelp" class="form-text text-muted">example@example.com</small>
                </div>

                <div class="form-group">
                    <label for="inputPassword6">Password</label>
                    <input type="password" id="inputPassword6" class="form-control" name ="txtPassword" aria-describedby="passwordHelpInline">
                    <small id="passwordHelpInline" class="text-muted">Must be 8-20 characters long</small>
                </div>

                

                <button type="submit" class="btn btn-success container ">Login</button>

                <div class="form-group" style="margin-top: 10px;">
                    <div class="col">
                        
                        <a class="link-effect mt-1 float-right" href="signup.jsp">
                            <i class="fas fa-user-plus mr-1"></i> Đăng ký
                        </a>
                    </div>
                </div>

                <%
                    String message = (String) request.getAttribute("errorMessage") == null ? "&nbsp;" : (String) request.getAttribute("errorMessage");

                %>
                <h6 class ="text-center" style="color: red;">
                    <%=message%>
                </h6>
            </form>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
    </body>

</html>
