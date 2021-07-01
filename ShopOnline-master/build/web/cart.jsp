<%-- 
    Document   : cart
    Created on : Oct 9, 2018, 8:31:59 PM
    Author     : Derick-T
--%>

<%@page import="entity.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css"> 
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="css/common.css">
        <link rel="stylesheet" href="css/Basecart.css">
        <link rel="stylesheet" href="css/baseMargin.css">

    </head>
    <body>
        <%@include file="nav.jsp" %>


        <form action="card" method="POST">


            <div class="container">
                <div class="row">
                    <div class="col-xs-8">
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                <div class="panel-title">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <h5><span class="glyphicon glyphicon-shopping-cart"></span> Shopping Cart</h5>
                                        </div>
                                        <div class="col-xs-6">
                                            <button type="button" class="btn btn-primary btn-sm btn-block" onclick="window.location.href = 'filter'">
                                                <span class="glyphicon glyphicon-share-alt" ></span> Continue shopping
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body">
                                <%double total = 0;%>
                                <c:if test="${ListCart eq null}">
                                    <h2>
                                        <td>
                                            Không có sản phẩm nào
                                        </td>
                                    </h2>
                                </c:if>
                                <c:if test="${ListCart ne null}">
                                    <c:forEach items="${ListCart}" var="s">
                                        <div class="row">
                                            
                                            <div class="col-xs-4">
                                                <h4 class="product-name"><strong>${s.name}</strong></h4><h4><small>Product description</small></h4>
                                            </div>
                                            <div class="col-xs-6">
                                                <div class="col-xs-6 text-right">
                                                    <h6><strong>${s.productPrice} <span class="text-muted">x</span></strong></h6>
                                                </div>
                                                <div class="col-xs-4">
                                                    <h6><strong>${s.quantity} <span class="text-muted"></span></strong></h6>
                                                    
                                                </div>
                                                <div class="col-xs-2">
                                                    <button type="button" class="btn btn-link btn-xs" onclick="window.location.href = 'removeproduct?productid=${s.productID}'">
                                                        <span class="glyphicon glyphicon-trash"> </span>
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                        <hr>
                                    </c:forEach>
                                

                                <%  
                                    ArrayList<Cart> Listcart = (ArrayList<Cart>) session.getAttribute("ListCart");
                                    for (Cart s : Listcart) {
                                        total += s.getProductPrice() * s.getQuantity();
                                    }
                                %>
                                </c:if>
                                <hr>
                                <div class="row">
                                    <div class="text-center">
                                        <div class="col-xs-9">
                                            <h6 class="text-right">Added items?</h6>
                                        </div>
                                        <div class="col-xs-3">
                                            <button type="button" class="btn btn-default btn-sm btn-block" onclick="window.location.href = 'filter'">
                                                Update cart
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-footer">
                                <div class="row text-center">
                                    <div class="col-xs-9">
                                        <h4 class="text-right">Total :<strong>$<%=total%></strong></h4>
                                    </div>
                                    <div class="col-xs-3">
                                        
                                        <a href="cartDetail?next=cartDetail" class="btn btn-success btn-block">Tiếp Tục</a>
                                        <a href="deleteCart" class="btn btn-primary float-right mt-1">Xóa Sản Phẩm</a>
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
