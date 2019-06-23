package com.task.first.condition;

import java.util.Scanner;

import static java.lang.Math.pow;

//calculate the function depend of interval

public class ConditionsSix {

    public static void main(String[] args) {

        double x;
        double function;

        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert value of 'x' :");
            x = scan.nextDouble();
        }

        if(x <= 3) {
            function = pow(x, 2) - (3 * x) + 9;
        }
        else{
            function = 1 / (pow(x, 3) + 6);
        }
        System.out.println(function);
    }

}

