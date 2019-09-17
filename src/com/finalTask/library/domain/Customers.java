package com.finalTask.library.domain;

import java.util.ArrayList;

public class Customers {

    ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> fillListOfCustomer() {

        Customer c1 = new Customer("aleco@tut.bz", Role.USER);
        c1.setCustomerPassword("As45793");
        customers.add(c1);
        Customer c2 = new Customer("albut@tut.bz", Role.USER);
        c2.setCustomerPassword("RV971947");
        customers.add(c2);
        Customer c3 = new Customer("boulto@tut.bz",  Role.USER);
        c3.setCustomerPassword("MN195248");
        customers.add(c3);
        return customers;
    }

}
