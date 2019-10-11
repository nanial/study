package com.task.sixth.library.apiBusiness;

import com.task.sixth.library.domain.Book;
import com.task.sixth.library.filter.BookFilter;

import java.util.ArrayList;

public interface BookManager {

    ArrayList<Book> getBookList(BookFilter filter);
    void writeBooksInFile(ArrayList<Book> books);
}
