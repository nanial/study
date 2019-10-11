package com.task.sixth.archive.domain;

import java.util.ArrayList;

public class Customers {

    ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> fillListOfCustomer() {


        customers.add(new Customer("admin", Role.ADMIN));
        customers.add(new Customer("director", Role.USER));
        customers.add(new Customer("head of department", Role.USER));
        customers.add(new Customer("professor", Role.USER));
        return customers;
    }


}
