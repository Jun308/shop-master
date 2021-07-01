<%-- 
    Document   : nav
    Created on : Aug 24, 2018, 6:00:05 AM
    Author     : Derick-T
--%>

<%@page import="entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Account account = (Account) session.getAttribute("currentLoginAccount");
%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a href="filter"><img src="images/anphatpc.png" class="img-rounded" style="width: 30%"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">   
                    <a class="nav-link" href="filter">Product</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="signup.jsp">Đăng ký</a>
                </li>
                <%                    if (account != null) {
                %>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <%=account.getEmail()%>
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="profile">Detail Account</a>
                        <a class="dropdown-item" href="logout">Logout</a>
                        <%
                            if (account.getRoleID() == 1) {
                        %>
                        <a class="dropdown-item" href="ordercontroller">Administrator</a>
                        <%
                            }
                        %>
                </li>
                <%
                } else {
                %>


                <li class="nav-item">
                    <a class="nav-link" href="login.jsp">Đăng nhập</a>
                </li>
                <%
                    }
                %>

            </ul>
            <form class="form-inline my-2 my-lg-0">
                <li class="nav-item">   
                    <a class="btn btn-outline-success my-2 my-sm-0" href="cart.jsp">Cart</a>
                </li>
            </form>
        </div>
    </div>
</nav>
