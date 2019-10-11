package com.task.fourth.agrigation_tourist;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String nameOfClient;
    private String surnameOfClient;
    private long numOfInsurance;

    public Client(String nameOfClient, String surnameOfClient, long numOfInsurance) {

        this.id = count.incrementAndGet();
        this.nameOfClient = nameOfClient;
        this.surnameOfClient = surnameOfClient;
        this.numOfInsurance = numOfInsurance;
    }
}
