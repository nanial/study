package com.finalTask.library.apiBusiness;

import com.finalTask.library.domain.Book;
import com.finalTask.library.domain.Customer;

import java.util.ArrayList;

public interface CustomerChoiceManager {

    void addBookInChoice(Book book);
    ArrayList<Book> getListBookForCustomer(Customer customer);
}
