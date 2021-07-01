package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/signup.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/baseMargin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand mb-0 h1\" href=\"index.jsp\">Shop Online</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">NEW</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Giảm giá</a>\n");
      out.write("                        </li>                     \n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"form-inline my-2 my-lg-0 mg-right-30\">\n");
      out.write("                        <input class=\"form-control mr-sm-2 search\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                        <button class=\"btn btn-sm btn-outline-secondary\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Đăng ký</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"login.jsp\">Đăng nhập</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class =\"panel\" >\n");
      out.write("            <h1 class=\"text-center \">Sign Up</h1>\n");
      out.write("            <p class=\"text-center\">Create your ToCoToCo Account</p>\n");
      out.write("\n");
      out.write("            <form class=\"panel-signup form-control\" action=\"register\" method=\"POST\" >\n");
      out.write("                ");

                    String message = (String) request.getAttribute("errorMessage") == null ? "&nbsp;" : (String) request.getAttribute("errorMessage");

                
      out.write("\n");
      out.write("                <p class =\"text-center\" style=\"color: red;\">\n");
      out.write("                    ");
      out.print(message);
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\"><i class=\"far fa-envelope mg-right-20\"></i>Email address</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" name =\"txtEmail\" placeholder=\"example@example.com\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputName\">Full name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name =\"txtName\" placeholder=\"Enter Fullname\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\"> \n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword6\">Password</label>\n");
      out.write("                            <input type=\"password\" id=\"inputPassword6\" class=\"form-control\" name =\"txtPassword\" placeholder=\"Must be 8-20 characters long\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"Phone\">Number Phone</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name =\"txtPhone\" placeholder=\"Must be 9-11 Numbers\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\"> \n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword6\">Repeat Password</label>\n");
      out.write("                            <input type=\"password\" id=\"inputPassword6\" class=\"form-control\" name =\"txtPasswordCf\" placeholder=\"The same Password\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword6\">Address</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name =\"txtAddress\" placeholder=\"Enter your address\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\"> \n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <label >Gender</label>\n");
      out.write("                        <div class=\"row\"> \n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\" for=\"radio1\">\n");
      out.write("                                        <input type=\"radio\" class=\"form-check-input\" id=\"radio1\" name=\"optradio\" value=\"1\" checked>Male\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col mg-right-30\">\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\" for=\"radio2\">\n");
      out.write("                                        <input type=\"radio\" class=\"form-check-input\" id=\"radio2\" name=\"optradio\" value=\"0\">Female\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("\n");
      out.write("                        <div class =\"form-group mg-top-10\">\n");
      out.write("                            <div class=\"form-group form-check \">\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                                <label class=\"form-check-label\" for=\"exampleCheck1\">I agree to all rules</label>\n");
      out.write("                            </div>\n");
      out.write("                            <button  type=\"submit\" class=\"btn btn-success container \">Sign Up</button>\n");
      out.write("                            <div class=\"form-group\" style=\"margin-top: 10px;\">\n");
      out.write("                                <div class=\"col\">\n");
      out.write("                                    <a class=\"link-effect mt-1\" href=\"login.jsp\">\n");
      out.write("                                        <i class=\"fas fa-sign-in-alt mr-1\"></i> Đăng nhập\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
