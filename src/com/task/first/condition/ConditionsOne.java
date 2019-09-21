package com.task.first.condition;

import java.util.Scanner;

//verify existence of triangle from two certain angles
//verify is right triangle

public class ConditionsOne {

    public static void main(String[] args) {

        double a;
        double b;

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert value of angle 'a' :");
             a = scan.nextDouble();
            System.out.println("Insert value of angle 'b' :");
             b = scan.nextDouble();
        }
        if ((a + b) < 180){
            System.out.println("The triangle might exist");
                if (a == 90 || b == 90 || (a + b) == 90){
                    System.out.println("Triangle is right");
                }
        }
        else {
            System.out.println("From these angles impossible form a triangle");
        }

    }

}

