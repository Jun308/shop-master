<%-- 
    Document   : updateproduct
    Created on : Nov 6, 2018, 2:20:55 PM
    Author     : Derick-T
--%>

<%@page import="entity.Product"%>
<%@page import="model.ProductModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">

        <!-- Icons -->
        <link href="css/font-awesome.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet">
        <link href="css/product.css" rel="stylesheet">
    </head>
    <body>
        <%
            int id = Integer.valueOf(request.getParameter("id"));
            ProductModel pm = new ProductModel();
            Product pro = pm.getOne(id);
        %>
        <div class="container-fluid" id="wrapper">
            <div class="row">
                <%@include file="formadmin.jsp" %>
                <main class="col-xs-12 col-sm-8 col-lg-9 col-xl-10 pt-3 pl-4 ml-auto">
                    <%@include file="headerAdmin.jsp" %>
                    <section class="row">
                        <div class="col-sm-12">
                            <section class="row">
                                <div class="col-lg-6">
                                    <div class="card mb-4">
                                        <form action="updateProduct" method="POST">
                                            <div class="card-block">
                                                <h3 class="card-title">Update Sản Phẩm</h3>
                                                <p>Id : <%=pro.getId()%></p>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <button type="button" class="btn btn-secondary">name</button>
                                                    </div>
                                                    <input type="text" class="form-control" name="id"  value="<%=pro.getId()%>">
                                                </div>
                                                <br/>
                                                <p>Tên Sản Phẩm</p>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <button type="button" class="btn btn-secondary">name</button>
                                                    </div>
                                                    <input type="text" class="form-control" name="name"  value="<%=pro.getName()%>">
                                                </div>
                                                <br />

                                                <p>Số Lượng</p>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <button type="button" class="btn btn-secondary">Quantity</button>
                                                    </div>
                                                    <input type="number" class="form-control" name="quantity" value="<%=pro.getQuantity()%>">
                                                </div>
                                                <br />
                                                <p>Giá Sản Phẩm</p>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <button type="button" class="btn btn-secondary">Price</button>
                                                    </div>
                                                    <input type="number" class="form-control" name="price" value="<%=pro.getPrice()%>">
                                                </div>
                                                <br />
                                                <p>Mô Tả</p>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <button type="button" class="btn btn-secondary">Mô tả</button>
                                                    </div>
                                                    <input type="text" class="form-control" name="decription" value="<%=pro.getDescription()%>">
                                                </div>
                                                <br />
                                                <div class="input-group mb-3">
                                                    <div class="input-group-prepend">
                                                        <label class="input-group-text" for="inputGroupSelect01">Status</label>
                                                    </div>
                                                    <select class="custom-select" id="status" name="status">
                                                        <%if (pro.getStatus() == 1) { %>
                                                        <option value="1" selected="">Sell</option>
                                                        <option value="2">Sale</option>
                                                        <option value="3">Sold Out</option>
                                                        <%} else if (pro.getStatus() == 2) {%>

                                                        <option value="1" selected="">Sell</option>
                                                        <option value="2" selected>Sale</option>
                                                        <option value="3">Sold Out</option>
                                                        <%} else {%>

                                                        <option value="1" >Sell</option>
                                                        <option value="2" >Sale</option>
                                                        <option value="3" selected>Sold Out</option>
                                                        <%}%>

                                                    </select>
                                                </div>

                                                <br />
                                                <p>Note</p>
                                                <div class="input-group">
                                                    <textarea class="form-control" rows="5" id="note" name="note"  value="<%=pro.getNote()%>"></textarea>
                                                </div>
                                                <br/>
                                                <div class="btn-group pull-right">
                                                    <button type="submit" class="btn btn-danger ">submit</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>

                                </div>
                            </section>
                            <section class="row">
                                <div class="col-12 mt-1 mb-4">Template by <a href="https://www.facebook.com/tan.phanviet">Tân Tân</a></div>
                            </section>
                        </div>
                    </section>
                </main>
            </div>
        </div>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>

        <script src="js/chart.min.js"></script>
        <script src="js/chart-data.js"></script>
        <script src="js/easypiechart.js"></script>
        <script src="js/easypiechart-data.js"></script>
        <script src="js/bootstrap-datepicker.js"></script>
        <script src="js/custom.js"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>


    </body>
</html>
