package com.task.sixth.library.dao;

import com.task.sixth.library.apiDao.BookDao;
import com.task.sixth.library.domain.Book;
import com.task.sixth.library.filter.BookFilter;


import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class BookDaoImpl implements BookDao{

    private final int CAPACITY = 4;

    @Override
    public ArrayList<Book> getBookList(BookFilter filter) {

        ArrayList<Book> books = new ArrayList<>();

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream
                    ("D:\\study\\java\\study\\src\\com\\task\\sixth\\library\\catalog.txt")));

            books = (ArrayList<Book>) decoder.readObject();

                if (filter != null) {

                    if (filter.getAuthor() != null) {

                        for(Book b: books) {

                            if (b.getAuthor().equals(filter.getAuthor())) {

                                System.out.println(b.toString());
                            }
                        }
                    }
                    if (filter.getTitle() != null) {

                        for(Book b: books) {

                            if (b.getTitle().equals(filter.getTitle())) {

                                System.out.println(b.toString());
                            }
                        }
                    }
                    if (filter.getNumOfPage() != 0) {

                        for(Book b: books) {

                            if (b.getBookId() > (filter.getNumOfPage() - 1) * CAPACITY &&
                                    b.getBookId() <= filter.getNumOfPage() * CAPACITY) {

                                System.out.println(b.toString());
                            }
                        }
                    }
                }

        }catch (Exception io){
            io.getMessage();
        }
        return books;
    }

    @Override
    public void writeBooksInFile(ArrayList<Book> books) {

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream
                    ("D:\\study\\java\\study\\src\\com\\task\\sixth\\library\\catalog.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        encoder.writeObject(books);
        encoder.close();
    }
}
