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

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert interval a to b :");
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println("Insert the step :");
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

