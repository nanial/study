package com.task.fourth.simpleClass;

//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

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
class CustomerRealization{

    static Customer []  arrCustomer = new Customer[]{

            new Customer("Gorin", "Nikolay", "Semenovich", "321456791BY3074"),
            new Customer("Molochov", "Anton", "Pavlovich", "321456791BY1109"),
            new Customer("Alechin", "Boris", "Lvovich",
                    new BigInteger("321456791001456"), "321456791BY1456"),
            new Customer("Terechin", "Maxim", "Maximych", "321456791BY1459"),
            new Customer("Malyscheva", "Olga", "Kuzminicna",
                    new BigInteger("321456791003954"), "321456791BY3954"),
            new Customer("Alexeev", "Vulf", "Gerdovich",
                    new BigInteger("321456791003215"), "321456791BY3215"),
            new Customer("Grigoryan", "Anna", "Yosypovna", "321456791BY3478")

    };

    private static void showCustomers(Customer[] arrCustomer){

        for (var v: arrCustomer) {
            System.out.println(v.toString());
        }
    }

    private static Customer[] sortOfSurname() {

        for (int i = 1; i < arrCustomer.length; i++) {

            for(int j = 0; j < arrCustomer[i].getSurname().length(); j++){

               if (arrCustomer[i - 1].getSurname().charAt(j) <
                        arrCustomer[i].getSurname().charAt(j)){
                   break;
               }

               else if (arrCustomer[i - 1].getSurname().charAt(j) >
                       arrCustomer[i].getSurname().charAt(j)){

                   Customer temp = arrCustomer[i];
                   arrCustomer[i] = arrCustomer[i - 1];
                   arrCustomer[i - 1] = temp;

                   if (i > 1) {
                       i -= 2;

                   } else {
                       i--;
                   }
                   break;
               }
            }
        }
        return arrCustomer;
    }

    public static void main(String[] args) {
       /* showCustomers(arrCustomer);
        System.out.println();*/
        showCustomers(sortOfSurname());
    }
}

