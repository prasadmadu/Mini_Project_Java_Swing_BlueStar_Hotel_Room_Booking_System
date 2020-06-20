<%-- 
    Document   : sendemail
    Created on : Nov 17, 2018, 9:50:43 PM
    Author     : apc
--%>
<%@page import="java.util.Properties"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sending in Email</title>
    </head>
    <body onLoad="displayResult()">
        <h1>Sending Email</h1>
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
            
            String m_to="bluestarhotelnew@gmail.com";
            String m_from=new String();
            String m_subject= new String();
            String m_text= new String();
            
            if(request.getParameter("from") !=null){
            m_from=request.getParameter("from");
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
             msg.setFrom(new InternetAddress(m_to));
             msg.addRecipient(Message.RecipientType.TO, new InternetAddress( m_from ));
             
             
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
        <form name="myForm" action="email.jsp" method="POST">
            <table border="0">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>from: </td>
                        <td> <input type="text" name="from" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>Subject: </td>
                        <td> <input type="text" name="subject" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>Message:</td>
                        <td> <textarea name="message" rows="4" cols="30"></textarea></td>
                    </tr>
                </tbody>
            </table>
            <input type="hidden" name="hidden" value="<%= result %>" />
            <input type="reset" value="clear" name="clear" />
            <input type="submit" value="submit" name="send" />
        </form>
            
            <script language="JavaScript">
                
                function displayResult(){
                 if(document.myForm.hidden.value ==="1"{){
                         alert("Mail was sent");
                         
                 }   
                    
                }
                
            </script>
    </body>
</html>
