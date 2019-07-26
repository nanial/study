package com.task.fourth.simpleClass;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
// время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте
// возможность сортировки элементов массива по номерам поездов. Добавьте возможность
// вывода информации о поезде, номер которого введен пользователем. Добавьте возможность
// сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
// назначения должны быть упорядочены по времени отправления

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Train {

    private String destination;
    private int numOfTrain;
    private Date departure;

    private Train(String destination, int numOfTrain, Date departure) {
        this.destination = destination;
        this.numOfTrain = numOfTrain;
        this.departure = departure;
    }

    private static String getDateTime(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(date);
    }

    public static void main(String[] args) {

        Train [] station = new Train[]{
                new Train("Lvov", 145, new Date(366000)),
                new Train("Lvov", 149, new Date(936619000)),
                new Train("Polotsk", 126, new Date(876542000)),
                new Train("Warsavia", 178, new Date(494794000)),
                new Train("Moscow", 25, new Date(46164000)),
                new Train("Kyev", 78, new Date(446494000)),
                new Train("Polotsk", 121, new Date(14287000)),
        };

        print(sortOfNumOfTrain(station));
        getCustomInfo(station);
        System.out.println();
        print(sortOfDestination(station));
    }

    private static Train[] sortOfNumOfTrain(Train[] station){

        for (int i = 1; i < station.length; i++) {

            if(station[i - 1].numOfTrain > station[i].numOfTrain){

                Train temp = station[i - 1];
                station[i - 1] = station[i];
                station[i] = temp;

                if(i > 1){
                    i -= 2;

                }
                else {
                    i--;
                }
            }
        }
        return station;
    }
    private static Train[] sortOfDestination(Train[] station)  {

        for (int i = 1; i < station.length; i++){

            for(int j = 0; j < station[i].destination.length(); j++){

                if(station[i - 1].destination.charAt(j) <
                        station[i].destination.charAt(j)){
                    break;
                }

                else if(station[i - 1].destination.charAt(j) >
                        station[i].destination.charAt(j)){

                    Train temp = station[i];
                    station[i] = station[i - 1];
                    station[i - 1] = temp;

                    if(station[i - 1].departure.getTime() >
                            station[i].departure.getTime()) {

                        Date tempDate = station[i].departure;
                        station[i].departure = station[i - 1].departure;
                        station[i - 1].departure = tempDate;

                        if (i > 1) {
                            i -= 2;

                        } else {
                            i--;
                        }
                        break;
                    }
                }
            }
        }
        return station;
    }
    private static void print(Train[] station){

        for (var v: station) {

            System.out.println(v.numOfTrain + " "
                    + getDateTime(v.departure)
                    + " " + v.destination);
        }
    }

    private static void getCustomInfo(Train [] station){

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)){
            System.out.println("Input number of train :");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Input number of train :");
            }

            int customNumOfTrain = scan.nextInt();

            for (var v: station){

                if(v.numOfTrain == customNumOfTrain){
                    System.out.println(v.numOfTrain +
                            " " + v.destination + " "
                            + getDateTime(v.departure));
                }
            }
        }
    }

}
