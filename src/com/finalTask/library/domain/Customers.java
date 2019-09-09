package com.finalTask.library.domain;

import java.util.ArrayList;

public class Customers {

    ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> fillCatalog() {
        customers.add(new Customer("aleco@tut.bz", "alex012", Role.USER));
        customers.add(new Customer("albut@tut.bz", "kama091", Role.USER));
        customers.add(new Customer("boulto@tut.bz", "olimp2020", Role.USER));
        return customers;
    }
}
