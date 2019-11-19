package com.task.fifth.payment;

//Создать класс Payment с внутренним классом, с помощью объектов
// которого можно сформировать покупку из нескольких товаров


public class Main {

    public static void main(String[] args) {

        Payment payment1 = new Payment(Currency.BYN, 13658);

        System.out.println("Balance before purchase is " + payment1.getBalance() + " BYR");
        System.out.println("Your basket contains " + payment1.getProductList());

        payment1.getProductList().add(new Payment.Product("toothBrush", 2.03, 3));
        payment1.getProductList().add(new Payment.Product("toothPaste", 5.03, 1));
        payment1.getProductList().add(new Payment.Product("swimSuit", 62.03, 2));
        payment1.getProductList().add(new Payment.Product("slippers", 12.03, 3));

        payment1.withdraw();

        System.out.println("balance after purchase is " + payment1.getBalance() + " BYR");
        System.out.println("Your basket contains " + payment1.getProductList().toString());
    }
}
