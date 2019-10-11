package com.task.fourth.simple_class_book;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
// set- и get- методы и метод toString().
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

import java.util.concurrent.atomic.AtomicInteger;

public class Book {

    private static final AtomicInteger count = new AtomicInteger(0);
    private String title;
    private String author;
    private String editHouse;
    private int editYear;
    private int countOfPage;
    private double price;
    private boolean hardBindingType;

    public Book() {
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String title, String author, String editHouse, int editYear, int countOfPage, double price) {
        this.title = title;
        this.author = author;
        this.editHouse = editHouse;
        this.editYear = editYear;
        this.countOfPage = countOfPage;
        this.price = price;
    }

    private Book(String title, String author,
                String editHouse, int editYear,
                int countOfPage, double price,
                boolean hardBindingType) {

        this.title = title;
        this.author = author;
        this.editHouse = editHouse;
        this.editYear = editYear;
        this.countOfPage = countOfPage;
        this.price = price;
        this.hardBindingType = hardBindingType;
    }

    public static AtomicInteger getCount() {
        return count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditHouse() {
        return editHouse;
    }

    public void setEditHouse(String editHouse) {
        this.editHouse = editHouse;
    }

    public int getEditYear() {
        return editYear;
    }

    public void setEditYear(int editYear) {
        this.editYear = editYear;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int countOfPage) {
        this.countOfPage = countOfPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHardBindingType() {
        return hardBindingType;
    }

    public void setHardBindingType(boolean hardBindingType) {
        this.hardBindingType = hardBindingType;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" " + author + " editHouse is " + editHouse +
                " " + editYear + " year of edition " + countOfPage +
                " pg. " + price + " rub ";
    }

    public static void main(String[] args) {
        System.out.println(new Book("Resurrection", "Tolstoy",
                "Blankizdat", 1962, 532, 32,
                true).toString());
    }
}
