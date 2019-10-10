package com.finalTask.harbor;

import com.finalTask.harbor.Port;

public class Ship extends Thread {

    private int carrying;// number of box
    private int currentNumberOfBox;
    private int boxToUnload;
    private int boxToLoad;
    private Port port;

    public Ship(String name, int carrying, int currentNumberOfBox,
                int boxToUnload, int boxToLoad, Port port) {

        super(name);
        this.carrying = carrying;
        this.currentNumberOfBox = currentNumberOfBox;
        this.boxToUnload = boxToUnload;
        this.boxToLoad = boxToLoad;
        this.port = port;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getBoxToUnload() {
        return boxToUnload;
    }

    public void setBoxToUnload(int boxToUnload) {
        this.boxToUnload = boxToUnload;
    }

    public int getBoxToLoad() {
        return boxToLoad;
    }

    public void setBoxToLoad(int boxToLoad) {
        this.boxToLoad = boxToLoad;
    }

    public int getCurrentNumberOfBox() {
        return currentNumberOfBox;
    }

    public void setCurrentNumberOfBox(int currentNumberOfBox) {
        this.currentNumberOfBox = currentNumberOfBox;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public void loading() {

        System.out.println("For init on board of " + this.getName()  + " are " +
                this.getCurrentNumberOfBox()  + " boxes");

        this.setCurrentNumberOfBox(this.getCurrentNumberOfBox() + this.getBoxToLoad());

        System.out.println("After loading on board of " + this.getName()  + " are " +
                this.getCurrentNumberOfBox()  + " boxes");

        port.setCurrentNumOfBox(port.getCurrentNumOfBox() - this.getBoxToLoad());

        System.out.println("After loading in port remain " +
                port.getCurrentNumOfBox() + " boxes");

    }

    private void unloading() {

        System.out.println("For init on board of ship " + this.getName() + " are " +
                this.getCurrentNumberOfBox() + " boxes");
        this.setCurrentNumberOfBox(this.getCurrentNumberOfBox() - this.getBoxToUnload());

        System.out.println("After unloading on board of " + this.getName()  + " are " +
                this.getCurrentNumberOfBox()  + " boxes");

        port.setCurrentNumOfBox(port.getCurrentNumOfBox() + this.getBoxToUnload());

        System.out.println("After unloading in port remain " +
                port.getCurrentNumOfBox() + " boxes");

    }

    @Override
    public void run() {

        int choice = (int) Math.round(Math.random());

        if(choice == 0) {

            this.loading();
        }
        else {

            this.unloading();
        }
    }

}
