package com.finalTask.library.apiDao;

import com.finalTask.library.domain.Book;

import java.util.ArrayList;

public interface BookDao {

    ArrayList<Book> getBookList();
    void addBook(Book book);
    void delBook(Book book);
}
