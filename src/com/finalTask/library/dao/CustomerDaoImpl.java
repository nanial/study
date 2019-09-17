package com.finalTask.library.dao;

import com.finalTask.library.apiDao.CustomerDao;
import com.finalTask.library.domain.Book;
import com.finalTask.library.domain.Customer;


import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

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
    public void delCustomer(Customer customer) {

    }

    @Override
    public void searchCertainBook(Book certainBook) {

    }

    @Override
    public void demandOfBook(Book certainBook) {

    }
}
