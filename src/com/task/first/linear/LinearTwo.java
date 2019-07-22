package com.task.first.linear;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

//Условие задачи:
//Вычислить значение выражения по формуле
//((b + sqrt(b(pow 2) + 4 a * c) / 2 * a)  - a(pow 3) * c + b(pow -2)
//z для результата

public class LinearTwo {
    public static void main(String[] args){

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

            z = ((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a)) -
                    pow(a, 3) * c + pow(b, -2);

        }
        System.out.println("z equals is " + z);

    }
}
