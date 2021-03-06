package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <div class=\"container-fluid\" id=\"wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <nav class=\"sidebar col-xs-12 col-sm-4 col-lg-3 col-xl-2\">\n");
      out.write("                    <h1 class=\"site-title\"><a href=\"index.html\"><em class=\"fa fa-rocket\"></em> Brand.name</a></h1>\n");
      out.write("\n");
      out.write("                    <a href=\"#menu-toggle\" class=\"btn btn-secondary\" id=\"menu-toggle\"><em class=\"fa fa-bars\"></em></a>\n");
      out.write("                    <ul class=\"nav nav-pills flex-column sidebar-nav\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"ordercontrol.jsp\"><em class=\"fa fa-dashboard\"></em> ????n h??ng m???i</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"widgets.html\"><em class=\"fa fa-calendar-o\"></em> L???ch s??? giao h??ng</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"administration.jsp\"><em class=\"fa fa-bar-chart\"></em> Qu???n l?? nh??n vi??n </a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"CreateProduct.jsp\"><em class=\"fa fa-pencil-square-o\"></em> Ki???m so??t m???t h??ng</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"administration.jsp\"><em class=\"fa fa-hand-o-up\"></em> Li??n h??? nh??n vi??n <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"cards.html\"><em class=\"fa fa-clone\"></em> update s???n ph???m</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <a href=\"#\" class=\"logout-button\"><em class=\"fa fa-power-off\"></em> Signout</a></nav>\n");
      out.write("                <main class=\"col-xs-12 col-sm-8 col-lg-9 col-xl-10 pt-3 pl-4 ml-auto\">\n");
      out.write("                    <header class=\"page-header row justify-center\">\n");
      out.write("                        <div class=\"col-md-6 col-lg-8\" >\n");
      out.write("                            <h1 class=\"float-left text-center text-md-left\">Buttons</h1>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"dropdown user-dropdown col-md-6 col-lg-4 text-center text-md-right\"><a class=\"btn btn-stripped dropdown-toggle\" href=\"https://example.com\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <img src=\"images/profile-pic.jpg\" alt=\"profile photo\" class=\"circle float-left profile-photo\" width=\"50\" height=\"auto\">\n");
      out.write("                                <div class=\"username mt-1\">\n");
      out.write("                                    <h4 class=\"mb-1\">Username</h4>\n");
      out.write("                                    <h6 class=\"text-muted\">Super Admin</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right\" style=\"margin-right: 1.5rem;\" aria-labelledby=\"dropdownMenuLink\"><a class=\"dropdown-item\" href=\"#\"><em class=\"fa fa-user-circle mr-1\"></em> View Profile</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\"><em class=\"fa fa-sliders mr-1\"></em> Preferences</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\"><em class=\"fa fa-power-off mr-1\"></em> Logout</a></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </header>\n");
      out.write("                    <section class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <section class=\"row\">\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <div class=\"card mb-4\">\n");
      out.write("                                        <div class=\"card-block btn-margins\">\n");
      out.write("                                            <h3 class=\"card-title\">Standard Buttons</h3>\n");
      out.write("                                            <h6 class=\"mb-3 mt-4 pl-1\">Small</h6>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-primary\">Primary</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-secondary\">Secondary</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-success\">Success</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-info\">Info</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-warning\">Warning</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-danger\">Danger</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-link\">Link</button>\n");
      out.write("                                            <h6 class=\"mb-3 mt-4 pl-1\">Medium</h6>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-md btn-primary\">Primary</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-md btn-secondary\">Secondary</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-md btn-success\">Success</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-md btn-info\">Info</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-md btn-warning\">Warning</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-md btn-danger\">Danger</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-md btn-link\">Link</button>\n");
      out.write("                                            <h6 class=\"mb-3 mt-4 pl-1\">Large</h6>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-lg btn-primary\">Primary</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-lg btn-secondary\">Secondary</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-lg btn-success\">Success</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-lg btn-info\">Info</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-lg btn-warning\">Warning</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-lg btn-danger\">Danger</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-lg btn-link\">Link</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"card mb-4\">\n");
      out.write("                                        <div class=\"card-block btn-margins\">\n");
      out.write("                                            <h3 class=\"card-title\">Dropdown Buttons</h3>\n");
      out.write("                                            <div class=\"btn-group\">\n");
      out.write("                                                <button data-toggle=\"dropdown\" class=\"btn btn-primary dropdown-toggle margin\">Action <span class=\"caret\"></span></button>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li><a href=\"#\">Action</a></li>\n");
      out.write("                                                    <li><a href=\"#\" class=\"font-bold\">Another action</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"btn-group\">\n");
      out.write("                                                <button data-toggle=\"dropdown\" class=\"btn btn-secondary dropdown-toggle margin\">Action <span class=\"caret\"></span></button>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li><a href=\"#\">Action</a></li>\n");
      out.write("                                                    <li><a href=\"#\" class=\"font-bold\">Another action</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"btn-group\">\n");
      out.write("                                                <button data-toggle=\"dropdown\" class=\"btn btn-success dropdown-toggle margin\">Action <span class=\"caret\"></span></button>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li><a href=\"#\">Action</a></li>\n");
      out.write("                                                    <li><a href=\"#\" class=\"font-bold\">Another action</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"btn-group\">\n");
      out.write("                                                <button data-toggle=\"dropdown\" class=\"btn btn-info dropdown-toggle margin\">Action <span class=\"caret\"></span></button>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li><a href=\"#\">Action</a></li>\n");
      out.write("                                                    <li><a href=\"#\" class=\"font-bold\">Another action</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"btn-group\">\n");
      out.write("                                                <button data-toggle=\"dropdown\" class=\"btn btn-warning dropdown-toggle margin\">Action <span class=\"caret\"></span></button>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li><a href=\"#\">Action</a></li>\n");
      out.write("                                                    <li><a href=\"#\" class=\"font-bold\">Another action</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"btn-group\">\n");
      out.write("                                                <button data-toggle=\"dropdown\" class=\"btn btn-danger dropdown-toggle margin\">Action <span class=\"caret\"></span></button>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li><a href=\"#\">Action</a></li>\n");
      out.write("                                                    <li><a href=\"#\" class=\"font-bold\">Another action</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card mb-4\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <h3 class=\"card-title\">Button Groups</h3>\n");
      out.write("                                            <p>Group buttons with <code>.btn-group</code> class</p>\n");
      out.write("                                            <p>\n");
      out.write("                                            <div class=\"btn-group\">\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\">Left</button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\">Middle</button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\">Right</button>\n");
      out.write("                                            </div>\n");
      out.write("                                            </p>\n");
      out.write("                                            <p>Useful for pagination and tabbed buttons</p>\n");
      out.write("                                            <p>\n");
      out.write("                                            <div class=\"btn-group\">\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\"><span class=\"fa fa-arrow-left\"></span></button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\">1</button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\">2</button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\">3</button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\">4</button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\">5</button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\"><span class=\"fa fa-arrow-right\"></span></button>\n");
      out.write("                                            </div>\n");
      out.write("                                            </p>\n");
      out.write("                                            <p>\n");
      out.write("                                            <div class=\"btn-group\">\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-primary\"><span class=\"fa fa-align-left\"></span></button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\"><span class=\"fa fa-align-center\"></span></button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\"><span class=\"fa fa-align-right\"></span></button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\"><span class=\"fa fa-align-justify\"></span></button>\n");
      out.write("                                            </div>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card mb-4\">\n");
      out.write("                                        <div class=\"card-block btn-margins\">\n");
      out.write("                                            <h3 class=\"card-title\">Circle Buttons</h3>\n");
      out.write("                                            <p>Create round buttons with <code>.btn-circle</code> class\n");
      out.write("                                            <p>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-check\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-plus\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-search\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-heart\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-user\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-file\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-trash\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-tag\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-edit\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-shopping-cart\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-download\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-comment\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-paperclip\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-clone\"></span></button>\n");
      out.write("                                                <button class=\"btn btn-secondary btn-circle margin\" type=\"button\"><span class=\"fa fa-wrench\"></span></button>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"card mb-4\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <h3 class=\"card-title\">Button Addons</h3>\n");
      out.write("                                            <p>With dropdown</p>\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <div class=\"input-group-prepend\">\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-secondary dropdown-toggle\" data-toggle=\"dropdown\">Action <span class=\"caret\"></span></button>\n");
      out.write("                                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                                        <li><a href=\"#\">Action</a></li>\n");
      out.write("                                                        <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                                        <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                                                        <li class=\"divider\"></li>\n");
      out.write("                                                        <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <br />\n");
      out.write("                                            <p>Without dropdown</p>\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <div class=\"input-group-prepend\">\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-secondary\">Action</button>\n");
      out.write("                                                </div>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card mb-4\">\n");
      out.write("                                        <div class=\"card-block btn-margins\">\n");
      out.write("                                            <h3 class=\"card-title\">Icon Buttons</h3>\n");
      out.write("                                            <p>Full list of icons available <a href=\"icons.html\">here</a></p>\n");
      out.write("                                            <p>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-check\"></span> &nbsp;Submit</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-plus\"></span> &nbsp;Add New</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-search\"></span> &nbsp;Search</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-heart\"></span> &nbsp;Favorite</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-user\"></span> &nbsp;User</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-file\"></span> &nbsp;Document</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-trash\"></span> &nbsp;Delete</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-print\"></span> &nbsp;Print</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-tag\"></span> &nbsp;Tag</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-edit\"></span> &nbsp;Edit</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-shopping-cart\"></span> &nbsp;Shopping Cart</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-download\"></span> &nbsp;Downloads</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-comment\"></span> &nbsp;Comment</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-paperclip\"></span> &nbsp;Attachment</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-clone\"></span> &nbsp;New Window</button>\n");
      out.write("                                                <button class=\"btn btn-secondary margin\" type=\"button\"><span class=\"fa fa-wrench\"></span> &nbsp;Settings</button>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </section>\n");
      out.write("                            <section class=\"row\">\n");
      out.write("                                <div class=\"col-12 mt-1 mb-4\">Template by <a href=\"https://www.medialoot.com\">Medialoot</a></div>\n");
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
