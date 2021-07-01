package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import client.service.CategoryService;
import java.util.ArrayList;
import entity.Category;
import entity.Account;
import entity.Account;

public final class CreateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/formadmin.jsp");
    _jspx_dependants.add("/headerAdmin.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Icons -->\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/product.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 CategoryService categoryService = new CategoryService();
            ArrayList<Category> category = categoryService.getAll();
        
      out.write("\n");
      out.write("        <div class=\"container-fluid\" id=\"wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"sidebar col-xs-12 col-sm-4 col-lg-3 col-xl-2\">\n");
      out.write("    <h1 class=\"site-title\"><a href=\"filter\"><em class=\"fa fa-rocket\"></em> Tocotoco</a></h1>\n");
      out.write("\n");
      out.write("    <a href=\"#menu-toggle\" class=\"btn btn-default\" id=\"menu-toggle\"><em class=\"fa fa-bars\"></em></a>\n");
      out.write("    <ul class=\"nav nav-pills flex-column sidebar-nav\">\n");
      out.write("        <li class=\"nav-item\"><a class=\"nav-link \" href=\"ordercontroller\"><em class=\"fa fa-dashboard\"></em> Đơn hàng mới<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("        <li class=\"nav-item\"><a class=\"nav-link\" href=\"CreateProduct.jsp\"><em class=\"fa fa-pencil-square-o\"></em> Kiểm soát mặt hàng</a></li>\n");
      out.write("        <li class=\"nav-item\"><a class=\"nav-link\" href=\"profile\"><em class=\"fa fa-bar-chart\"></em> Profile Me </a></li>\n");
      out.write("        <li class=\"nav-item\"><a class=\"nav-link\" href=\"filter\"><em class=\"fa fa-pencil-square-o\"></em>Trở về Website Bán Hàng</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <a href=\"logout\" class=\"logout-button\"><em class=\"fa fa-power-off\"></em> Signout</a>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("                <main class=\"col-xs-12 col-sm-8 col-lg-9 col-xl-10 pt-3 pl-4 ml-auto\">\n");
      out.write("                   ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    Account account = (Account) session.getAttribute("currentLoginAccount");

      out.write("\n");
      out.write("<header class=\"page-header row justify-center\">\n");
      out.write("    <div class=\"col-md-6 col-lg-8\" >\n");
      out.write("        <h1 class=\"float-left text-center text-md-left\">Administrator</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"dropdown user-dropdown col-md-6 col-lg-4 text-center text-md-right\"><a class=\"btn btn-stripped dropdown-toggle\" href=\"profile\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <img src=\"images/user.png\" alt=\"profile photo\" class=\"circle float-left profile-photo\" width=\"50\" height=\"auto\">\n");
      out.write("            <div class=\"username mt-1\">\n");
      out.write("                <h4 class=\"mb-1\">");
      out.print(account.getEmail());
      out.write("</h4>\n");
      out.write("                ");

                    String name = null;
                    if (account.getRoleID() == 1) {
                        name = "Super Admin";
                    } else if (account.getRoleID() == 3) {
                        name = "Employee";
                    }
                
      out.write("\n");
      out.write("                <h6 class=\"text-muted\">");
      out.print(name);
      out.write("</h6>\n");
      out.write("            </div>\n");
      out.write("        </a>\n");
      out.write("        <div class=\" dropdown-menu-right\" style=\"margin-right: 1.5rem;\" aria-labelledby=\"dropdownMenuLink\"><a class=\"dropdown-item\" href=\"profile\"><em class=\"fa fa-user-circle mr-1\"></em> View Profile</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"logout\"><em class=\"fa fa-power-off mr-1\"></em> Logout</a></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("</header>");
      out.write("\n");
      out.write("                    <section class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <section class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"card mb-4\">\n");
      out.write("                                        <form action=\"createProduct\" method=\"POST\">\n");
      out.write("                                            <div class=\"card-block\">\n");
      out.write("                                                <h3 class=\"card-title\">Tạo Sản Phẩm</h3>\n");
      out.write("                                                ");

                                                    String message = (String) request.getAttribute("errorMessage") == null ? "&nbsp;" : (String) request.getAttribute("errorMessage");

                                                
      out.write("\n");
      out.write("                                                <h6 class =\"text-center\" style=\"color: red;\">\n");
      out.write("                                                    ");
      out.print(message);
      out.write("\n");
      out.write("                                                </h6>\n");
      out.write("\n");
      out.write("                                                <p>Tên Sản Phẩm</p>\n");
      out.write("                                                <div class=\"input-group\">\n");
      out.write("                                                    <div class=\"input-group-prepend\">\n");
      out.write("                                                        <button type=\"button\" class=\"btn btn-secondary\">Name</button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"name\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <br />\n");
      out.write("                                                <p>Mục Sản Phẩm</p>\n");
      out.write("                                                <div class=\"input-group mb-3\">\n");
      out.write("                                                    <div class=\"input-group-prepend\">\n");
      out.write("                                                        <label class=\"input-group-text\" for=\"inputGroupSelect01\">Category</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <select class=\"custom-select\" id=\"category\" name=\"category\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        ");
for (Category c : category) {
      out.write("\n");
      out.write("                                                        <option value=\"");
      out.print(c.getId());
      out.write('"');
      out.write('>');
      out.print(c.getCategory());
      out.write("</option>\n");
      out.write("                                                        ");
}
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                                <br />\n");
      out.write("                                                <p>Số Lượng</p>\n");
      out.write("                                                <div class=\"input-group\">\n");
      out.write("                                                    <div class=\"input-group-prepend\">\n");
      out.write("                                                        <button type=\"button\" class=\"btn btn-secondary\">Quantity</button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"quantity\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <br />\n");
      out.write("                                                <p>Giá Sản Phẩm</p>\n");
      out.write("                                                <div class=\"input-group\">\n");
      out.write("                                                    <div class=\"input-group-prepend\">\n");
      out.write("                                                        <button type=\"button\" class=\"btn btn-secondary\">Price</button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"price\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <br />\n");
      out.write("                                                <p>Mô Tả</p>\n");
      out.write("                                                <div class=\"input-group\">\n");
      out.write("                                                    <div class=\"input-group-prepend\">\n");
      out.write("                                                        <button type=\"button\" class=\"btn btn-secondary\">Mô tả</button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"decription\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <br />\n");
      out.write("\n");
      out.write("                                                <p>Upload Image</p>\n");
      out.write("                                                <div class=\"input-group\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                                        <div class=\"input-group\">\n");
      out.write("                                                            <span class=\"input-group-btn\">\n");
      out.write("                                                                <span class=\"btn btn-default btn-file\">\n");
      out.write("                                                                    Browse… <input type=\"file\" id=\"imgInp\" >\n");
      out.write("                                                                </span>\n");
      out.write("                                                            </span>\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" name=\"image\" readonly>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <img id='img-upload'/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <br />\n");
      out.write("\n");
      out.write("                                                <p>Note</p>\n");
      out.write("                                                <div class=\"input-group\">\n");
      out.write("                                                    <textarea class=\"form-control\" rows=\"5\" id=\"note\" name=\"note\"></textarea>\n");
      out.write("                                                </div>\n");
      out.write("                                                <br/>\n");
      out.write("                                                <div class=\"btn-group pull-right\">\n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-danger \">submit</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </section>\n");
      out.write("                            <section class=\"row\">\n");
      out.write("                                <div class=\"col-12 mt-1 mb-4\">Template by <a href=\"https://www.facebook.com/tan.phanviet\">Tân Tân</a></div>\n");
      out.write("                            </section>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript\n");
      out.write("        ================================================== -->\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/chart.min.js\"></script>\n");
      out.write("        <script src=\"js/chart-data.js\"></script>\n");
      out.write("        <script src=\"js/easypiechart.js\"></script>\n");
      out.write("        <script src=\"js/easypiechart-data.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js\" integrity=\"sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
