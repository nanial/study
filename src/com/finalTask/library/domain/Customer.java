package com.finalTask.library.domain;

public class Customer {

    private int customerId;
    private String customerEmail;//regular expression
    private String customerPassword;
    private Role role;

    public  void viewBooks(){

    }

    public Customer(String customerEmail, String customerPassword) {
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
    }

    public Customer(String customerEmail, String customerPassword, Role role) {
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
        this.role = role;
    }


    @Override
    public String toString() {
        return  customerEmail  +
                " " + customerPassword;
    }
}
