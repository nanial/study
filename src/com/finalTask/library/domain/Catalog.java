package com.finalTask.library.domain;

import java.util.ArrayList;

public class Catalog {


    ArrayList<Book> books = new ArrayList<>();
    public ArrayList<Book> fillCatalog() {
        books.add(new Book("Resurrection", "Tolstoy", false, "novel"));
        books.add(new Book("War and peace", "Tolstoy", false, "novel"));
        return books;
    }
    public void pagination(){

        int capacityOfPage = 20;
        int numOfPage = 0;
    }
}
