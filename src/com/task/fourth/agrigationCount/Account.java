package com.task.fourth.agrigationCount;

import java.math.BigInteger;

public class Account {
    private boolean isBlock;
    private long balance;
    private Currency currency;
    private BigInteger numOfAccount;
    private double exchangeCourse;
    private int idOfClient;

    public Account(long balance, Currency currency, BigInteger numOfAccount, double exchangeCourse, int idOfClient) {
        if(balance < 0) {
            isBlock = true;
        }
        this.balance = balance;
        this.currency = currency;
        this.numOfAccount = numOfAccount;
        this.exchangeCourse = exchangeCourse;
        this.idOfClient = idOfClient;
    }

    public int getIdOfClient() {
        return idOfClient;
    }

    public BigInteger getNumOfAccount() {
        return numOfAccount;
    }

    public double getExchangeCourse() {
        return exchangeCourse;
    }

    public boolean getIsBlock() {
        return isBlock;
    }

    public long getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }
}
