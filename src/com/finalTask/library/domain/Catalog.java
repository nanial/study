package com.finalTask.library.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Catalog {

    ArrayList<Book> listOfBook = new ArrayList<>();
    ArrayList<Book> partOfList = new ArrayList<>();

    public void pagination(){

        int capacityOfPage = 20;
        int numOfPage = 0;
    }

    public void writeToFile(){
        try (FileWriter writer = new FileWriter(
                "D:\\study\\java\\study\\src\\com\\finalTask\\library\\catalog.txt", true)){
            writer.write(new Book("Levsha", "Leskov", true, "story").toString());
        }catch (IOException io){
            io.getMessage();
        }
    }
}
