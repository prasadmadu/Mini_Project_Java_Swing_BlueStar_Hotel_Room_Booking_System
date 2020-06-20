<%-- 
    Document   : new
    Created on : Dec 1, 2018, 9:05:48 AM
    Author     : Madusha Ravishani
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="images/icons/favicon.png"/>
        <title>BlueStar</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet">
        
        <link href="fonts/antonio-exotic/stylesheet.css" rel="stylesheet">
        <link rel="stylesheet" href="css/lightbox.min.css">
        <link href="css/responsive.css" rel="stylesheet">
        <link rel="stylesheet" href="css/roomBooking.css">
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/lightbox-plus-jquery.min.js" type="text/javascript"></script>
        <script src="js/instafeed.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
        
    </head>
    <body>
        
        <div id="page">
            <!---header top---->
            <div class="top-header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                            <!--                            <a href="#"> </a>
                                                        <div class="info-block"><i class="fa fa-map"></i>701 Old York Drive Richmond USA.</div>-->
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
                                            <li><a  data-hover="Home" class="active"><span>Home</span></a></li>
                                            <li><a data-hover="About"  href="about.html"><span>About</span></a></li>
                                            <li><a data-hover="Rooms"  href="rooms.html"><span>Rooms</span></a></li>
                                            <li><a data-hover="Gallery"  href="gallery.html"><span>Gallery</span></a></li>
                                            <li><a data-hover="Dinning" href="dinning.html"><span>Dinning</span></a></li>
                                            <li><a data-hover="News" href="news.html"><span>News</span></a></li>
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
            
       <input type="hidden" id="notify-bar" name="notify-bar" />
            <input type="hidden" id="message" name="message" />
            <div class="message">
                
                <%
                    //personal details
                    String gender = request.getParameter("gender");
                    String nic = request.getParameter("nic");
                    String address = request.getParameter("address");
                     String title= request.getParameter("title");
                    String fname = request.getParameter("fname");
                    String teleNo = request.getParameter("teleNo");
                    String alt_teleNo = request.getParameter("alt_teleNo");
                    String email = request.getParameter("email");
                    String dob = request.getParameter("dob");
                    String status = request.getParameter("status");
                    
                    //O/L result
                    String english = request.getParameter("english");
                    String maths = request.getParameter("maths");
                    
                    //A/L result
                    String sub1 = request.getParameter("sub1");
                    String sub1_result = request.getParameter("sub1_result");
                    String sub2 = request.getParameter("sub2");
                    String sub2_result = request.getParameter("sub2_result");
                    String sub3 = request.getParameter("sub3");
                    String sub3_result = request.getParameter("sub3_result");
                    String sub4 = request.getParameter("sub4");
                    String sub4_result = request.getParameter("sub4_result");
                    
                    //professional qualifications
                    String pq1 = request.getParameter("pq1");
                    String pq2 = request.getParameter("pq2"); 
                    String pq3 = request.getParameter("pq3");
                    
                    //special qualifications
                    String sq1 = request.getParameter("sq1");
                    String sq2 = request.getParameter("sq2");
                    String sq3 = request.getParameter("sq3");
                    
                    //professional experience
                    String pe1 = request.getParameter("pe1");
                    String pe2 = request.getParameter("pe2");
                    String pe3 = request.getParameter("pe3");
                      
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar","root","");
                        Statement stmt = con.createStatement();
                        String query = "INSERT INTO vacancy (gender,nic,address,Title,fname,teleNo,alt_teleNo,email,status,dob,english,maths,sub1,sub1_result,sub2,sub2_result,sub3,sub3_result,sub4,sub4_result,PQ1,PQ2,PQ3,SQ1,SQ2,SQ3,PE1,PE2,PE3) VALUES ('"+gender+"', '"+nic+"', '"+address+"', '"+title+"', '"+fname+"','"+teleNo+"', '"+alt_teleNo+"', '"+email+"', '"+status+"','"+dob+"','"+english+"','"+maths+"','"+sub1+"','"+sub1_result+"','"+sub2+"','"+sub2_result+"','"+sub3+"','"+sub3_result+"','"+sub4+"','"+sub4_result+"','"+pq1+"','"+pq2+"','"+pq3+"','"+sq1+"','"+sq2+"','"+sq2+"','"+pe1+"','"+pe2+"','"+pe3+"')";
                        int n =  stmt.executeUpdate(query);
                        if (n!=0){
                            out.println("<h4>Your details insert Successfully... </h4>");
                        }else{
                            out.println("<h4>Error while inserting your details..</h4>");
                        }
                        
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                %>
                
            </div>
        
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
                                    <li class="active"><a>Home</a></li>
                                    <li><a href="about.html">About</a></li>
                                    <li><a href="rooms.html">Rooms</a></li>
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

   

