package com.task.fifth.dragon.bean;

import java.util.concurrent.atomic.AtomicInteger;

public class Treasure {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private long cost;
    private  double weight;
    private TypeOfTreasure type;

    public Treasure() {
    }

    public Treasure(double weight, TypeOfTreasure type) {
        this.id = count.incrementAndGet();
        this.weight = weight;
        this.type = type;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public long getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public TypeOfTreasure getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Treasure)) return false;

        Treasure treasure = (Treasure) o;

        if (getId() != treasure.getId()) return false;
        if (getCost() != treasure.getCost()) return false;
        if (Double.compare(treasure.getWeight(), getWeight()) != 0) return false;
        return getType() == treasure.getType();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + (int) (getCost() ^ (getCost() >>> 32));
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "id=" + id +
                ", cost=" + cost +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }
}
