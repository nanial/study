package com.task.fourth.simple_class;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать
// или уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите
// инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
// получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class DecimalCounter {

    private  int counter;
    private  int min;
    private  int max;

    private DecimalCounter() {

        this.counter = 0;
        this.max = 10;
        this.min = -10;
    }

    private DecimalCounter(int counter, int min, int max) {
        this.counter = counter;
        this.max = max;
        this.min = min;
    }

    private void increment (){

        if (counter >= min && counter < max){
            ++counter;
        }
    }

    private void decrement(){

        if (counter > min && counter <= max){
            --counter;
        }
    }

    private int getCounter(){
        return counter;
    }

    public static void main(String[] args) {

        DecimalCounter dc = new DecimalCounter(5, -15,25);
        DecimalCounter dcDefault = new DecimalCounter();

        System.out.println(dc.counter);
        System.out.println(dcDefault.counter);
        System.out.println();

        dc.increment();
        dcDefault.increment();

        System.out.println(dc.getCounter());
        System.out.println(dcDefault.getCounter());
        System.out.println();

        dc.decrement();
        dcDefault.decrement();

        System.out.println(dc.getCounter());
        System.out.println(dcDefault.getCounter());
    }
}



