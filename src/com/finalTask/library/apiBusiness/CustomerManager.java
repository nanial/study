package com.finalTask.library.apiBusiness;

import com.finalTask.library.domain.Book;
import com.finalTask.library.domain.Customer;

import java.util.ArrayList;

public interface CustomerManager {

    ArrayList<Customer> getListCustomer();

    void addCustomer(Customer customer);
    void delCustomer(Customer customer);
    void searchCertainBook(Book certainBook);
    void demandOfBook (Book certainBook);
        //Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail

}
