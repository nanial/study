package com.finalTask.library.apiBusiness;

import com.finalTask.library.domain.Book;
import com.finalTask.library.filter.BookFilter;

import java.util.ArrayList;

public interface BookManager {

    ArrayList<Book> getBookList(BookFilter filter);
    void writeBooksInFile(ArrayList<Book> books);
}
