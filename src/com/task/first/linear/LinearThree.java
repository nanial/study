package com.task.first.linear;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.*;

//Условие задачи:
//Вычислить значение выражения по формуле
//((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
//z для результата

public class LinearThree {
    public static void main(String[] args) {

        double z;
        try(Scanner scan = new Scanner(System.in)){

            System.out.println("Insert value 'x' in radian :");
            double x = scan.nextDouble();

            System.out.println("Insert value 'y' in radian :");
            double y = scan.nextDouble();

            z = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);

        }
        System.out.println("Result of expression is " + z);

    }
}
