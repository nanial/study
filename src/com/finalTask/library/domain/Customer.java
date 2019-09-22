package com.finalTask.library.domain;

import java.io.Serializable;

public class Customer implements Serializable {

    private static int count = 0;
    private int customerId;
    private String customerEmail;//NAME of email
    private Object customerPassword;
    private Role role;
    private PostaElectronica posta;//email

    public Customer() {
    }

    public Customer(String customerEmail, Role role, PostaElectronica posta) {

        setCustomerId(++count);
        this.customerEmail = customerEmail;
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

    public PostaElectronica getPosta() {
        return posta;
    }

    public void setPosta(PostaElectronica posta) {
        this.posta = posta;
    }

    @Override
    public String toString() {
        return  getCustomerId() + " " + getCustomerEmail()  +
                " " + getCustomerPassword() + " " +
                getRole();
    }
}
