package com.task.fourth.agrigation_state;

//Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры

public class Main {
    public static void main(String[] args) {
        State belarus = new State();
        System.out.println(belarus.toString());
        belarus.printCenterOfRegion();
    }
}
