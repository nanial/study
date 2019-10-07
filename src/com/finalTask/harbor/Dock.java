package com.finalTask.harbor;

public class Dock {

    private int numberOfDock;
    private boolean isAvailable;

    public Dock(int numberOfDock, boolean isAvailable) {
        this.numberOfDock = numberOfDock;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfDock() {
        return numberOfDock;
    }

    public void setNumberOfDock(int numberOfDock) {
        this.numberOfDock = numberOfDock;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
