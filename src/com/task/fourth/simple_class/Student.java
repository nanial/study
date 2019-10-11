package com.task.fourth.simple_class;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
// номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого
// типа. Добавьте возможность вывода фамилий и номеров групп студентов,
// имеющих оценки, равные только 9 или 10.


public class Student {
    private  String surName;
    private  int numOfGroup;
    private  int[] progresses;

    private Student(String surName, int numOfGroup, int[] progresses){
        this.surName = surName;
        this.numOfGroup = numOfGroup;
        this.progresses = progresses;
    }

    private   int getNumOfGroup() {
        return numOfGroup;
    }

    private   String getSurName() {
        return surName;
    }

    private int[] getProgresses() {
        return progresses;
    }

    public static void main(String[] args) {

         Student [] groupOfStudent = new Student[]{

                new Student("Ivanov P.O.", 123, new int[]{9, 10, 6, 8, 7}),
                new Student("Petrov S.A.", 124, new int[]{9, 9, 10, 10, 10}),
                new Student("Smirnov A.L.", 125, new int[]{8, 10, 8, 8, 9}),
                new Student("Lednev P.I.", 123, new int[]{7, 10, 6, 5, 2}),
                new Student("Svetin P.A.", 124, new int[]{9, 9, 10, 10, 8}),
                new Student("Sidorov K.L.", 125, new int[]{6, 10, 8, 3, 9}),
                new Student("Ignatov T.O.", 124, new int[]{9, 9, 6, 10, 4}),
                new Student("Zdanov T.A.", 124, new int[]{10, 9, 10, 10, 9}),
                new Student("Subrov K.S.", 125, new int[]{9, 10, 8, 10, 6}),
                new Student("Mihalov M.S.", 121, new int[]{9, 10, 8, 10, 10}),

        };
        getExcellent(groupOfStudent);

    }

    private static void getExcellent(Student[] groupOfStudent){

        int sum = 0;
        int average;

        for (var v : groupOfStudent) {

            for(var t : v.getProgresses()){

                if(t >= 9) {

                    sum += t;
                }
            }
            average = sum / 5;

            if(average >= 9) {

                System.out.println(v.getSurName() + " " + v.getNumOfGroup());
            }
            sum = 0;
        }
    }
}
