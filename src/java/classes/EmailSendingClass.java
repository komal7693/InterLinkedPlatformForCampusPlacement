/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import PojoClasses.InstitutePojo;
import javax.mail.Authenticator;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

 class MyAuthenticator extends Authenticator{
    private String username,password;
    public MyAuthenticator(String username,String password){
        this.username=username;
        this.password=password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth=new PasswordAuthentication(this.username,this.password);        
        return pwdAuth;
    }
 }
    
public class EmailSendingClass {
    public static void sendMail(InstitutePojo obj) {
        final String username = "hmaywad9589@gmail.com";
        final String password = "nketfywfcgpclihg";
        // Step 1
        Properties prop = new Properties();
	prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
        MyAuthenticator myAuth=new MyAuthenticator(username,password);        
        Session session = Session.getInstance(prop,myAuth);                

        try {

            Message message = new MimeMessage(session);
            InternetAddress[]recipients=InternetAddress.parse(obj.getEmail());
            message.setRecipients(
                    Message.RecipientType.TO,
                    recipients
            );
           message.setSubject("Login Credentails For Company From Training And Placement Application");
            message.setText("Hello "+obj.getName()+",\nWarm Welcome in Training And Placement Application.\n"
                +"Your Login Crendials - \n\n"
             
                +"Email - "+obj.getEmail()+"\n"
                +"Password - "+obj.getPassword()+"\n"
                +"\nWarm Regards\n"
                +"Training And Placement Application");
              
           
                Transport.send(message);
               

            System.out.println("Mail Sent Successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
