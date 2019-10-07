package com.finalTask.harbor;

import java.util.ArrayList;

public class Port {

    private long capacity;
    private final int numOfDocks = 8;
    private boolean hasAvailableDock;
    private int currentNumOfBox;

    public Port() {
    }

    public Port(long capacity, boolean hasAvailableDock, int currentNumOfBox) {
        this.capacity = capacity;
        this.hasAvailableDock = hasAvailableDock;
        this.currentNumOfBox = currentNumOfBox;
    }

    public int getNumOfDocks() {
        return numOfDocks;
    }

    public int getCurrentNumOfBox() {
        return currentNumOfBox;
    }

    public void setCurrentNumOfBox(int currentNumOfBox) {
        this.currentNumOfBox = currentNumOfBox;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }



    public boolean isHasAvailableDock() {

        return hasAvailableDock;
    }

    public void setHasAvailableDock(boolean hasAvailableDock) {
        this.hasAvailableDock = hasAvailableDock;
    }
}
