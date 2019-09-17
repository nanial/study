package com.finalTask.library.filter;

public class BookFilter {

    private String title;
    private String author;
    private int bookPerPage;

    public BookFilter(String author, String title) {
        this.author = author;
        this.title = title;
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

    public int getBookPerPage() {
        return bookPerPage;
    }

    public void setBookPerPage(int bookPerPage) {
        this.bookPerPage = bookPerPage;
    }

}
