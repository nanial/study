package com.task.fourth.simple_class;

//Создйте класс Test2 двумя переменными. Добавьте конструктор
// с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {
    private String s;
    private int a;

    public Test2(String s, int a) {
        this.s = s;
        this.a = a;
    }

    public Test2() {
        s = null;
        a = 0;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
