package com.task.sixth.harbor.bean;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Port)) return false;

        Port port = (Port) o;

        if (getCapacity() != port.getCapacity()) return false;
        if (getCurrentNumOfBox() != port.getCurrentNumOfBox()) return false;
        if (getNumOfDocks() != port.getNumOfDocks()) return false;
        return getShips() != null ? getShips().equals(port.getShips()) : port.getShips() == null;
    }

    @Override
    public int hashCode() {
        int result = getCapacity();
        result = 31 * result + getCurrentNumOfBox();
        result = 31 * result + (getShips() != null ? getShips().hashCode() : 0);
        result = 31 * result + getNumOfDocks();
        return result;
    }

    @Override
    public String toString() {
        return "Port{" +
                "capacity=" + capacity +
                ", currentNumOfBox=" + currentNumOfBox +
                ", ships=" + ships +
                ", numOfDocks=" + numOfDocks +
                '}';
    }
}