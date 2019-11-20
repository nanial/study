package com.task.fifth.payment.runner;

//Создать класс Payment с внутренним классом, с помощью объектов
// которого можно сформировать покупку из нескольких товаров


import com.task.fifth.payment.bean.Currency;
import com.task.fifth.payment.bean.Payment;
import com.task.fifth.payment.logic.PaymentUtils;
import com.task.fifth.payment.logic.impl.PaymentUtilsImpl;

public class Main {

    public static void main(String[] args) {

        Payment payment1 = new Payment(Currency.BYN, 13658);
        PaymentUtils pu = new PaymentUtilsImpl(new Payment(Currency.BYN, 13658));

        System.out.println("Balance before purchase is " + payment1.getBalance() + " BYR");
        System.out.println("Your basket contains " +  pu.getPayment().getProductList().toString());

        pu.getPayment().getProductList().add(new Payment().new Product("toothBrush", 2.03, 3));
        pu.getPayment().getProductList().add(new Payment().new Product("toothPaste", 5.03, 1));
        pu.getPayment().getProductList().add(new Payment().new Product("swimSuit", 62.03, 2));
        pu.getPayment().getProductList().add(new Payment().new Product("slippers", 12.03, 3));

        pu.withdraw();

        System.out.println("balance after purchase is " +  pu.getPayment().getBalance() + " BYR");
        System.out.println("Your basket contains " + pu.getPayment().getProductList().toString());
    }
}
