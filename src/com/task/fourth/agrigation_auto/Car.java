package com.task.fourth.agrigation_auto;

public class Car {
    private String model;
    private Wheel[] wheels;
    private Engine engine;
    private boolean isFullTank;

    public Car(String model, Engine engine, boolean isFullTank) {
        this.model = model;
        this.engine = engine;
        this.isFullTank = isFullTank;
    }

    public Car(String model, Wheel[] wheels, Engine engine, boolean isFullTank) {
        this.model = model;
        this.wheels = wheels;
        this.engine = engine;
        this.isFullTank = isFullTank;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    public boolean getIsFullTank() {
        return isFullTank;
    }

    public void setFullTank(boolean fullTank) {
        isFullTank = fullTank;
    }
    public void refueling(Fuel fuel){
        if(this.getIsFullTank() == false && fuel == engine.getFuel()){
            this.setFullTank(true);
            System.out.println("The tank is filled up. Thanks");
        }
    }
    public void changeWheel(Wheel wheel) {
        if (wheel.getIsChangeSeason() ||
                wheel.getHasAccident()) {
            wheel.setUsefulRubber(true);
            System.out.println("The wheel is changed");
        }
    }
    public void moveCar(String location1, String location2){

        if(location1 != location2 && wheels.length == 4){
            System.out.println("The car is moving");
        }

    }
    public  void printModel(){
        System.out.println(model);
    }
}
