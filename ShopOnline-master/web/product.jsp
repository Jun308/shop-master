<%-- 
    Document   : product
    Created on : Aug 17, 2018, 8:24:53 PM
    Author     : DerickT
--%>



<%@page import="gui.PaggerControl"%>
<%@page import="entity.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/tlds/Controller" prefix="tan"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css"> 
        <link rel="stylesheet" href="css/common.css">
        <link rel="stylesheet" href="css/products.css">
        <link rel="stylesheet" href="css/product2.css">

    </head>
    <body>
        <%@include file="nav.jsp" %>



        <div id="main-contain" class="container">
            <div class="row">
                <div class="col-md-3 pd-zero">
                    <div class="left-side">
                        <div class="row title">
                            <div class="col-md-12">
                                <h6>Thể loại</h6>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="side-nav">
                                    <ul class="navbar-nav ml-auto">
                                        <li class="nav-item">
                                            <a class="nav-link active" href="filter?id=0">
                                                <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mr-2"></i>Tất Cả Sản Phẩm
                                            </a>
                                        </li>
                                        <c:forEach items="${listCategory}" var="c">
                                            <li class="nav-item">
                                                <a class="nav-link active" href="filter?id=${c.id}">
                                                    <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mr-2"></i>${c.category}
                                                </a>
                                            </li>
                                        </c:forEach>
                                    </ul>
                                </div>                          
                            </div>
                            <form action="filter" method="GET">
                                <div class="mg-bottom-10">
                                    <div class="form-group mg-bottom-30">
                                        <label for="exampleSelect1">Search</label>

                                        <input class="form-control mr-sm-2" type="search" name="searchName">
                                        <br />
                                        <select class="form-control-sm" id="exampleSelect1" name="id">
                                            <c:forEach items="${listCategory}" var="c">
                                                <option value="${c.id}">${c.category}</option>
                                            </c:forEach>
                                        </select>


                                        <button type="submit" class="btn btn-primary mg-bottom-10" >Search</button>
                                        <br />
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

                <div class="col-md-9 pd-zero">
                    <div class="right-side">
                        <div class="row title">
                            <div class="col-md-12">
                                <h6>
                                    Sản phẩm

                                </h6>
                            </div>
                        </div>
                        <form action="filter" method="GET">
                            <div class=" container row mt-3">
                                <%  ArrayList<Product> list = (ArrayList<Product>) request.getAttribute("listProduct");
                                    int pageIndex = (Integer) request.getAttribute("pageIndex");
                                    int maxPage = (Integer) request.getAttribute("maxPage");
                                    String search = (String) request.getAttribute("search");
                                    String category = (String) request.getAttribute("category");
                                %>


                                <%                                    for (Product s : list) {
                                %>
                                <div class="col-md-3 col-sm-6">
                                    <div class="product">
                                        <div class="product-grid2">
                                            <div class="product-image2">
                                                <a href="Productdetail?id=<%=s.getId()%>">
                                                    <img class="pic-1" src="images/AnhTraSua/<%=s.getImage_Link()%>" >
                                                    <img class="pic-2" src="images/AnhTraSua/<%=s.getImage_Link()%>">
                                                </a>
                                                <ul class="social">                                              
                                                    <li><a href="cartProduct?id=<%=s.getId()%>&price=<%=s.getPrice()%>&quantity=${1}" data-tip="Add to Wishlist"><i class="fa fa-shopping-bag"></i></a></li>
                                                    <li><a href="Productdetail?id=<%=s.getId()%>" data-tip="Detail"><i class="fa fa-shopping-cart"></i></a></li>
                                                </ul>
                                                <%if (s.getStatus() == 2) {
                                                %>

                                                <span class="product-new-label">Sale</span>
                                                <%} else {%>

                                                <span class="product-new-label2">Sell</span>
                                                <%}%>

                                                <a class="add-to-cart" href="cartProduct?id=<%=s.getId()%>&price=<%=s.getPrice()%>&quantity=${1}">Add to cart</a>


                                            </div>

                                            <div class="product-content">
                                                <h3 class="title"><a href="Productdetail?id=<%=s.getId()%>"><%=s.getName()%></a></h3>
                                                <span class="price"><%=s.getPrice()%> Đ</span>
                                                <%  if (account != null) {
                                                        if (account.getRoleID() == 1 || account.getRoleID() == 3) {
                                                %>
                                                <a class="btn-danger" href="updateproduct.jsp?id=<%=s.getId()%>">Update</a>
                                                <%}
                                                    }%>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%}%>
                                <%if (category == null || category.equals("0")) {
                                %>
                                <div class="container pd-left27">
                                    <nav aria-label="Page">
                                        <ul class="pagination">
                                            <%=PaggerControl.generate(pageIndex, maxPage, 2)%>
                                        </ul>
                                    </nav>
                                </div>
                                <%
                                    }%>
                            </div>

                        </form>
                    </div>
                </div>


            </div>
        </div>




        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </body>
</html>
