package com.task.sixth.library.domain;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Book implements Serializable {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int bookId;
    private String title;
    private String author;
    private  boolean isDigital;
    private String description;

    public Book() {
    }

    public Book(String title, String author, boolean isDigital, String description) {

        this.bookId = count.incrementAndGet();
        this.title = title;
        this.author = author;
        this.isDigital = isDigital;
        this.description = description;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public boolean isDigital() {
        return isDigital;
    }

    public void setDigital(boolean digital) {
        isDigital = digital;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  getBookId() + " " + getTitle() +
                " " + getAuthor() + " " + isDigital() +
                " " + getDescription();
    }
}
