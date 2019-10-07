package com.finalTask.harbor;

public class Ship extends Thread {

    private long  carrying;
    private int numberOfBox;
    private Port port;

    public Ship(String name, long carrying, int numberOfBox, Port port) {

        super(name);
        this.carrying = carrying;
        this.numberOfBox = numberOfBox;
        this.port = port;
    }

    public long getCarrying() {
        return carrying;
    }

    public void setCarrying(long carrying) {
        this.carrying = carrying;
    }

    public int getNumberOfBox() {
        return numberOfBox;
    }

    public void setNumberOfBox(int numberOfBox) {
        this.numberOfBox = numberOfBox;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public void loading(){

        if(port.isHasAvailableDock() == true) {

            numberOfBox++;
            port.setCurrentNumOfBox(port.getCurrentNumOfBox() - 1);
        }
    }
    private void unloading(){

        if(port.isHasAvailableDock() == true) {

            numberOfBox--;
            port.setCurrentNumOfBox(port.getCurrentNumOfBox() + 1);

        }
    }

    @Override
    public void run() {

           this.loading();
           this.unloading();
    }
}
