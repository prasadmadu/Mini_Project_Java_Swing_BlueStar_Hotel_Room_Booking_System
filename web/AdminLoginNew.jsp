<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
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
                            
                                    <a href="home.html"><span> Blue</span>Star</a>
                                </div>                       
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
                                            <li><a data-hover="Rooms" class="active" ><span>Rooms</span></a></li>
                                            <li><a data-hover="Wedding Halls"  href="new1.html"><span>Wedding Hall</span></a></li>
                                            <li><a data-hover="Bar" href="bar_booking.html"><span>Bar</span></a></li>
                                            <li><a data-hover="Careers" href="apply.html"><span>Careers</span></a></li>
                                            
                                        </ul>

                                    </div>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </header>


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
            
              <section class="contact-block">
                <div class="container">
                    
                    <div class="col-md-6 contact-form">
                        <h3><span>Login</span></h3>
                        <form action="AdminPage.jsp" method="post">
                            <input type="email" class="form-control" name="Email" placeholder="Email" required="">
                            <input type="password" class="form-control" name="Password" placeholder="Password" required="">
                            <button type="submit" class='btn btn-success' name="send">Submit</button>
                            
                        </form>
                    </div>
                    
                    <div class="col-md-6 contact-left-block">
                        <h3><span>Registration </span></h3>
                       <form action="AdminLoginNew.jsp" method="post">
                            <input type="email" class="form-control" name="email" placeholder="Email" required="">
                            <input type="password" class="form-control" name="password" placeholder="Password" required="">
                            <button type="submit" class='btn btn-success' name="send">Submit</button>
                        </form>
                    </div>
                
                    <div class="clearfix"></div>
                </div>
            </section>
            <%
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
      
      %>
              <%
                   
                    
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
                %>
                
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
                                    <li class="active"><a>Admin Page</a></li>
                                    <li><a href="index.html">Home</a></li>
                                    <li><a href="roomBooking.html">Rooms</a></li>
                                    <li><a href="new1.html">Wedding Hall</a></li>
                                    <li><a href="bar_booking.html">Bar</a></li>
                                    
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
                        &copy; 2017 All right reserved.
                    </div>

                </div>
            </footer>

            
        </div>
         
    </body>
</html>
