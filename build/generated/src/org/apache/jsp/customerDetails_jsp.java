package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class customerDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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
      out.write("        <title>BlueStar</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <link href=\"fonts/antonio-exotic/stylesheet.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/lightbox.min.css\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/roomBooking.css\">\n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/lightbox-plus-jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/instafeed.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/custom.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        <div id=\"page\">\n");
      out.write("            <!---header top---->\n");
      out.write("            <div class=\"top-header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <!--                            <a href=\"#\"> </a>\n");
      out.write("                                                        <div class=\"info-block\"><i class=\"fa fa-map\"></i>701 Old York Drive Richmond USA.</div>-->\n");
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
      out.write("                                    <!--<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>-->\n");
      out.write("                                    <a href=\"home.html\"><span> Blue</span>Star</a>\n");
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
      out.write("                                            <li><a  data-hover=\"Home\" class=\"active\"><span>Home</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"About\"  href=\"about.html\"><span>About</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"Rooms\"  href=\"rooms.html\"><span>Rooms</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"Gallery\"  href=\"gallery.html\"><span>Gallery</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"Dinning\" href=\"dinning.html\"><span>Dinning</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"News\" href=\"news.html\"><span>News</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"Contact Us\" href=\"contact.html\"><span>contact Us</span></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("\n");
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
      out.write("            <input type=\"hidden\" id=\"notify-bar\" name=\"notify-bar\" />\n");
      out.write("            <input type=\"hidden\" id=\"message\" name=\"message\" />\n");
      out.write("            <div class=\"message\">\n");
      out.write("                <img src=\"success.jpg\" style=\"width:150px\">\n");
      out.write("        ");

            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String street = request.getParameter("street");
            String number = request.getParameter("street-number");
            String city = request.getParameter("city");
            String postcode = request.getParameter("post-code");
            String country = request.getParameter("country");
            String arrive = request.getParameter("arrive");
            String depart = request.getParameter("depart");
            int people = Integer.parseInt(request.getParameter("people"));
            String room = request.getParameter("room");
            String bed = request.getParameter("bed");
            String comment = request.getParameter("comments");
            String file = request.getParameter("file");
           try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar","root","");
                Statement stmt = con.createStatement();
                String query1 = "insert into roombookingnew(Name,Email,Phone,Street,Number,City,PostCode,Country,Arrive,Depart,People,Room,Bed,Comments,file,Status)values('"+name+"','"+email+"','"+phone+"','"+street+"','"+number+"','"+city+"','"+postcode+"','"+country+"','"+arrive+"','"+depart+"','"+people+"','"+room+"','"+bed+"','"+comment+"','"+file+"','New')";
                int n = stmt.executeUpdate(query1);
                if(n!=0){
                    out.println("Record added sucessfully");
                    
                    
                    
                }else{
                    out.println(" Error while adding record");
                }
             
            }catch(Exception e){
               out.println("Error:"+e.getMessage());
            }
            
            
      out.write("\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <footer>\n");
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
      out.write("                                    <li class=\"active\"><a>Home</a></li>\n");
      out.write("                                    <li><a href=\"about.html\">About</a></li>\n");
      out.write("                                    <li><a href=\"rooms.html\">Rooms</a></li>\n");
      out.write("                                    <li><a href=\"gallery.html\">Gallery</a></li>\n");
      out.write("                                    <li><a href=\"#\">Dinning</a></li>\n");
      out.write("                                    <li> <a href=\"news.html\">News</a></li>\n");
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
      out.write("                        &copy; 2017 All right reserved. Designed by <a href=\"http://www.themevault.net/\" target=\"_blank\">ThemeVault.</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <!--back to top--->\n");
      out.write("            <a style=\"display: none;\" href=\"javascript:void(0);\" class=\"scrollTop back-to-top\" id=\"back-to-top\">\n");
      out.write("                <span><i aria-hidden=\"true\" class=\"fa fa-angle-up fa-lg\"></i></span>\n");
      out.write("                <span>Top</span>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("   \n");
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
