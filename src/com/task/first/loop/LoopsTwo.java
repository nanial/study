package com.task.first.loop;

import java.util.Scanner;

//calculate value of function on interval [a,b], if x <= 2
// function equals x and if x > 2 function equals -x

public class LoopsTwo {

    public static void main(String[] args) {

        int a;
        int b;
        int h;
        int x;
        int function;

        try (@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert interval a to b :");
            while (!scan.hasNextInt()) {
                System.out.println("Insert value of 'a' :");
                scan.next();
            }
            a = scan.nextInt();

            while (!scan.hasNextInt()) {
                System.out.println("Insert value of 'b' :");
                scan.next();
            }
            b = scan.nextInt();

            System.out.println("Insert the step :");

            while (!scan.hasNextInt()) {
                System.out.println("Insert value of 'm' :");
                scan.next();
            }
            h = scan.nextInt();
        }

        if (a < b) {
            for (int i = a; i < b; i += h) {

                x = i;
                if (x > 2) {

                    function = x;
                } else {

                    function = -x;
                }
                System.out.println(function);
            }
        }
    }

}

