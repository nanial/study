package com.task.fifth.payment.bean;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private Currency currency;
    private double balance;
    private ArrayList<Product> productList = new ArrayList<>();

    public Payment() {
    }

    public Payment(Currency currency, double balance) {
        this.currency = currency;
        this.balance = balance;
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

 public class Product{

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;

        Payment payment = (Payment) o;

        if (Double.compare(payment.getBalance(), getBalance()) != 0) return false;
        if (getCurrency() != payment.getCurrency()) return false;
        return getProductList() != null ? getProductList().equals(payment.getProductList()) : payment.getProductList() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getCurrency() != null ? getCurrency().hashCode() : 0;
        temp = Double.doubleToLongBits(getBalance());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getProductList() != null ? getProductList().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "currency=" + currency +
                ", balance=" + balance +
                ", productList=" + productList +
                '}';
    }
}
