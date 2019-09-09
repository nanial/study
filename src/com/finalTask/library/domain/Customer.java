package com.finalTask.library.domain;

import java.io.Serializable;

public class Customer implements Serializable {

    private static int count = 0;
    private int customerId;
    private String customerEmail;//regular expression
    private String customerPassword;
    private Role role;

    public Customer() {
    }

    public Customer(String customerEmail, String customerPassword, Role role) {

        setCustomerId(++count);
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
        this.role = role;
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

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return  getCustomerId() + " " + getCustomerEmail()  +
                " " + getCustomerPassword() + " " +
                getRole();
    }
}
