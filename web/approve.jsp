<%-- 
    Document   : approve
    Created on : Nov 30, 2018, 3:58:44 PM
    Author     : apc
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Properties"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="images/icons/favicon.png"/>
        <title>BlueStar</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		<link href="css/responsive.css" rel="stylesheet">
		  <link href="css/style.css" rel="stylesheet">
        <link href="fonts/antonio-exotic/stylesheet.css" rel="stylesheet">
        <title>Approve Admin Page</title>
    </head>
    <body onLoad="displayResult()">
        <div id="page">
            <!---header top---->
            <div class="top-header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                            
                        </div>
                        <div class="col-md-6">
                            <div class="social-grid">
                                <ul class="list-unstyled text-right">
                                    <li><a><i class="fa fa-facebook"></i></a></li>
                                    <li><a><i class="fa fa-twitter"></i></a></li>
                                    <li><a><i class="fa fa-linkedin"></i></a></li>
                                    <li><a><i class="fa fa-instagram"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--header--->
            <header class="header-container">
                <div class="container">
                    <div class="top-row">
                        <div class="row">
                            <div class="col-md-2 col-sm-6 col-xs-6">
                                <div id="logo">
                            
                                    <a href="index.html"><span> Blue</span>Star</a>
                                </div>                       
                            </div>
                            <div class="col-sm-6 visible-sm">
                                <div class="text-right"><button type="button" class="book-now-btn">Book Now</button></div>
                            </div>
                            <div class="col-md-8 col-sm-12 col-xs-12 remove-padd">
                                <nav class="navbar navbar-default">
                                    <div class="navbar-header page-scroll">
                                        <button data-target=".navbar-ex1-collapse" data-toggle="collapse" class="navbar-toggle" type="button">
                                            <span class="sr-only">Toggle navigation</span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                        </button>

                                    </div>
                                    <div class="collapse navigation navbar-collapse navbar-ex1-collapse remove-space">
                                        <ul class="list-unstyled nav1 cl-effect-10">
                                            <li><a  data-hover="AdminPage" class="active"><span>Admin Page</span></a></li>
                                            <li><a data-hover="RoomBookingRetrive"  href="retrive.jsp"><span>Room Retrive</span></a></li>
                                            <li><a data-hover="WeddingHallRetrive"  href="HallRetrive.jsp"><span>Wedding Hall</span></a></li>
                                            <li><a data-hover="BarRetrive"  href="BarRetrive.jsp"><span>Bar Retrive</span></a></li>
                                            
                                        </ul>

                                    </div>
                                </nav>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </header>


            <!--end-->
            <div id="myCarousel1" class="carousel slide" data-ride="carousel"> 
                
                <div class="carousel-inner">
                    <div class="item active"> <img src="images/11-most-beautiful-hotels-in-the-world.jpg" style="width:100%; height: 500px" alt="First slide">
                        <div class="carousel-caption">
                            <h1>BlueStar<br></h1>
                        </div>
                    </div>
                   
                </div>
               
            </div>
            <div class="clearfix"></div>
      
          <%!
        public static class SMTPAuthenticator extends Authenticator{
        
            public PasswordAuthentication getPasswordAuthentication (){
            return new PasswordAuthentication("bluestarhotelnew", "Bluestar058");
}


}
        
        %>
        <%
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
                 m_text="<h1>Your booking is accepted...</h1><br/>";
                 m_text=m_text.concat(request.getParameter("message"));
                 m_text=m_text.concat("<br/><h2>Hope you Enjoy You'r Days.. Thank You</h2>");
                 
                 
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
        %>
        <form action="approve.jsp" method="post" class="form-group">
        <div class="form-group">
        <div class="container">
        <div class="form-group">
        <label for="name">To:</label>
        <input type="text" id="name" class="form-control" name="to">
        <label for="name">Subject:</label>
        <input type="text" id="name" class="form-control" name="subject">
        <label for="name">Message:</label>
        <textarea class="form-control rounded-0" id="exampleFormControlTextarea1" rows="5" name="message"></textarea>             
            <button type="reset" class="btn btn-primary" name="resest">Reset</button>
            <button type="submit" class='btn btn-success' name="send">Submit</button>
    </div>
    </div>
    </div>
            
      
            <script language="JavaScript">
                
                function displayResult(){
                 if(document.myForm.hidden.value ==="1"{){
                         alert("Mail was sent");
                         
                 }   
                    
                }
                
            </script>
    </body>
</html>
