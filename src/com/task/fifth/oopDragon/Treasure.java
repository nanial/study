package com.task.fifth.oopDragon;

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
    public String toString() {
        return "Treasure{" +
                "id=" + id +
                ", cost=" + cost +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }
}
