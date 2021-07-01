package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.min.css\">  \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">  \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/baseMargin.css\">  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class =\"panel\">\n");
      out.write("            <h2 class=\"text-center mg-bottom-30 color\">Đăng nhập</h2>\n");
      out.write("            <form action=\"Login\" method=\"GET\" class=\"panel-login\" class=\"button\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" name =\"txtEmail\" aria-describedby=\"emailHelp\">\n");
      out.write("                    <small id=\"emailHelp\" class=\"form-text text-muted\">example@example.com</small>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputPassword6\">Password</label>\n");
      out.write("                    <input type=\"password\" id=\"inputPassword6\" class=\"form-control\" name =\"txtPassword\" aria-describedby=\"passwordHelpInline\">\n");
      out.write("                    <small id=\"passwordHelpInline\" class=\"text-muted\">Must be 8-20 characters long</small>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group form-check \">\n");
      out.write("                    <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"exampleCheck1\">Remember</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn btn-success container \">Login</button>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\" style=\"margin-top: 10px;\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <a class=\"link-effect mt-1\" href=\"login.jsp\">\n");
      out.write("                            <i class=\"fas fa-sign-in-alt mr-1\"></i> Quên Mật Khẩu\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"link-effect mt-1 float-right\" href=\"signup.jsp\">\n");
      out.write("                            <i class=\"fas fa-user-plus mr-1\"></i> Đăng ký\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    String message = (String) request.getAttribute("errorMessage") == null ? "&nbsp;" : (String) request.getAttribute("errorMessage");

                
      out.write("\n");
      out.write("                <h6 class =\"text-center\" style=\"color: red;\">\n");
      out.write("                    ");
      out.print(message);
      out.write("\n");
      out.write("                </h6>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
