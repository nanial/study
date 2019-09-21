package com.task.first.condition;

import java.util.Scanner;

//define belong the points same line

public class ConditionsThree {

    public static void main(String[] args) {

        double aX;
        double aY;
        double bX;
        double bY;
        double cX;
        double cY;

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert coordinates of 'a' :");
             aX = scan.nextDouble();
             aY = scan.nextDouble();
            System.out.println("Insert coordinates of 'b' :");
             bX = scan.nextDouble();
             bY = scan.nextDouble();
            System.out.println("Insert coordinates of 'c' :");
             cX = scan.nextDouble();
             cY = scan.nextDouble();

        }

        if(((aX - cX) * (bY - cY)) - ((bX - cX) * (aY - cY)) == 0) {
            System.out.println("The points belong same line");
        }
        else {
            System.out.println("The points aren't belong same line");
        }
    }

}

