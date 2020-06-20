
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
        <title>vacayhome</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet">
        <link href="fonts/antonio-exotic/stylesheet.css" rel="stylesheet">
        <link rel="stylesheet" href="css/lightbox.min.css">
        <link href="css/responsive.css" rel="stylesheet">
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/lightbox-plus-jquery.min.js" type="text/javascript"></script>
        <script src="js/instafeed.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
        
        
        <script type="text/javascript">
      
      
      function available(){
          
          var date=document.availablehall.fromdate.value;
          
          if(date==""){
              alert("select date for check available date");
              document.availablehall.fromdate.focus();
              return false;
              
          }
          
          function sucess(){
               alert("Scussfuly Booked");
              
              
          }
          
          
      }
      
     
  </script>
      
    </head>
    <body>
        <div id="page">
            <!---header top---->
            <div class="top-header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">

                        </div>
                        <div class="col-md-6"><div class="social-grid">
                                <ul class="list-unstyled text-right">
                                    <li><a><i class="fa fa-facebook"></i></a></li>
                                    <li><a><i class="fa fa-twitter"></i></a></li>
                                    <li><a><i class="fa fa-linkedin"></i></a></li>
                                    <li><a><i class="fa fa-instagram"></i></a></li>
                                </ul>
                            </div></div>
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
                                    <a href="index.html"><span>vacay</span>home</a>
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
                                            <li><a data-hover="About"  href="about.html"><span>About</span></a></li>
                                            <li><a data-hover="Rooms"  class="active"><span>Rooms</span></a></li>
                                            <li><a data-hover="Gallery"  href="gallery.html"><span>Gallery</span></a></li>
                                            <li><a data-hover="Dinning" href="dinning.html"><span>Dinning</span></a></li>
                                            <li><a data-hover="News" href="blog.html"><span>News</span></a></li>
                                            <li><a data-hover="Contact Us" href="contact.html"><span>contact Us</span></a></li>
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
            
            
            
            
            
            
            
            
            
            
            
            
<!-- MY CODE-->
<div class="container">
          <div class="form-group row">
           <div id="homeimgehall">
   <div class="col-xs-8">
        <img src="images/img2.JPG" alt="Img" width="700"  id="image" >
   </div>
             </div>
             
      <div class="col-md-4 col-sm-12 col-xs-12">
    <div id="box">
       <%

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
                %>
            </div>
    </div>
        </div>
</div>            
            
  
            
      <!--MY CODE-->      

      			  <!---footer--->
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
                                    <li><a href="index.html">Home</a></li>
                                    <li><a href="roomBooking.html">Rooms</a></li>
                                    <li class="active">Wedding Hall</li>
                                    <li><a href="bar_booking.html">Bar</a></li>
                                    <li><a href="form.html">Careers</a></li>
                                  
                                    
                                    <li> <a href="contact.html">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="footer-details">
                                <h4>Now On Instagram</h4>
                                
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="copyright">
                        &copy; 2017 All right reserved.
                    </div>

            </footer>

        </div>
    </body>
</html>
