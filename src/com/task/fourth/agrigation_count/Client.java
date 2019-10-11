package com.task.fourth.agrigation_count;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Client {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private String surname;
    private List<Account> accounts;

    public Client(String surname, String name, List<Account> accounts) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.surname = surname;
        this.accounts = accounts;
    }

    public Client(String name, String surname) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }
}
