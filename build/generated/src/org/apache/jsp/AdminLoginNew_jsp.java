package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public final class AdminLoginNew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"icon\" href=\"images/icons/favicon.png\"/>\n");
      out.write("        <title>BlueStar</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"fonts/antonio-exotic/stylesheet.css\" rel=\"stylesheet\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"page\">\n");
      out.write("            <!---header top---->\n");
      out.write("            <div class=\"top-header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"social-grid\">\n");
      out.write("                                <ul class=\"list-unstyled text-right\">\n");
      out.write("                                    <li><a><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li><a><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li><a><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                                    <li><a><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--header--->\n");
      out.write("            <header class=\"header-container\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"top-row\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-2 col-sm-6 col-xs-6\">\n");
      out.write("                                <div id=\"logo\">\n");
      out.write("                            \n");
      out.write("                                    <a href=\"home.html\"><span> Blue</span>Star</a>\n");
      out.write("                                </div>                       \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 visible-sm\">\n");
      out.write("                                <div class=\"text-right\"><button type=\"button\" class=\"book-now-btn\">Notifications</button></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 col-sm-12 col-xs-12 remove-padd\">\n");
      out.write("                                <nav class=\"navbar navbar-default\">\n");
      out.write("                                    <div class=\"navbar-header page-scroll\">\n");
      out.write("                                        <button data-target=\".navbar-ex1-collapse\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\n");
      out.write("                                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                        </button>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"collapse navigation navbar-collapse navbar-ex1-collapse remove-space\">\n");
      out.write("                                        <ul class=\"list-unstyled nav1 cl-effect-10\">\n");
      out.write("                                            <li><a  data-hover=\"Home\" href=\"index.html\"><span>Home</span></a></li>\n");
      out.write("                                            <li><a  data-hover=\"AdminPage\" href=\"AdminPage.jsp\"><span>Admin Page</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"RoomBookingRetrive\"  href=\"retrive.jsp\"><span>Room Retrieve</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"WeddingHallRetrive\"  href=\"HallRetrive.jsp\"><span>Wedding Hall</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"BarRetrive\"  href=\"BarRetrive.jsp\"><span>Bar Retrieve</span></a></li>\n");
      out.write("                                            \n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2  col-sm-4 col-xs-12 hidden-sm\">\n");
      out.write("                                <form action=\"notification\">\n");
      out.write("                                <div class=\"text-right\"><button type=\"button\" class=\"book-now-btn\">Notification</button></div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("             <div id=\"myCarousel1\" class=\"carousel slide\" data-ride=\"carousel\"> \n");
      out.write("                \n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"item active\"> <img src=\"images/11-most-beautiful-hotels-in-the-world.jpg\" style=\"width:100%; height: 500px\" alt=\"First slide\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h1>BlueStar<br></h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            \n");
      out.write("              <section class=\"contact-block\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-6 contact-form\">\n");
      out.write("                        <h3><span>Login</span></h3>\n");
      out.write("                        <form action=\"AdminPage.jsp\" method=\"post\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" name=\"Email\" placeholder=\"Email\" required=\"\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"Password\" placeholder=\"Password\" required=\"\">\n");
      out.write("                            <button type=\"submit\" class='btn btn-success' name=\"send\">Submit</button>\n");
      out.write("                            \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-6 contact-left-block\">\n");
      out.write("                        <h3><span>Registration </span></h3>\n");
      out.write("                       <form action=\"AdminLoginNew.jsp\" method=\"post\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required=\"\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"\">\n");
      out.write("                            <button type=\"submit\" class='btn btn-success' name=\"send\">Submit</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            ");

      String email=request.getParameter("email");
      String password=String.valueOf(request.getParameter("password"));
      
try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar","root","");
    Statement stmt=con.createStatement();
    String query="INSERT INTO admin_details(Email,Password)VALUES('"+email+"','"+password+"')";
    int a=stmt.executeUpdate(query);
    if(a!=0){
    out.println("<p>Successfully registered.<a href='retrive.jsp'></a></p>");
    }
    else{
                out.println("<h4>Error while registering the user.</h4>");
                        }
}catch(Exception e){
out.println("<p>ERROR:"+e.getMessage()+"</p>");
}
      
      
      out.write("\n");
      out.write("              ");

                   
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar", "root", "");
                        Statement stmt = con.createStatement();
                        String query = "SELECT * FROM admin_details WHERE Email='"+email+"' AND Password='"+password+"'";
                        ResultSet rs = stmt.executeQuery(query);
                        if(rs.next()){
                            String Email = rs.getString("email");
                            out.println(Email);
                        }else{
                            out.println("<h4>Enter correct email and password.</h4>");
                        }
                        
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                
      out.write("\n");
      out.write("                \n");
      out.write("              <!---footer--->\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3 col-sm-6 col-xs-12 width-set-50\">\n");
      out.write("                            <div class=\"footer-details\">\n");
      out.write("                                <h4>Get in touch</h4>\n");
      out.write("                                <ul class=\"list-unstyled footer-contact-list\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fa fa-map-marker fa-lg\"></i>\n");
      out.write("                                        <p>2 SIR CHITTAMPLAMA GARDINER MAWATHA COLOMBO, SRI LANKA.</p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fa fa-phone fa-lg\"></i>\n");
      out.write("                                        <p><a href=\"tel:+1-202-555-0100\"> +11- 456 6759</a></p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fa fa-envelope-o fa-lg\"></i>\n");
      out.write("                                        <p><a href=\"mailto:demo@info.com\"> demo@info.com</a></p>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"footer-social-icon\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>                           \n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-group\" id=\"subscribe\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control subscribe-box\" value=\"\" name=\"subscribe\" placeholder=\"EMAIL ID\">\n");
      out.write("                                    <span class=\"input-group-btn\">\n");
      out.write("                                        <button type=\"button\" class=\"btn subscribe-button\"><i class=\"fa fa-paper-plane fa-lg\"></i></button>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 col-sm-6 col-xs-12 width-50 width-set-50\">\n");
      out.write("                            <div class=\"footer-details\">\n");
      out.write("                                <h4>explore</h4>\n");
      out.write("                                <ul class=\"list-unstyled footer-links\">\n");
      out.write("                                    <li class=\"active\"><a>Admin Page</a></li>\n");
      out.write("                                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                                    <li><a href=\"roomBooking.html\">Rooms</a></li>\n");
      out.write("                                    <li><a href=\"new1.html\">Wedding Hall</a></li>\n");
      out.write("                                    <li><a href=\"bar_booking.html\">Bar</a></li>\n");
      out.write("                                    \n");
      out.write("                                    <li> <a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                            <div class=\"footer-details\">\n");
      out.write("                                <h4>Now On Instagram</h4>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"instagram-images\">\n");
      out.write("                                        <div id=\"instafeed\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"copyright\">\n");
      out.write("                        &copy; 2017 All right reserved.\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("         \n");
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
