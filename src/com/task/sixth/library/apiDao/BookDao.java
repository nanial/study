package com.task.sixth.library.apiDao;

import com.task.sixth.library.domain.Book;
import com.task.sixth.library.filter.BookFilter;

import java.util.ArrayList;

public interface BookDao {

    ArrayList<Book> getBookList(BookFilter filter);
    void writeBooksInFile(ArrayList<Book> book);
}
