package com.finalTask.library.domain;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private  boolean isDigital;
    private String description;

    public Book() {
    }

    public Book(String title, String author, boolean isDigital, String description) {
        this.title = title;
        this.author = author;
        this.isDigital = isDigital;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isDigital=" + isDigital +
                ", description='" + description + '\'' +
                '}';
    }
}
