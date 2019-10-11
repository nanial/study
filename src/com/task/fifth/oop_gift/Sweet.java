package com.task.fifth.oop_gift;

public class Sweet extends AbstractSweet {

    private double cost;
    private double weight;
    private TypeOfSweet type;

    public Sweet(double weight, TypeOfSweet type) {
        this.weight = weight;
        this.type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public TypeOfSweet getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "and sweet " +
                "costs " + cost +
                " BYR, weight " + weight +
                ", type " + type;
    }
}
