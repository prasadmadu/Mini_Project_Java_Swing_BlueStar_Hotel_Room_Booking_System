package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public final class approve_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        public static class SMTPAuthenticator extends Authenticator{
        
            public PasswordAuthentication getPasswordAuthentication (){
            return new PasswordAuthentication("bluestarhotelnew", "Bluestar058");
}


}
        
        
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"icon\" href=\"images/icons/favicon.png\"/>\n");
      out.write("        <title>BlueStar</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t<link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("\t\t  <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"fonts/antonio-exotic/stylesheet.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Approve Admin Page</title>\n");
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
      out.write("                                    <a href=\"index.html\"><span> Blue</span>Star</a>\n");
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
      out.write("                                            <li><a  data-hover=\"AdminPage\" class=\"active\"><span>Admin Page</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"RoomBookingRetrive\"  href=\"retrive.jsp\"><span>Room Retrive</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"WeddingHallRetrive\"  href=\"HallRetrive.jsp\"><span>Wedding Hall</span></a></li>\n");
      out.write("                                            <li><a data-hover=\"BarRetrive\"  href=\"BarRetrive.jsp\"><span>Bar Retrive</span></a></li>\n");
      out.write("                                            \n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--end-->\n");
      out.write("            <div id=\"myCarousel1\" class=\"carousel slide\" data-ride=\"carousel\"> \n");
      out.write("                \n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"item active\"> <img src=\"images/11-most-beautiful-hotels-in-the-world.jpg\" style=\"width:100%; height: 500px\" alt=\"First slide\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h1>BlueStar<br></h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("      \n");
      out.write("          ");
      out.write("\n");
      out.write("        ");

        int result=0;
        if(request.getParameter("send") != null){
        
            String d_uname="bluestarhotelnew";
            String d_password="Bluestar058";
            String d_host="smtp.gmail.com";
            int d_port=465;
            
            String m_to=new String();
            String m_from="bluestarhotelnew@gmail.com";
            String m_subject= new String();
            String m_text= new String();
            
            if(request.getParameter("to") !=null){
            m_to=request.getParameter("to");
            }
            
             if(request.getParameter("subject") !=null){
            m_subject=request.getParameter("subject");
            }
             
             if(request.getParameter("message") !=null){
                 m_text="<h1>Welcome to the web app and design</h1><br/>";
                 m_text=m_text.concat(request.getParameter("message"));
                 m_text=m_text.concat("<br/><h2>Hope u Enjoy the course</h2>");
                 
                 
            }
             //create a properties object
             Properties props= new Properties();
             
             //create an SMTPAuthenticator object
             SMTPAuthenticator auth= new SMTPAuthenticator();
             
             //create a mail session object
             Session ses = Session.getInstance(props, auth);
             
             //Create a MIME style email message object
             MimeMessage msg= new MimeMessage(ses);
             msg.setContent(m_text,"text/html");
             msg.setSubject(m_subject);
             msg.setFrom(new InternetAddress( m_from));
             msg.addRecipient(Message.RecipientType.TO, new InternetAddress( m_to));
             
             try{
                 Transport transport=ses.getTransport("smtps");
                 transport.connect(d_host, d_port, d_uname,d_password);
                 
                 transport.sendMessage(msg,msg.getAllRecipients());
                 
                 transport.close();
                 result=1;
             }catch(Exception e){
             
                 out.println(e);
             }
        }
        
      out.write("\n");
      out.write("        <form action=\"approve.jsp\" method=\"post\" class=\"form-group\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"name\">To:</label>\n");
      out.write("        <input type=\"text\" id=\"name\" class=\"form-control\" name=\"to\">\n");
      out.write("        <label for=\"name\">Subject:</label>\n");
      out.write("        <input type=\"text\" id=\"name\" class=\"form-control\" name=\"subject\">\n");
      out.write("        <label for=\"name\">Message:</label>\n");
      out.write("        <textarea class=\"form-control rounded-0\" id=\"exampleFormControlTextarea1\" rows=\"5\" name=\"message\"></textarea>             \n");
      out.write("            <button type=\"reset\" class=\"btn btn-primary\" name=\"resest\">Reset</button>\n");
      out.write("            <button type=\"submit\" class='btn btn-success' name=\"send\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("      \n");
      out.write("            <script language=\"JavaScript\">\n");
      out.write("                \n");
      out.write("                function displayResult(){\n");
      out.write("                 if(document.myForm.hidden.value ===\"1\"{){\n");
      out.write("                         alert(\"Mail was sent\");\n");
      out.write("                         \n");
      out.write("                 }   \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            </script>\n");
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
