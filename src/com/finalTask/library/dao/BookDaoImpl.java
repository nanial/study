package com.finalTask.library.dao;

import com.finalTask.library.apiDao.BookDao;
import com.finalTask.library.domain.Book;


import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class BookDaoImpl implements BookDao{
    @Override
    public ArrayList<Book> getBookList() {
        ArrayList<Book> books = new ArrayList<>();

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream
                    ("D:\\study\\java\\study\\src\\com\\finalTask\\library\\catalog.txt")));

            books = (ArrayList<Book>) decoder.readObject();

            for(Book b: books){
                System.out.println(b.toString());
            }
        }catch (Exception io){
            io.getMessage();
        }
        return books;
    }

    @Override
    public void addBook(ArrayList<Book> books) {
        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream
                    ("D:\\study\\java\\study\\src\\com\\finalTask\\library\\catalog.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        encoder.writeObject(books);
        encoder.close();
    }

    @Override
    public void delBook(Book book) {

    }
}
