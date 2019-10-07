package com.finalTask.harbor;

import java.util.ArrayList;

public class Port {

    private long capacity;
    private boolean hasAvailableDock;
    private int currentNumOfBox;
    private ArrayList<Ship> ships = new ArrayList<>();
    private Dock[] docks = new Dock[8];

    public Port() {
    }

    public Port(long capacity, boolean hasAvailableDock, int currentNumOfBox) {
        this.capacity = capacity;
        this.hasAvailableDock = hasAvailableDock;
        this.currentNumOfBox = currentNumOfBox;
    }

    public Dock[] getDocks() {
        return docks;
    }

    public void setDocks(Dock[] docks) {
        this.docks = docks;
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
