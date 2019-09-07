package com.finalTask.library.dao;

import com.finalTask.library.apiDao.BookDao;
import com.finalTask.library.domain.Book;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookDaoImpl implements BookDao {
    @Override
    public ArrayList<Book> getBookList() {
        ArrayList<String> books;
        try {
            books = (ArrayList<String>) Files.readAllLines
                    (Paths.get("D:\\study\\java\\study\\src\\com\\finalTask\\library\\catalog.txt"));
            for(String s: books){
                System.out.println(s);
            }
        }catch (IOException io){
            io.getMessage();
        }
        return null;
    }

    @Override
    public void addBook(Book book) {
        try (FileWriter writer = new FileWriter(
                "D:\\study\\java\\study\\src\\com\\finalTask\\library\\catalog.txt", true)){
            writer.write(new Book().toString());
        }catch (IOException io){
            io.getMessage();
        }
    }

    @Override
    public void delBook(Book book) {

    }
}
