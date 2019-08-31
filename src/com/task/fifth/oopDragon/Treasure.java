package com.task.fifth.oopDragon;

import java.util.concurrent.atomic.AtomicInteger;

public class Treasure {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private long cost;
    private  double weight;
    private TypeOfTreasure type;

    public Treasure(long cost, double weight, TypeOfTreasure type) {
        this.id = count.incrementAndGet();
        this.cost = cost;
        this.weight = weight;
        this.type = type;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType(TypeOfTreasure type) {
        this.type = type;
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
}
