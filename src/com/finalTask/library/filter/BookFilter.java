package com.finalTask.library.filter;

public class BookFilter {

    private String title;
    private String author;
    private int numOfPage;

    public BookFilter(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public BookFilter(int numOfPage) {
        this.numOfPage = numOfPage;
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

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

}
