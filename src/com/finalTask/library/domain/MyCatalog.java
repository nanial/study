package com.finalTask.library.domain;

import java.util.ArrayList;

public class MyCatalog {

    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> fillCatalog(Book book) {

        books.add(new Book("Resurrection", "Tolstoy", false, "novel"));
        books.add(new Book("War and peace", "Tolstoy", true, "novel"));
        books.add(new Book("The Enchanted Wanderer", "Leskov", false, "story"));
        books.add(new Book("Bullshit artist", "Leskov", false, "novel"));
        books.add(book);

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

}
