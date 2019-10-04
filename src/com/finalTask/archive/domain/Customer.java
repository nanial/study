package com.finalTask.archive.domain;

public class Customer {

    private String position;
    private Role role;

    public Customer(String position, Role role) {
        this.position = position;
        this.role = role;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
