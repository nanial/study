package com.task.fourth.simpleClass;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран
// и методы изменения этих переменных. Добавьте метод, который
// находит сумму значений этих переменных, и метод, который
// находит наибольшее значение из этих двух переменных.

public class Test1 {

    private int a;
    private int b;

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum(int a, int b){
        return a + b;
    }

    public int getMax(int a, int b){

        if (a > b){
            return a;
        }
            return b;

    }
}
