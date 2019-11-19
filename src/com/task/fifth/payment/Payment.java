package com.task.fifth.payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private Currency currency;
    private double balance;
    private ArrayList<Product> productList = new ArrayList<>();

    public Payment(Currency currency, double balance) {
        this.currency = currency;
        this.balance = balance;
    }

    public void withdraw(){

        double sum = 0;

        for (Product p : productList) {
            sum += p.getPrice() * p.getQuantity();
        }
        this.setBalance(this.getBalance() - sum);
        System.out.println("Sum of purchase is " + sum + " BYR");
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Product> getProductList() {
        return productList;
    }

  static   class Product{

        private String nameOfProduct;
        private double price;
        private double quantity;

        public Product(String nameOfProduct, double price, double quantity) {
            this.nameOfProduct = nameOfProduct;
            this.price = price;
            this.quantity = quantity;
        }

        public double getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }

      @Override
      public String toString() {
          return nameOfProduct + " "+ price + " BYR " + quantity + " pc";
      }

  }

}
