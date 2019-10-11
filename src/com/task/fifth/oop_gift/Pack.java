package com.task.fifth.oop_gift;

public class Pack extends AbstractPack{

    private double price;
    private TypeOfPack type;

    public Pack(double price, TypeOfPack type) {
        this.price = price;
        this.type = type;
    }

    public void doGift(AbstractSweet sweet) {

        System.out.println(this + " " + sweet);
    }

    @Override
    public String toString() {
        return "Pack " +
                "costs " + price +
                " BYR, type " + type;
    }
}
