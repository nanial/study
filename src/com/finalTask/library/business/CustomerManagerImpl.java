package com.finalTask.library.business;

import com.finalTask.library.apiBusiness.CustomerManager;
import com.finalTask.library.apiDao.CustomerDao;
import com.finalTask.library.domain.Book;
import com.finalTask.library.domain.Customer;

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
