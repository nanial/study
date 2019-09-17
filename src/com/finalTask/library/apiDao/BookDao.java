package com.finalTask.library.apiDao;

import com.finalTask.library.domain.Book;
import com.finalTask.library.filter.BookFilter;

import java.util.ArrayList;

public interface BookDao {

    ArrayList<Book> getBookList(BookFilter filter);
    void writeBooksInFile(ArrayList<Book> book);
}
