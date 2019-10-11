package com.task.sixth.library.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {

    private static int count = 0;
    private int customerId;
    private String customerEmail;//NAME of email
    private Object customerPassword;
    private Role role;
    private ArrayList<Book> inBox;
    private ArrayList<Book> outBox;

    public Customer() {
    }

    public Customer(String customerEmail, Role role) {

        setCustomerId(++count);
        this.customerEmail = customerEmail;
        this.role = role;
        this.inBox = new ArrayList<>();
        this.outBox = new ArrayList<>();
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Object getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(Object customerPassword) {
        this.customerPassword =  customerPassword.hashCode();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public ArrayList<Book> getInBox() {
        return inBox;
    }

    public void setInBox(ArrayList<Book> inBox) {
        this.inBox = inBox;
    }

    public ArrayList<Book> getOutBox() {
        return outBox;
    }

    public void setOutBox(ArrayList<Book> outBox) {
        this.outBox = outBox;
    }

    @Override
    public String toString() {
        return  getCustomerId() + " " + getCustomerEmail()  +
                " " + getCustomerPassword() + " " +
                getRole();
    }
}
