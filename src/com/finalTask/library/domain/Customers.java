package com.finalTask.library.domain;

import java.util.ArrayList;

public class Customers {

    ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> fillListOfCustomer() {

        Customer c1 = new Customer("aleco@tut.bz", Role.USER, new PostaElectronica(
                new ArrayList<>(), new ArrayList<>()));
        c1.setCustomerPassword("As45793");
        customers.add(c1);
        Customer c2 = new Customer("albut@tut.bz", Role.USER, new PostaElectronica(
                new ArrayList<>(), new ArrayList<>()));
        c2.setCustomerPassword("RV971947");
        customers.add(c2);
        Customer c3 = new Customer("boulto@tut.bz",  Role.USER, new PostaElectronica(
                new ArrayList<>(), new ArrayList<>()));
        c3.setCustomerPassword("MN195248");
        customers.add(c3);
        Customer admin = new Customer("admin@admin.lib", Role.ADMIN, new PostaElectronica(
                new ArrayList<>(), new ArrayList<>()));
        admin.setCustomerPassword("admin");
        customers.add(admin);

        return customers;
    }

}
