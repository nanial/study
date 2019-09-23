package com.finalTask.library.apiBusiness;

import com.finalTask.library.domain.Book;
import com.finalTask.library.domain.Customer;

import java.util.ArrayList;

public interface CustomerManager {

    ArrayList<Customer> getListCustomer();
    void addInFileCustomer(ArrayList<Customer> customers);
    void sendEmail(Customer customer, Book book);
}
