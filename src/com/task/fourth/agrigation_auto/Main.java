package com.task.fourth.agrigation_auto;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
//Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ferrari", new Wheel[4],
                new Engine(Fuel.DIESEL), false);

        car1.moveCar("minsk", "sochy");
        car1.refueling(Fuel.DIESEL);
        car1.changeWheel(new Wheel(true, false));
        car1.printModel();
    }
}
