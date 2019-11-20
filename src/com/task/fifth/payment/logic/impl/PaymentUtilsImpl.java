package com.task.fifth.payment.logic.impl;

import com.task.fifth.payment.bean.Payment;
import com.task.fifth.payment.logic.PaymentUtils;

public class PaymentUtilsImpl implements PaymentUtils {

private  Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public PaymentUtilsImpl(Payment payment) {
        this.payment = payment;
    }

    public void withdraw(){

        double sum = 0;

        for (Payment.Product p : payment.getProductList()) {
            sum += p.getPrice() * p.getQuantity();
        }
        payment.setBalance(payment.getBalance() - sum);
        System.out.println("Sum of purchase is " + sum + " BYR");
    }
}
