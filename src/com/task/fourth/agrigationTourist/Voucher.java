package com.task.fourth.agrigationTourist;


public class Voucher {

    private int countOfDays;
    private Transport transport;
    private TravelType type;
    private Meal meal;

    public Voucher(int countOfDays, Transport transport, TravelType type, Meal meal) {

        this.countOfDays = countOfDays;
        this.transport = transport;
        this.type = type;
        this.meal = meal;
    }

    public Voucher() {
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setType(TravelType type) {
        this.type = type;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public Transport getTransport() {
        return transport;
    }

    public TravelType getType() {
        return type;
    }

    public Meal getMeal() {
        return meal;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "countOfDays=" + countOfDays +
                ", transport=" + transport +
                ", type=" + type +
                ", meal=" + meal +
                '}';
    }
}
