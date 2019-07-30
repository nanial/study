package com.task.fourth.simpleClassCustomer;

//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString().
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private BigInteger numOfCreditCard;
    private String account;

    public Customer(String surname, String name, String patronymic, BigInteger numOfCreditCard, String account) {

        this.id = count.incrementAndGet();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.numOfCreditCard = numOfCreditCard;
        this.account = account;
    }

    public Customer(String surname, String name, String patronymic, String account) {

        this.id = count.incrementAndGet();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.account = account;
    }

    private Customer(String surname, String name, String patronymic) {

        this.id = count.incrementAndGet();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Customer() {

        this.id = count.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public BigInteger getNumOfCreditCard() {
        return numOfCreditCard;
    }

    public void setNumOfCreditCard(BigInteger numOfCreditCard) {
        this.numOfCreditCard = numOfCreditCard;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "CustomerId " + id +
                ", surname " + surname +
                ", name " + name +
                ", patronymic " + patronymic +
                ", numOfCreditCard " + numOfCreditCard +
                ", account " + account;
    }

    public static void main(String[] args) {

        System.out.println(new Customer("Ivanov", "Ilia", "Ilich").toString());
    }
}

