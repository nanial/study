package com.finalTask.library.apiBusiness;

import com.finalTask.library.domain.Book;

import java.util.ArrayList;

public interface BookManager {

    ArrayList<Book> getBookList();
    void addBook(Book book);
    void delBook(Book book);
}
