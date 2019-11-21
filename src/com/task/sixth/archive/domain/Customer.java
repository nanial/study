package com.task.sixth.archive.domain;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (getPosition() != null ? !getPosition().equals(customer.getPosition()) : customer.getPosition() != null)
            return false;
        return getRole() == customer.getRole();
    }

    @Override
    public int hashCode() {
        int result = getPosition() != null ? getPosition().hashCode() : 0;
        result = 31 * result + (getRole() != null ? getRole().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "position='" + position + '\'' +
                ", role=" + role +
                '}';
    }
}
