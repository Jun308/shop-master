package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Account;

public final class active_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/active.css\">  \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/baseMargin.css\">  \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"intro\">\n");
      out.write("            <div class=\"body border-radius-5 \">\n");
      out.write("                <div class=\"logo text-center\">\n");
      out.write("                    <a href=\"filter\"><img src=\"images/logo.jpg\" class=\"img-rounded\" style=\"width: 50%\"></a>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"activeCode\" method=\"POST\">\n");
      out.write("                    ");

                        String message = (String) request.getAttribute("errorMessage") == null ? "&nbsp;" : (String) request.getAttribute("errorMessage");

                    
      out.write("\n");
      out.write("                    <p class =\"text-center\" style=\"color: red;\">\n");
      out.write("                        ");
      out.print(message);
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>\n");
      out.write("                                <i class=\"fas fa-address-card\"> Active Code</i>\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Nhập mã kích hoạt\" name=\"txtActiveCode\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-toco container border-radius-5 \">\n");
      out.write("                            <i class=\"fas fa-arrow-right mr-1\"></i> Xác nhận\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" style=\"margin-top: 10px;\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <a class=\"link-effect mt-1\" href=\"login.jsp\">\n");
      out.write("                                <i class=\"fas fa-sign-in-alt mr-1\"></i> Đăng nhập\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"link-effect mt-1 float-right\" href=\"signup.jsp\">\n");
      out.write("                                <i class=\"fas fa-user-plus\"></i> Đăng ký\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
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
