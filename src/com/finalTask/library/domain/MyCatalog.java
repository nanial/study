package com.finalTask.library.domain;

import java.util.ArrayList;

public class MyCatalog {


    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> fillCatalog() {

        Notification not = new Notification();
        books.add(new Book("Resurrection", "Tolstoy", false, "novel"));
        not.sendEmail();
        books.add(new Book("War and peace", "Tolstoy", true, "novel"));
        books.add(new Book("The Enchanted Wanderer", "Leskov", false, "story"));

        return books;
    }

    public ArrayList<Book> delBook(int bookId) {

        books.remove(bookId);
        return books;
    }
    public ArrayList<Book> updateBook(int bookId, boolean isDigital, String description) {

        for (Book b : books) {
            if (b.getBookId() == bookId){
                b.setDigital(isDigital);
                b.setDescription(description);
            }
        }
        return books;
    }
    public void pagination() {

        final int capacityOfPage = 5;
        int numOfPage = 0;
    }
}
