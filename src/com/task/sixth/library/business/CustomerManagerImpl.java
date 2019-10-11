package com.task.sixth.library.business;

import com.task.sixth.library.apiBusiness.CustomerManager;
import com.task.sixth.library.apiDao.CustomerDao;
import com.task.sixth.library.domain.Book;
import com.task.sixth.library.domain.Customer;

import java.util.ArrayList;

public class CustomerManagerImpl implements CustomerManager {

    private CustomerDao dao;

    public CustomerManagerImpl(CustomerDao dao) {
        this.dao = dao;
    }

    @Override
    public ArrayList<Customer> getListCustomer() {
        return dao.getListCustomer();
    }

    @Override
    public void addInFileCustomer(ArrayList<Customer> customers) {
        dao.addInFileCustomer(customers);
    }

    @Override
    public void sendEmail(Customer customer, Book book) {
        dao.sendEmail(customer, book);
    }
}
