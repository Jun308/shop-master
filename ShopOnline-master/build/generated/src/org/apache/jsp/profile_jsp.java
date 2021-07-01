package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Customer Profile</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/profile.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/boostrap/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">-->\n");
      out.write("        <!--        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>-->\n");
      out.write("        <!--        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <hr class=\"\">\n");
      out.write("        <div class=\"container target\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <h1 class=\"\">DOCTOR</h1>\n");
      out.write("\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\">Edit Profile</button>  <button type=\"button\" class=\"btn btn-success\">Access Calendar</button>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\"><a href=\"/users\" class=\"pull-sright\"><img title=\"profile image\" class=\"img-circle img-responsive\" src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBG685vI07-3MsuqJxjCfzIabfFJJG-8yM-ppvjjNpD5QNtWNE4A\"></a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <!--left col-->\n");
      out.write("                    <ul class=\"list-group\">\n");
      out.write("                        <li class=\"list-group-item text-muted\" contenteditable=\"false\">Profile</li>\n");
      out.write("                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\">Name: </strong></span> Joaquin Buenaobra</li>\n");
      out.write("                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\">Medical License Number: </strong></span> MNL09-F1SK5</li>\n");
      out.write("                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\">Address: </strong></span> Ermita, Manila</li>\n");
      out.write("                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\">Email: </strong></span> \"jwbuenaobra@hotmail.com\"</li>\n");
      out.write("                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\">Birthday: </strong></span>3 May 1981</li>\n");
      out.write("                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\">Age: </strong></span>37</li>\n");
      out.write("                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\">Sex: </strong></span>M</li>\n");
      out.write("                        <li class=\"list-group-item text-muted\" contenteditable=\"false\">Contact Details</li>\n");
      out.write("                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\">Telephone Number: </strong></span>       514-1132</li>\n");
      out.write("                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\">Cellphone Number: </strong></span>09159092245</li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("\n");
      out.write("                        <div class=\"panel-heading\">Reminders:\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\"><button type=\"button\" class=\"btn btn-info\">Patient Compliance<br><button type=\"button\" class=\"btn btn-secondary\">Approve Uploads\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"panel panel-default\">\n");
      out.write("                                        <div class=\"panel-heading\">NOTIFICATIONS <i class=\"fa fa-link fa-1x\"></i>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"panel-body\"><a href=\"http://bootply.com\" class=\"\">~Non-compliance to certain checklist items~</a>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <ul class=\"list-group\">\n");
      out.write("                                        <li class=\"list-group-item text-muted\">PATIENT LIBRARY<i class=\"fa fa-dashboard fa-1x\"></i>\n");
      out.write("\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\"><a href=\"https://bootsnipp.com/user/snippets/Gavb2\">Justine Tan</a></strong></span></li>\n");
      out.write("                                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\"><a href=\"#\">Chris Poernomo</a></strong></span></li>\n");
      out.write("                                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\"><a href=\"#\">Warren Monsod</a></strong></span> </li>\n");
      out.write("                                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\"><a href=\"#\">Zysa del Mundo</a></strong></span></li>\n");
      out.write("                                        <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong class=\"\"><button type=\"button\" class=\"btn btn-info\">Schedule Patient</strong></span></li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                    <div class=\"panel panel-default\">\n");
      out.write("                                        <div class=\"panel-heading\">UPLOADED MEDICAL-RELATED DOCUMENTS</div>\n");
      out.write("                                        <div class=\"panel-body\">\t<i class=\"fa fa-facebook fa-2x\"></i>  <i class=\"fa fa-github fa-2x\"></i> \n");
      out.write("                                            <i class=\"fa fa-twitter fa-2x\"></i> <i class=\"fa fa-pinterest fa-2x\"></i>  <i class=\"fa fa-google-plus fa-2x\"></i>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--/col-3-->\n");
      out.write("                                    <div class=\"col-sm-9\" style=\"\" contenteditable=\"false\">\n");
      out.write("                                        <div class=\"panel panel-default\">\n");
      out.write("                                            <div class=\"panel-heading\"><b>Shared Treatment Section</b></div>\n");
      out.write("                                            <div class=\"panel-body\"><i>Select the plan corresponding to your need. You will be redirected to the access page where you can edit the selected pre-made scheme.</i><br>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-primary\">Treatment Plan A</button>   <button type=\"button\" class=\"btn btn-primary\">Treatment Plan B</button>   <button type=\"button\" class=\"btn btn-primary\">Treatment Plan C</button>   <button type=\"button\" class=\"btn btn-primary\">Treatment Plan D</button>   <button type=\"button\" class=\"btn btn-Primary\">Create Plan</button>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"panel panel-default target\">\n");
      out.write("                                            <div class=\"panel-heading\" contenteditable=\"false\"><b>Treatments and Medications Needed</b></div>\n");
      out.write("                                            <div class=\"panel-body\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <div class=\"thumbnail\">\n");
      out.write("                                                            <img alt=\"300x200\" src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/UPMCEast_CTscan.jpg/280px-UPMCEast_CTscan.jpg\">\n");
      out.write("                                                            <div class=\"caption\">\n");
      out.write("                                                                <h3>\n");
      out.write("                                                                    Computed Tomography Scan\n");
      out.write("                                                                </h3>\n");
      out.write("                                                                <p>\n");
      out.write("                                                                    For potential transcatheter repair and replacement of heart valves \n");
      out.write("                                                                </p>\n");
      out.write("                                                                <p>\n");
      out.write("\n");
      out.write("                                                                </p>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <div class=\"thumbnail\">\n");
      out.write("                                                            <img alt=\"300x200\" src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEQz__ycuhuAoNISn3rNWuaZhhzH4lAnPg0IvmQXJpkN08pC5oZA\">\n");
      out.write("                                                            <div class=\"caption\">\n");
      out.write("                                                                <h3>\n");
      out.write("                                                                    Counselling Service\n");
      out.write("                                                                </h3>\n");
      out.write("                                                                <p>\n");
      out.write("                                                                    For stability of emotional threshold throughout the battery of tests\n");
      out.write("                                                                </p>\n");
      out.write("                                                                <p>\n");
      out.write("\n");
      out.write("                                                                </p>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <div class=\"thumbnail\">\n");
      out.write("                                                            <img alt=\"300x200\" src=\"https://assets.nhs.uk/prod/images/C0097883.2e16d0ba.fill-920x613.jpg\">\n");
      out.write("                                                            <div class=\"caption\">\n");
      out.write("                                                                <h3>\n");
      out.write("                                                                    Cardiac Catheterization\n");
      out.write("                                                                </h3>\n");
      out.write("                                                                <p>\n");
      out.write("                                                                    For further evaluation of other implicitly acquired cardiovascular conditions\n");
      out.write("                                                                </p>\n");
      out.write("                                                                <p>\n");
      out.write("\n");
      out.write("                                                                </p>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"panel panel-default\">\n");
      out.write("                                            <div class=\"panel-heading\"><b>Daily Medication and Treatment Breakdown:</b></div>\n");
      out.write("                                            <div class=\"panel-body\"> Textual, descriptive form of the above checklist\n");
      out.write("                                                <br><button type=\"button\" class=\"btn btn-primary\">Generate Report\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div></div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("                                    </body>\n");
      out.write("                                    </html>\n");
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
