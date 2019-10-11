package com.task.sixth.library.business;

import com.task.sixth.library.apiBusiness.BookManager;
import com.task.sixth.library.apiDao.BookDao;
import com.task.sixth.library.domain.Book;
import com.task.sixth.library.filter.BookFilter;

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
