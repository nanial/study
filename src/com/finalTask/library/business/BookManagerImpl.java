package com.finalTask.library.business;

import com.finalTask.library.apiBusiness.BookManager;
import com.finalTask.library.apiDao.BookDao;
import com.finalTask.library.domain.Book;
import com.finalTask.library.filter.BookFilter;

import java.util.ArrayList;

public class BookManagerImpl implements BookManager {

    private BookDao dao;

    public BookManagerImpl(BookDao dao) {
        this.dao = dao;
    }

    public BookManagerImpl() {

    }

    @Override
    public ArrayList<Book> getBookList(BookFilter filter) {
        return dao.getBookList(filter);
    }

    @Override
    public void writeBooksInFile(ArrayList<Book> books) {
        dao.writeBooksInFile(books);
    }

}
