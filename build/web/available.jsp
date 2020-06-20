<%-- 
    Document   : available
    Created on : Nov 28, 2018, 5:44:44 PM
    Author     : hp
--%>


<%@page import="java.text.DateFormat"%>
<%@page import="com.mysql.jdbc.ResultSetMetaData"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="images/icons/favicon.png"/>
        <title>BlueStar</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
	<link href="css/responsive.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="fonts/antonio-exotic/stylesheet.css" rel="stylesheet">
    </head>
    <body>
         
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
                                    <!--<a href="index.html"><img src="images/logo.png" alt="logo"></a>-->
                                    <a href="home.html"><span> Blue</span>Star</a>
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
                                         <li><a  data-hover="Home" href="index.html"><span>Home</span></a></li>
                                            <li><a data-hover="Rooms"  href="roomBooking.html" ><span>Rooms</span></a></li>
                                            <li><a data-hover="Wedding" class="active"><span>W-Hall</span></a></li>
                                            <li><a data-hover="Bar" href="bar_booking.html"><span>Bar</span></a></li>
                                            <li><a data-hover="Careers" href="apply.html"><span>Careers</span></a></li>
                                        </ul>

                                    </div>
                                </nav>
                            </div>
                            <div class="col-md-2  col-sm-4 col-xs-12 hidden-sm">
                                <div class="text-right"><button type="button" class="book-now-btn">Book Now</button></div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>

            <div class="message">
       <%

       String frmdate = request.getParameter("fromdate");
    
      
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar","root","");
                        Statement stmt = con.createStatement();
          
           String query3 = "SELECT * FROM roombookingnew WHERE Arrive = '"+frmdate+"' ";
           ResultSet rs = stmt.executeQuery(query3);
               if(rs.next()){
                String activate = rs.getString("Status");
                if(activate.equals("Approve")){
                 out.println("Already Booked");  
                }
              
             }else{
               
                out.println("Not Booked");
               }
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                %>
   </div>
   <form action="available.jsp" method="post">
       <div class="panel panel-default" >
    
           
           <div  class="panel-body" style="color:#800080;width:400px;height:500px;margin-left:400px;">
               <center> <h3>Room Availability</h3></center>
       <label for="ex1"> Date</label>
        <input type="date" name="fromdate" id="fromdate"  class="form-control">
           <span id="fDate" class="text-danger font-weight-bold"></span>
           <input type="submit" class="btn btn-success" value="Check Availability" style="width:150px; margin-top:30px; margin-left: 100px;">    </div>
       </div>
</form>
             <footer>
                <div class="container">
                    <div class="row">
                        <div class="col-md-3 col-sm-6 col-xs-12 width-set-50">
                            <div class="footer-details">
                                <h4>Get in touch</h4>
                                <ul class="list-unstyled footer-contact-list">
                                    <li>
                                        <i class="fa fa-map-marker fa-lg"></i>
                                        <p>2 SIR CHITTAMPLAMA GARDINER MAWATHA COLOMBO, SRI LANKA.</p>
                                    </li>
                                    <li>
                                        <i class="fa fa-phone fa-lg"></i>
                                        <p><a href="tel:+1-202-555-0100"> +11- 456 6759</a></p>
                                    </li>
                                    <li>
                                        <i class="fa fa-envelope-o fa-lg"></i>
                                        <p><a href="mailto:demo@info.com"> demo@info.com</a></p>
                                    </li>
                                </ul>
                                <div class="footer-social-icon">
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>                           
                                    <a href="#"><i class="fa fa-instagram"></i></a>
                                    <a href="#"><i class="fa fa-google-plus"></i></a>
                                    <a href="#"><i class="fa fa-youtube-play"></i></a>
                                </div>
                                <div class="input-group" id="subscribe">
                                    <input type="text" class="form-control subscribe-box" value="" name="subscribe" placeholder="EMAIL ID">
                                    <span class="input-group-btn">
                                        <button type="button" class="btn subscribe-button"><i class="fa fa-paper-plane fa-lg"></i></button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6 col-xs-12 width-50 width-set-50">
                            <div class="footer-details">
                                <h4>explore</h4>
                                <ul class="list-unstyled footer-links">
                                    <li><a href="index.html">Rooms</a></li>
                                    <li class="active"></li>
                                    <li><a href="gallery.html">Gallery</a></li>
                                    <li><a href="#">Dinning</a></li>
                                    <li> <a href="news.html">News</a></li>
                                    <li> <a href="contact.html">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="footer-details">
                                <h4>Now On Instagram</h4>
                                <div class="row">
                                    <div class="instagram-images">
                                        <div id="instafeed"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="copyright">
                        &copy; 2017 All right reserved. Designed by <a href="http://www.themevault.net/" target="_blank">ThemeVault.</a>
                    </div>

                </div>
            </footer>

            <!--back to top--->
            <a style="display: none;" href="javascript:void(0);" class="scrollTop back-to-top" id="back-to-top">
                <span><i aria-hidden="true" class="fa fa-angle-up fa-lg"></i></span>
                <span>Top</span>
            </a>

        </div>
    </body>
</html>

   
