package com.task.fifth.gift.bean;

import com.task.fifth.gift.bean.abstraction.AbstractPack;
import com.task.fifth.gift.bean.abstraction.AbstractSweet;
import com.task.fifth.gift.bean.classification.TypeOfPack;

public class Pack extends AbstractPack {

    private double price;
    private TypeOfPack type;

    public Pack(double price, TypeOfPack type) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TypeOfPack getType() {
        return type;
    }

    public void setType(TypeOfPack type) {
        this.type = type;
    }

    public void doGift(AbstractSweet sweet) {

        System.out.println(this + " " + sweet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pack)) return false;

        Pack pack = (Pack) o;

        if (Double.compare(pack.price, price) != 0) return false;
        return type == pack.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pack " +
                "costs " + price +
                " BYR, type " + type;
    }
}
