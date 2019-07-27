package com.task.fourth.simpleClass;

//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.math.BigInteger;
import java.util.Scanner;
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

    private static Customer []  arrCustomer = new Customer[]{

            new Customer("Gorin", "Nikolay", "Semenovich",
                    new BigInteger("321456794003215"),"321456791BY3074"),
            new Customer("Molochov", "Anton", "Pavlovich",
                    new BigInteger("321456791003215"),"321456791BY1109"),
            new Customer("Alechin", "Boris", "Lvovich",
                    new BigInteger("321456791001456"), "321456791BY1456"),
            new Customer("Terechin", "Maxim", "Maximych",
                    new BigInteger("321456791011215"),"321456791BY1459"),
            new Customer("Malyscheva", "Olga", "Kuzminicna",
                    new BigInteger("321456791003954"), "321456791BY3954"),
            new Customer("Alexeev", "Vulf", "Gerdovich",
                    new BigInteger("321456791030615"), "321456791BY3215"),
            new Customer("Grigoryan", "Anna", "Yosypovna",
                    new BigInteger("321456793003210"),"321456791BY3478")

    };

    private static void choiceCustomers(Customer[] arrCustomer){

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {
            System.out.println("Input '1' for get names of array," +
                    "'2' for surnames ,'3' for patronymic " +
                    "'4' for number of account, '5' for number of credit card ");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Input 1/2/3/4/5");
            }

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    for (var v : arrCustomer) {
                        System.out.println(v.getName());
                    }
                    break;
                case 2:
                    for (var v : arrCustomer) {
                        System.out.println(v.getSurname());
                    }
                    break;
                case 3:
                    for (var v : arrCustomer) {
                        System.out.println(v.getPatronymic());
                    }
                    break;
                case 4:
                    for (var v : arrCustomer) {
                        System.out.println(v.getAccount());
                    }
                    break;
                case 5:
                    for (var v : arrCustomer) {
                        System.out.println(v.getNumOfCreditCard());
                    }
                    break;
                default:
                    System.out.println("You have been insert incorrect command");
                    break;
            }
        }

    }
    private static void certainNumOfCred(Customer[] arrCustomer){

        for (var v: arrCustomer) {
            if((v.getNumOfCreditCard().compareTo(new BigInteger("321456791000000")) > 0) &&
                    (v.getNumOfCreditCard().compareTo(new BigInteger("321456791999999")) < 0))
            System.out.println(v.toString());
        }
    }
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
        showCustomers(arrCustomer);
        System.out.println();
        showCustomers(sortOfSurname());
        System.out.println();
        choiceCustomers(arrCustomer);
        System.out.println();
        certainNumOfCred(arrCustomer);
    }
}

