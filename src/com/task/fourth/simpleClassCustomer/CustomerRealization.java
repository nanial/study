package com.task.fourth.simpleClassCustomer;

import java.math.BigInteger;
import java.util.Scanner;

public class CustomerRealization{

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

