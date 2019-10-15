package com.task.sixth.harbor;

import java.util.ArrayList;

public class Port {

    private int capacity;
    private int currentNumOfBox;
    private ArrayList<Ship> ships = new ArrayList<>();
    private int numOfDocks;

    public Port() {
    }

    public Port(int capacity, int currentNumOfBox, int numOfdocks) {
        this.capacity = capacity;
        this.currentNumOfBox = currentNumOfBox;
        this.numOfDocks = numOfdocks;
    }

    public int getNumOfDocks() {
        return numOfDocks;
    }

    public void setNumOfDocks(int numOfDocks) {
        this.numOfDocks = numOfDocks;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    public int getCurrentNumOfBox() {
        return currentNumOfBox;
    }

    public void setCurrentNumOfBox(int currentNumOfBox) {
        this.currentNumOfBox = currentNumOfBox;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}