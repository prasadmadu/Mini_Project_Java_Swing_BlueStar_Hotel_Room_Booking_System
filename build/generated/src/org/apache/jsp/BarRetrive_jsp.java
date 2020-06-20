package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class BarRetrive_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                                            <li><a data-hover=\"W-H-Retrive\"  href=\"HallRetrive.jsp\"><span>Wedding Hall</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"BarRetrive\" class=\"active\"><span>Bar Retrieve</span></a></li>\n");
      out.write("                                            \n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            \n");
      out.write("     <div class=\"container\">\n");
      out.write("   <table class=\"table\" width=\"100%\">\n");
      out.write("    <thead class=\"thead-dark\">\n");
      out.write("      <tr>\n");
      out.write("     <th><b>barId</b></th>\n");
      out.write("    <th><b>Name</b></th>\n");
      out.write("    <th><b>Email</b></th>\n");
      out.write("    <th><b>Phone</b></th>\n");
      out.write("    <th><b>Address</b></th>\n");
      out.write("    <th><b>Date</b></th>\n");
      out.write("    <th><b>People</b></th>\n");
      out.write("    <th><b>Comments</b></th>\n");
      out.write("    <th><b>Booking Status</b></th>\n");
      out.write("    <th><b>File</b></th>\n");
      out.write("    <th><b>Status</b></th>\n");
      out.write("    \n");
      out.write("      </tr>\n");
      out.write("    </thead>        \n");
      out.write("             ");
  
             try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar","root","");
                String sql ="SELECT * FROM barbooking WHERE Status ='New'";
                Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){

      out.write("\n");
      out.write("<tbody>\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("        <td>");
out.print(rs.getInt(1));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(10));
      out.write("</td>\n");
      out.write("        <td><a href='approve.jsp?id=");
out.print(rs.getInt(1));
      out.write("' class='btn btn-success'>Approve</a></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("</tbody>\n");
 
}
       
            }catch(Exception e){
               out.println("Error:"+e.getMessage());
            }
            
            
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </div>\n");
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
