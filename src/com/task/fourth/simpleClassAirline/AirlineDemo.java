package com.task.fourth.simpleClassAirline;

//Создать второй класс, агрегирующий массив типа
// Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и
// вывести эти данные на консоль.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного

import java.util.Date;
import java.util.Scanner;

public class AirlineDemo {

    private static Airline[] airport  = new Airline[] {
            new Airline("Roma", 1456, TypeOfPlane.BOEING, new Date(149161649),
                    WeekDays.FRIDAY),
            new Airline("Frankfurt", 1468, TypeOfPlane.AIRBUS, new Date(1648947894),
               WeekDays.MONDAY),
            new Airline("Roma", 1494, TypeOfPlane.BOEING, new Date(9426649),
                    WeekDays.WEDNESDAY),
            new Airline("Roma", 1474, TypeOfPlane.BOEING, new Date(149161649),
                    WeekDays.MONDAY),
            new Airline("Frankfurt", 1457, TypeOfPlane.AIRBUS, new Date(1648947894),
                    WeekDays.TUESDAY),
    };
    private static void getFlyOfCertainDestination(String destination){

        for (Airline a : airport ) {

            if(a.getDestination().equals(destination)){

                System.out.println(a.toString());
            }
        }
    }


    private static void getFlyOfCertainDayOfWeek(WeekDays day){

        for (Airline a : airport ) {

            if(a.getDay().equals(day)){

                System.out.println(a.toString());
            }
        }
    }

    private static void getFlyOfCertainDayOfWeekAndTime(WeekDays day, Date time){

        for (Airline a : airport ) {

            if(a.getDay().equals(day) && a.getDeparture().getTime() > time.getTime()){

                System.out.println(a.toString());
            }
        }
    }
    private static void choice() {

        try (@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {
            System.out.println("Input '1' for get flies of day," +
                    "'2' for your destination ,'3' for flies of day after certain time ");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Input 1 or  2 or 3");
            }

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    getFlyOfCertainDayOfWeek(WeekDays.MONDAY);
                    break;
                case 2:
                   getFlyOfCertainDestination("Roma");
                    break;
                case 3:
                    getFlyOfCertainDayOfWeekAndTime(WeekDays.FRIDAY, new Date(149161600));
                    break;

                default:
                    System.out.println("You have been insert incorrect command");
                    break;
            }
        }

    }
    public static void main(String[] args) {
        choice();
        System.out.println();
        getFlyOfCertainDestination("Roma");
        System.out.println();
        getFlyOfCertainDayOfWeek(WeekDays.FRIDAY);
        System.out.println();
        getFlyOfCertainDayOfWeekAndTime(WeekDays.FRIDAY, new Date(149161600));

    }
}
