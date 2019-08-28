package com.task.fourth.agrigationState;

public class State {

    private final Region[] regions = new Region[]{

            new Region("Vitebsk", new Locality[21]),
            new Region("Brest", new Locality[15]),
            new Region("Mogilev", new Locality[22]),
            new Region("Gomel", new Locality[24]),
            new Region("Grodno", new Locality[12]),
            new Region("Minsk", new Locality[25]),
    };

    private final String capital = "Minsk";
    private final int square = 207_595;

    public State() {
    }

    public void printCenterOfRegion(){
        for (var v : regions) {
            System.out.println(v.getCenterOfReg());
        }
    }
    @Override
    public String toString() {
        return  capital + " " + regions.length +
                " regions " + square + " km2";
    }
}
