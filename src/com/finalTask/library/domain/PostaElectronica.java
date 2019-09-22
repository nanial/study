package com.finalTask.library.domain;

import java.util.ArrayList;

public class PostaElectronica {

    private ArrayList<Book> inBox;
    private ArrayList<Book> outBox;

    public PostaElectronica(ArrayList<Book> inBox, ArrayList<Book> outBox) {
        this.inBox = inBox;
        this.outBox = outBox;
    }

    public ArrayList<Book> getInBox() {
        return inBox;
    }

    public void setInBox(ArrayList<Book> inBox) {
        this.inBox = inBox;
    }

    public ArrayList<Book> getOutBox() {
        return outBox;
    }

    public void setOutBox(ArrayList<Book> outBox) {
        this.outBox = outBox;
    }

}
