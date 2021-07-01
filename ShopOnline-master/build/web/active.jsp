<%-- 
    Document   : active
    Created on : Aug 20, 2018, 6:02:20 PM
    Author     : Derick-T
--%>

<%@page import="entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">  
        <link rel="stylesheet" href="css/active.css">  
        <link rel="stylesheet" href="css/baseMargin.css">  
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
    </head>
    <body>
        <div id="intro">
            <div class="body border-radius-5 ">
                <div class="logo text-center">
                    <a href="filter"><img src="images/logo.jpg" class="img- rounded" style="width: 50%"></a>
                </div>
                <form action="activeCode" method="POST">
                    <%
                        String message = (String) request.getAttribute("errorMessage") == null ? "&nbsp;" : (String) request.getAttribute("errorMessage");

                    %>
                    <p class ="text-center" style="color: red;">
                        <%=message%>
                    </p>
                    <div class="col">
                        <div class="form-group">
                            <label>
                                <i class="fas fa-address-card"> Active Code</i>
                            </label>
                            <input type="text" class="form-control" placeholder="Nhập mã kích hoạt" name="txtActiveCode">
                        </div>
                    </div>
                    <div class="col">
                        <button type="submit" class="btn btn-toco container border-radius-5 ">
                            <i class="fas fa-arrow-right mr-1"></i> Xác nhận
                        </button>
                    </div>
                    <div class="form-group" style="margin-top: 10px;">
                        <div class="col">
                            <a class="link-effect mt-1" href="login.jsp">
                                <i class="fas fa-sign-in-alt mr-1"></i> Đăng nhập
                            </a>
                            <a class="link-effect mt-1 float-right" href="signup.jsp">
                                <i class="fas fa-user-plus"></i> Đăng ký
                            </a>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
    </body>
</html>
