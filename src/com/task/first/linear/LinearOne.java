package com.task.first.linear;

import java.util.Scanner;
//Условие задачи:
//Найти значение функции z = ((a - 3) * b / 2) + c

public class LinearOne {

    public static void main(String[] args) {

        double z;

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)){

            System.out.println("Insert the number 'a' :");

            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.println("Insert the number 'a' :");
            }
            double a = scan.nextDouble();

            System.out.println("Insert the number 'b' :");

            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.println("Insert the number 'b' :");
            }
            double b = scan.nextDouble();

            System.out.println("Insert the number 'c' :");

            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.println("Insert the number 'c' :");
            }
            double c = scan.nextDouble();

            z = (((a - 3) * b )/ 2) + c;

        }
        System.out.println("z equals is " + z);
    }
}
