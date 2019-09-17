package com.finalTask.library.domain;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Notification {

    private int customerId;
    private String customerEmail;//ninaushkov6@gmail.com

    public void sendEmail(){

        String to="nanial@mail.ru";
        String from = "ninaushkov6@gmail.com";
        String host = "localhost";
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);
        properties.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getDefaultInstance(properties,  new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(from,"Aa3286485090");
            }
        });

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Ping");
            message.setText("Hello, this is example of sending email  ");

            Transport tr = session.getTransport();
            tr.connect(properties.getProperty(from),
                    properties.getProperty("Aa3286485090"));
            tr.sendMessage(message, message.getAllRecipients());
            tr.close();
            System.out.println("message sent successfully....");

        }catch (MessagingException mex) {mex.printStackTrace();}
    }

}

