package com.finalTask.library.dao;

import com.finalTask.library.apiDao.CustomerDao;
import com.finalTask.library.domain.Book;
import com.finalTask.library.domain.Customer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public ArrayList<Customer> getListCustomer() {
        ArrayList<String> customers;
        ArrayList<Customer> cust = new ArrayList<>();

        try {
            customers = (ArrayList<String>) Files.readAllLines
                    (Paths.get("D:\\study\\java\\study\\src\\com\\finalTask\\library\\customers.txt"));

            for(String s: customers){
                System.out.println(s);
            }
        }catch (IOException io){
            io.getMessage();
        }
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {

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
