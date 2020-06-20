package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public final class hallbooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("        <title>vacayhome</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"fonts/antonio-exotic/stylesheet.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/lightbox.min.css\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/lightbox-plus-jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/instafeed.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/custom.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      function available(){\n");
      out.write("          \n");
      out.write("          var date=document.availablehall.fromdate.value;\n");
      out.write("          \n");
      out.write("          if(date==\"\"){\n");
      out.write("              alert(\"select date for check available date\");\n");
      out.write("              document.availablehall.fromdate.focus();\n");
      out.write("              return false;\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          \n");
      out.write("          function sucess(){\n");
      out.write("               alert(\"Scussfuly Booked\");\n");
      out.write("              \n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          \n");
      out.write("          \n");
      out.write("      }\n");
      out.write("      \n");
      out.write("     \n");
      out.write("  </script>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"page\">\n");
      out.write("            <!---header top---->\n");
      out.write("            <div class=\"top-header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\"><div class=\"social-grid\">\n");
      out.write("                                <ul class=\"list-unstyled text-right\">\n");
      out.write("                                    <li><a><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li><a><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li><a><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                                    <li><a><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div></div>\n");
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
      out.write("                                    <!--<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>-->\n");
      out.write("                                    <a href=\"index.html\"><span>vacay</span>home</a>\n");
      out.write("                                </div>                       \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 visible-sm\">\n");
      out.write("                                <div class=\"text-right\"><button type=\"button\" class=\"book-now-btn\">Book Now</button></div>\n");
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
      out.write("                                            <li><a data-hover=\"About\"  href=\"about.html\"><span>About</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"Rooms\"  class=\"active\"><span>Rooms</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"Gallery\"  href=\"gallery.html\"><span>Gallery</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"Dinning\" href=\"dinning.html\"><span>Dinning</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"News\" href=\"blog.html\"><span>News</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"Contact Us\" href=\"contact.html\"><span>contact Us</span></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2  col-sm-4 col-xs-12 hidden-sm\">\n");
      out.write("                                <div class=\"text-right\"><button type=\"button\" class=\"book-now-btn\">Book Now</button></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("<!-- MY CODE-->\n");
      out.write("<div class=\"container\">\n");
      out.write("          <div class=\"form-group row\">\n");
      out.write("           <div id=\"homeimgehall\">\n");
      out.write("   <div class=\"col-xs-8\">\n");
      out.write("        <img src=\"images/img2.JPG\" alt=\"Img\" width=\"700\"  id=\"image\" >\n");
      out.write("   </div>\n");
      out.write("             </div>\n");
      out.write("             \n");
      out.write("      <div class=\"col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("    <div id=\"box\">\n");
      out.write("       ");


       String fromdate = request.getParameter("fromdate");
        String email = request.getParameter("email");
        String  contactno = request.getParameter("contactnumber");
        String noofclient = request.getParameter("nOfClient");
        String nic = request.getParameter("nic");
        String acornonac =request.getParameter("acornonac");
      
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar","root","");
                        Statement stmt = con.createStatement();
                        String query = "INSERT INTO hallbooking(fromdate,email,contactno,noofclient,nic,hallstatus,acornonac,Status) VALUES ('"+fromdate+"', '"+email+"', '"+contactno+"', '"+ noofclient+"', '"+ nic +"','Booked','"+acornonac+"','New')";
                        int n1 = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            
            if(n1!=0){
            
        ResultSet rs= stmt.getGeneratedKeys();
        rs.next();
        int id = rs.getInt(1);
        rs.close();
        out.println("<h1>Registration Successfull... </h1>");
                        }else{
                            out.println("<h1>Error while registering the user.</h1>");
                        }
    
 
         
      
                    
            
            
               
             
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("</div>            \n");
      out.write("            \n");
      out.write("  \n");
      out.write("            \n");
      out.write("      <!--MY CODE-->      \n");
      out.write("\n");
      out.write("      \t\t\t  <!---footer--->\n");
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
      out.write("                                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                                    <li><a href=\"roomBooking.html\">Rooms</a></li>\n");
      out.write("                                    <li class=\"active\">Wedding Hall</li>\n");
      out.write("                                    <li><a href=\"bar_booking.html\">Bar</a></li>\n");
      out.write("                                    <li><a href=\"form.html\">Careers</a></li>\n");
      out.write("                                  \n");
      out.write("                                    \n");
      out.write("                                    <li> <a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                            <div class=\"footer-details\">\n");
      out.write("                                <h4>Now On Instagram</h4>\n");
      out.write("                                \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"copyright\">\n");
      out.write("                        &copy; 2017 All right reserved.\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div>\n");
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
