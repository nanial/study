package com.finalTask.library.business;

import com.finalTask.library.apiBusiness.BookManager;
import com.finalTask.library.apiDao.BookDao;
import com.finalTask.library.domain.Book;

import java.util.ArrayList;

public class BookManagerImpl implements BookManager {

    private BookDao dao;

    public BookManagerImpl(BookDao dao) {
        this.dao = dao;
    }

    public BookManagerImpl() {

    }

    @Override
    public ArrayList<Book> getBookList() {
        return dao.getBookList();
    }

    @Override
    public void addBook(ArrayList<Book> books) {
        dao.addBook(books);
    }

    @Override
    public void delBook(Book book) {
        dao.delBook(book);
    }
}
