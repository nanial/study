package com.finalTask.harbor;
import java.util.concurrent.atomic.AtomicInteger;

public class Dock {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int idOfDock;
    private boolean isAvailable;

    public Dock() {

        this.idOfDock = count.incrementAndGet();
        this.isAvailable = true;
    }

    public int getIdOfDock() {
        return idOfDock;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
