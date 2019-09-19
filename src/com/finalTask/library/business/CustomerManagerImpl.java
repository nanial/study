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
    public void addInFileCustomer(ArrayList<Customer> customers) {
        dao.addInFileCustomer(customers);
    }

    @Override
    public void sendEmail(String to, String from, String pass, String message) {

    }

    @Override
    public void searchCertainBook(Book certainBook) {

    }

    @Override
    public void demandOfBook(Book certainBook) {

    }
}
