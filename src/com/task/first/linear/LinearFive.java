package com.task.first.linear;

//дано нат.число(время в секундах) вывести данное значение в часах, мин. и сек

import java.util.Scanner;

public class LinearFive {

    public static void main(String[] args) {
        long time;
        long hours;
        long minutes;
        int seconds;

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {

            System.out.println("Insert time in seconds :");

            while (!scan.hasNextLong()){
                System.out.println("Insert time in seconds :");
                scan.next();
            }
            time = scan.nextLong();
        }
        hours = time / 3600;
        minutes = (time % 3600) / 60;
        seconds = (int)(time % 60);

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}