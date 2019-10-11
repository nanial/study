package com.task.sixth.library.apiDao;

import com.task.sixth.library.domain.Book;
import com.task.sixth.library.domain.Customer;

import java.util.ArrayList;

public interface CustomerDao {
    ArrayList<Customer> getListCustomer();
    void addInFileCustomer(ArrayList<Customer> customers);
    void sendEmail(Customer customer, Book book);
}
