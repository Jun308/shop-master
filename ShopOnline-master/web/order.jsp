<%-- 
    Document   : order
    Created on : Oct 11, 2018, 10:17:27 PM
    Author     : Derick-T
--%>

<%@page import="entity.AccountDetail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css"> 
        <link rel="stylesheet" href="css/baseDetail.css"> 



    </head>
    <body>
        <%@include file="nav.jsp" %>



        <div class="container contact-form">
            <div class="contact-image">
                <img src="https://image.ibb.co/kUagtU/rocket_contact.png" alt="rocket_contact"/>
            </div>
            <form action="order" method="POST">
                <%               
                                AccountDetail acc = (AccountDetail) request.getAttribute("acDetail");
                %>
                <h3>Thông tin giao hàng</h3>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <input type="text" name="txtName" class="form-control" placeholder="<%=acc.getName()%>" value="<%=acc.getName()%>" />
                        </div>
                        <div class="form-group">
                            <input type="text" name="txtPhone" class="form-control" placeholder="<%=acc.getMobile()%>" value="<%=acc.getMobile()%>" />
                        </div>
                        <div class="form-group">
                            <input type="text" name="txtAddress" class="form-control" placeholder="<%=acc.getAddress()%>" value="<%=acc.getAddress()%>" />
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btnContact"  value="Confirm"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <%
                                String note =  null;
                            if(acc.getNote() == null){
                                note = "";
                            }
                            else{
                                note = acc.getNote();
                            }
                            %>
                            <textarea name="txtNote" class="form-control" placeholder="<%=note%>" style="width: 100%; height: 150px;"><%=note%></textarea>
                        </div>
                    </div>
                </div>
            </form>
        </div>


        <script src="js/bootstrap/bootstrap.min.js"></script>
    </body>
</html>
