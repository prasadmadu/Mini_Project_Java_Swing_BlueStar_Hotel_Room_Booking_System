<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Properties"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <%
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar","root","");
                Statement stmt = con.createStatement();
                String id=request.getParameter("id");
                String query="UPDATE roombookingnew SET Status='Approve' WHERE RMbookingID='"+id+"'";
                String query1="UPDATE hallbooking SET Status='Approve' WHERE hallbookingid='"+id+"'";
                String query2="UPDATE barbooking SET Status='Approve' WHERE barId='"+id+"'";
                stmt.execute(query);
                stmt.execute(query1);
                stmt.execute(query2);
              
                response.sendRedirect("approve.jsp");
            }
        catch(Exception e){
               out.println("Error:"+e.getMessage());
            }
        %>
    </body>
</html>
