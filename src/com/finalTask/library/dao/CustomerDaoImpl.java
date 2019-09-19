package com.finalTask.library.dao;

import com.finalTask.library.apiDao.CustomerDao;
import com.finalTask.library.domain.Book;
import com.finalTask.library.domain.Customer;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public ArrayList<Customer> getListCustomer() {

        ArrayList<Customer> customers = new ArrayList<>();
        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream
                    ("D:\\study\\java\\study\\src\\com\\finalTask\\library\\customers.txt")));

            customers = (ArrayList<Customer>) decoder.readObject();

            for (Customer c : customers) {
                System.out.println(c.toString());
            }
        } catch (Exception io) {
            io.getMessage();
        }
        return customers;
    }

    @Override
    public void addInFileCustomer(ArrayList<Customer> customers) {

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream
                    ("D:\\study\\java\\study\\src\\com\\finalTask\\library\\customers.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        encoder.writeObject(customers);
        encoder.close();
    }

    @Override
    public void sendEmail(String to, String from, String pass, String mess) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.host", "smtp.gmail.com");//for example
        properties.put("mail.smtp.port", 587);//for example
        properties.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");//for example

        Session session = Session.getDefaultInstance(properties,  new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(from, pass);
            }
        });

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Notification");
            message.setText(mess);

            Transport tr = session.getTransport();
            tr.connect(properties.getProperty(from),
                    properties.getProperty(pass));
            tr.sendMessage(message, message.getAllRecipients());
            tr.close();
            System.out.println("message sent successfully....");

        }catch (MessagingException mex) {mex.printStackTrace();}

    }

    @Override
    public void searchCertainBook(Book certainBook) {

    }

    @Override
    public void demandOfBook(Book certainBook) {

    }
}
