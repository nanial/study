package com.task.fourth.agrigationState;

public class Region {
    private String centerOfReg;
    private Locality[] localities;

    public Region(String centerOfReg, Locality[] localities) {
        this.centerOfReg = centerOfReg;
        this.localities = localities;
    }

    public String getCenterOfReg() {
        return centerOfReg;
    }
}
