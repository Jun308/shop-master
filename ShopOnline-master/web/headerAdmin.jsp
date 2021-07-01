<%-- 
    Document   : headerAdmin
    Created on : Nov 11, 2018, 9:10:39 PM
    Author     : Derick-T
--%>

<%@page import="entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Account account = (Account) session.getAttribute("currentLoginAccount");
%>
<header class="page-header row justify-center">
    <div class="col-md-6 col-lg-8" >
        <h1 class="float-left text-center text-md-left">Administrator</h1>
    </div>
    <div class="dropdown user-dropdown col-md-6 col-lg-4 text-center text-md-right"><a class="btn btn-stripped dropdown-toggle" href="profile" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <img src="images/user.png" alt="profile photo" class="circle float-left profile-photo" width="50" height="auto">
            <div class="username mt-1">
                <h4 class="mb-1"><%=account.getEmail()%></h4>
                <%
                    String name = null;
                    if (account.getRoleID() == 1) {
                        name = "Super Admin";
                    } else if (account.getRoleID() == 3) {
                        name = "Employee";
                    }
                %>
                <h6 class="text-muted"><%=name%></h6>
            </div>
        </a>
        <div class=" dropdown-menu-right" style="margin-right: 1.5rem;" aria-labelledby="dropdownMenuLink"><a class="dropdown-item" href="profile"><em class="fa fa-user-circle mr-1"></em> View Profile</a>
            <a class="dropdown-item" href="logout"><em class="fa fa-power-off mr-1"></em> Logout</a></div>
    </div>
    <div class="clear"></div>
</header>