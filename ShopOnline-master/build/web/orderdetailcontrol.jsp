<%-- 
    Document   : ordercontrol
    Created on : Oct 30, 2018, 2:24:51 PM
    Author     : Derick-T
--%>

<%@page import="entity.AccountDetail"%>
<%@page import="entity.OrderDetail"%>
<%@page import="entity.OrderPro"%>
<%@page import="java.util.ArrayList"%>
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
    </head>
    <body>
        <div class="container-fluid" id="wrapper">
            <div class="row">
                <%@include file="formadmin.jsp" %>
                <main class="col-xs-12 col-sm-8 col-lg-9 col-xl-10 pt-3 pl-4 ml-auto">
                    <%@include file="headerAdmin.jsp" %>
                    <section class="row">

                        <div class="col-sm-12">
                            <section class="row">
                                <div class="col-md-12 col-lg-8">
                                    <form action="ordercontroller" method="POST">
                                        <%
                                            ArrayList<OrderDetail> list = (ArrayList<OrderDetail>) request.getAttribute("listOrderDetail");
                                            AccountDetail ac = (AccountDetail) request.getAttribute("accountDetail");
                                        %>
                                        <div class="card mb-4">
                                            <div class="card-block">
                                                <h3 class="card-title">Recent Orders</h3>
                                                <div class="dropdown card-title-btn-container">
                                                    <button class="btn btn-sm btn-subtle" type="button" onclick="window.location.href = 'complete?id=<%=list.get(1).getOrderID()%>'"><em class="fa fa-list-ul"></em> Complete</button>


                                                </div>


                                                <div class="table-responsive">
                                                    <table class="table table-striped">
                                                        <thead>
                                                            <tr>
                                                                <th>OrderDetail </th>
                                                                <th>Order </th>
                                                                <th>Product Name</th>
                                                                <th>Quantity</th>
                                                                <th>Price</th>

                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <% for (OrderDetail s : list) {%>
                                                            <tr>
                                                                <td ><%=s.getOrderID()%><%=s.getId()%></td>
                                                                <td ><%=s.getOrderID()%></td>
                                                                <td><%=s.getProductName()%></td>
                                                                <td><%=s.getProductQuantity()%></td>
                                                                <td><%=s.getProductPrice()%></td>
                                                            </tr>
                                                            <%}%>
                                                        </tbody>
                                                    </table>
                                                </div>

                                            </div>
                                        </div>
                                    </form>
                                    <div class="card mb-4">
                                        <div class="card-block">
                                            <h3 class="card-title">Articles</h3>
                                            <h6 class="card-subtitle mb-2 text-muted">Latest news</h6>
                                            <div class="divider" style="margin-top: 1rem;"></div>
                                            <div class="articles-container">
                                                <div class="article border-bottom">
                                                    <div class="col-xs-12">
                                                        <div class="row">
                                                            <div class="col-2 date">
                                                                <div class="large">Tên</div>
                                                                <div class="text-muted">1</div>
                                                            </div>
                                                            <div class="col-10">
                                                                <h4><a href="#"><%=ac.getName()%></a></h4>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="clear"></div>
                                                </div><!--End .article-->

                                                <div class="article">
                                                    <div class="col-xs-12">
                                                        <div class="row">
                                                            <div class="col-2 date">
                                                                <div class="large">SĐT</div>
                                                                <div class="text-muted">2</div>
                                                            </div>
                                                            <div class="col-10">
                                                                <h4><a href="#"><%=ac.getMobile()%></a></h4>                                                                
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="clear"></div>
                                                </div><!--End .article-->

                                                <div class="article">
                                                    <div class="col-xs-12">
                                                        <div class="row">
                                                            <div class="col-2 date">
                                                                <div class="large">Gender</div>
                                                                <div class="text-muted">3</div>
                                                            </div>
                                                            <div class="col-10">
                                                                <h4><a href="#"><%=ac.getGender() == 1 ? "Nam" : "Nữ"%></a></h4>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="clear"></div>
                                                </div>
                                                <div class="article">
                                                    <div class="col-xs-12">
                                                        <div class="row">
                                                            <div class="col-2 date">
                                                                <div class="large">Address</div>
                                                                <div class="text-muted">4</div>
                                                            </div>
                                                            <div class="col-10">
                                                                <h4><a href="#"><%=ac.getAddress()%></a></h4>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="clear"></div>
                                                </div><!--End .article-->
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-12 col-lg-4">
                                    <div class="card mb-4">
                                        <div class="card-block">
                                            

                                            <div class="divider"></div>
                                            <div id="calendar"></div>
                                            <div class="divider"></div>
                                            <h3 class="card-title">Timeline</h3>
                                            
                                                
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="card mb-4">
                                        <div class="card-block">
                                            <h3 class="card-title">Todo List</h3>
                                            <div class="dropdown card-title-btn-container">
                                                <button class="btn btn-sm btn-subtle dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><em class="fa fa-cog"></em></button>
                                                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuButton"><a class="dropdown-item" href="#"><em class="fa fa-search mr-1"></em> More info</a>
                                                    <a class="dropdown-item" href="#"><em class="fa fa-thumb-tack mr-1"></em> Pin Window</a>
                                                    <a class="dropdown-item" href="#"><em class="fa fa-remove mr-1"></em> Close Window</a></div>
                                            </div>
                                            <h6 class="card-subtitle mb-2 text-muted">A simple checklist</h6>
                                            <ul class="todo-list mt-2 mb-2">

                                                <li class="todo-list-item">
                                                    <div class="checkbox mt-1 mb-2">
                                                        <div class="custom-control custom-checkbox">
                                                            <input type="checkbox" class="custom-control-input" id="customCheck1">
                                                            <label class="custom-control-label custom-control-description" for="customCheck1">Make Coffee</label>
                                                            <div class="float-right action-buttons"><a href="#" class="trash"><em class="fa fa-trash"></em></a></div>
                                                        </div>
                                                </li>
                                                <li class="todo-list-item">
                                                    <div class="checkbox mt-1 mb-2">
                                                        <div class="custom-control custom-checkbox">
                                                            <input type="checkbox" class="custom-control-input" id="customCheck2">
                                                            <label class="custom-control-label custom-control-description" for="customCheck2">Check emails</label>
                                                            <div class="float-right action-buttons"><a href="#" class="trash"><em class="fa fa-trash"></em></a></div>
                                                        </div>
                                                </li>
                                                <li class="todo-list-item">
                                                    <div class="checkbox mt-1 mb-2">
                                                        <div class="custom-control custom-checkbox">
                                                            <input type="checkbox" class="custom-control-input" id="customCheck3">
                                                            <label class="custom-control-label custom-control-description" for="customCheck3">Reply to Jane</label>
                                                            <div class="float-right action-buttons"><a href="#" class="trash"><em class="fa fa-trash"></em></a></div>
                                                        </div>
                                                </li>
                                                <li class="todo-list-item">
                                                    <div class="checkbox mt-1 mb-2">
                                                        <div class="custom-control custom-checkbox">
                                                            <input type="checkbox" class="custom-control-input" id="customCheck4">
                                                            <label class="custom-control-label custom-control-description" for="customCheck4">Work on the new design</label>
                                                            <div class="float-right action-buttons"><a href="#" class="trash"><em class="fa fa-trash"></em></a></div>
                                                        </div>
                                                </li>
                                                <li class="todo-list-item">
                                                    <div class="checkbox mt-1 mb-2">
                                                        <div class="custom-control custom-checkbox">
                                                            <input type="checkbox" class="custom-control-input" id="customCheck5">
                                                            <label class="custom-control-label custom-control-description" for="customCheck5">Get feedback</label>
                                                            <div class="float-right action-buttons"><a href="#" class="trash"><em class="fa fa-trash"></em></a></div>
                                                        </div>
                                                </li>
                                            </ul>
                                            <div class="card-footer todo-list-footer">
                                                <div class="input-group">
                                                    <input id="btn-input" type="text" class="form-control input-md" placeholder="Add new task" /><span class="input-group-btn">
                                                        <button class="btn btn-primary btn-md" id="btn-todo">Add</button>
                                                    </span></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </section>
                            <section class="row">
                                <div class="col-12 mt-1 mb-4">Template by <a href="https://www.fb.com/tan.phanviet">Tân Tân</a></div>
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
        <script src="dist/js/bootstrap.min.js"></script>

        <script src="js/chart.min.js"></script>
        <script src="js/chart-data.js"></script>
        <script src="js/easypiechart.js"></script>
        <script src="js/easypiechart-data.js"></script>
        <script src="js/bootstrap-datepicker.js"></script>
        <script src="js/custom.js"></script>
        <script>
                                                        var startCharts = function () {
                                                            var chart1 = document.getElementById("line-chart").getContext("2d");
                                                            window.myLine = new Chart(chart1).Line(lineChartData, {
                                                                responsive: true,
                                                                scaleLineColor: "rgba(0,0,0,.2)",
                                                                scaleGridLineColor: "rgba(0,0,0,.05)",
                                                                scaleFontColor: "#c5c7cc "
                                                            });
                                                        };
                                                        window.setTimeout(startCharts(), 1000);
        </script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>

    </body>
</html>

