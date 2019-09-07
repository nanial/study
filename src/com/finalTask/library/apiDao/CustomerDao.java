package com.finalTask.library.apiDao;

import com.finalTask.library.domain.Book;
import com.finalTask.library.domain.Customer;

import java.util.ArrayList;

public interface CustomerDao {
    ArrayList<Customer> getListCustomer();
    void addCustomer(Customer customer);
    void delCustomer(Customer customer);
    void searchCertainBook(Book certainBook);
    void demandOfBook (Book certainBook);

}
