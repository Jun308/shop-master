<%-- 
    Document   : CreateProduct
    Created on : Oct 30, 2018, 2:40:49 PM
    Author     : Derick-T
--%>

<%@page import="client.service.CategoryService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Category"%>
<%@page import="entity.Account"%>
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
        <% CategoryService categoryService = new CategoryService();
            ArrayList<Category> category = categoryService.getAll();
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
                                        <form action="createProduct" method="POST">
                                            <div class="card-block">
                                                <h3 class="card-title">Tạo Sản Phẩm</h3>
                                                <%
                                                    String message = (String) request.getAttribute("errorMessage") == null ? "&nbsp;" : (String) request.getAttribute("errorMessage");
                                                %>
                                                <h6 class ="text-center" style="color: red;">
                                                    <%=message%>
                                                </h6>

                                                <p>Tên Sản Phẩm</p>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <button type="button" class="btn btn-secondary">Name</button>
                                                    </div>
                                                    <input type="text" class="form-control" name="name">
                                                </div>
                                                <br />
                                                <p>Mục Sản Phẩm</p>
                                                <div class="input-group mb-3">
                                                    <div class="input-group-prepend">
                                                        <label class="input-group-text" for="inputGroupSelect01">Category</label>
                                                    </div>
                                                    <select class="custom-select" id="category" name="category">


                                                        <%for (Category c : category) {%>
                                                        <option value="<%=c.getId()%>"><%=c.getCategory()%></option>
                                                        <%}%>
                                                    </select>
                                                </div>
                                                <br />
                                                <p>Số Lượng</p>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <button type="button" class="btn btn-secondary">Quantity</button>
                                                    </div>
                                                    <input type="number" class="form-control" name="quantity">
                                                </div>
                                                <br />
                                                <p>Giá Sản Phẩm</p>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <button type="button" class="btn btn-secondary">Price</button>
                                                    </div>
                                                    <input type="number" class="form-control" name="price">
                                                </div>
                                                <br />
                                                <p>Mô Tả</p>
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <button type="button" class="btn btn-secondary">Mô tả</button>
                                                    </div>
                                                    <input type="text" class="form-control" name="decription">
                                                </div>
                                                <br />

                                                <p>Upload Image</p>
                                                <div class="input-group">
                                                    <div class="form-group">

                                                        <div class="input-group">
                                                            <span class="input-group-btn">
                                                                <span class="btn btn-default btn-file">
                                                                    Browse… <input type="file" id="imgInp" >
                                                                </span>
                                                            </span>
                                                            <input type="text" class="form-control" name="image" readonly>
                                                        </div>
                                                        <img id='img-upload'/>
                                                    </div>
                                                </div>
                                                <br />

                                                <p>Note</p>
                                                <div class="input-group">
                                                    <textarea class="form-control" rows="5" id="note" name="note"></textarea>
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
