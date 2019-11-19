package com.task.fifth.gift.bean;

import com.task.fifth.gift.bean.classification.TypeOfSweet;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sweet)) return false;

        Sweet sweet = (Sweet) o;

        if (Double.compare(sweet.cost, cost) != 0) return false;
        if (Double.compare(sweet.getWeight(), getWeight()) != 0) return false;
        return getType() == sweet.getType();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "and sweet " +
                "costs " + cost +
                " BYR, weight " + weight +
                ", type " + type;
    }
}
