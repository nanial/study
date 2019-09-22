package com.finalTask.library.domain;

import java.util.ArrayList;

public class Customers {

    ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> fillListOfCustomer() {

        Customer c1 = new Customer("aleco@tut.bz", Role.USER);
        c1.setCustomerPassword("As45793");
        c1.setOutBox(new ArrayList<>());
        c1.setInBox(new ArrayList<>());
        customers.add(c1);
        Customer c2 = new Customer("albut@tut.bz", Role.USER);
        c2.setCustomerPassword("RV971947");
        c2.setInBox(new ArrayList<>());
        c2.setOutBox(new ArrayList<>());
        customers.add(c2);
        Customer c3 = new Customer("boulto@tut.bz",  Role.USER);
        c3.setCustomerPassword("MN195248");
        c3.setOutBox(new ArrayList<>());
        c3.setInBox(new ArrayList<>());
        customers.add(c3);
        Customer admin = new Customer("admin@admin.lib", Role.ADMIN);
        admin.setCustomerPassword("admin");
        admin.setInBox(new ArrayList<>());
        admin.setOutBox(new ArrayList<>());
        customers.add(admin);

        return customers;
    }

}
