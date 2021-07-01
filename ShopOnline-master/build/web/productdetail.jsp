<%-- 
    Document   : productaccount
    Created on : Sep 28, 2018, 8:03:34 PM
    Author     : Derick-T
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css"> 
        <link rel="stylesheet" href="css/common.css">
        <link rel="stylesheet" href="css/product.css">
        <link rel="stylesheet" href="css/index.css">
        <link rel="stylesheet" href="css/index2.css">
        <link rel="stylesheet" href="css/productDetail.css">
    </head>
    <body>
        <%@include file="nav.jsp" %> 

        <div class="container">
            <div class="card">
                <div class="container-fliud">
                    <div class="wrapper row">
                        <div class="preview col-md-6">

                            <div class="preview-pic tab-content">
                                <div class="tab-pane active" id="pic-1"><img class="img-detail" src="images/AnhTraSua/${product.image_Link}" alt="Card image cap"></div>

                            </div>


                        </div>
                        <div class="details col-md-6">
                            <h3 class="product-title">${product.name}</h3>
                            <div class="rating">
                                <div class="stars">
                                    <span class="fa fa-star checked"></span>
                                    <span class="fa fa-star checked"></span>
                                    <span class="fa fa-star checked"></span>
                                    <span class="fa fa-star"></span>
                                    <span class="fa fa-star"></span>
                                </div>
                                <span class="review-no">Thông Tin Chi Tiết</span>
                            </div>
                            <p class="product-description">-ID Sản Phẩm : ${product.id}</p>
                            <p class="product-description">-Mô Tả Nhanh : ${product.description}</p>

                            <h4 class="price">current price: <span>${product.price} VND</span></h4>
                            <p class="vote"><strong></strong> Best taste By Tocotoco <strong></strong></p>
                            <h5 class="sizes">sizes:
                                <span class="size" data-toggle="tooltip" title="medium">m</span>
                            </h5>
                            <p class="product-description">- Mô tả chi tiết :${product.note}</p>
                            <div class="action">
                                <button class="add-to-cart btn btn-default" type="button" onclick="window.location.href = 'cartProduct?id=${product.id}&price=${product.price}&quantity=${1}'">add to cart</button>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="js/bootstrap/bootstrap.min.js"></script>
</body>
</html>
