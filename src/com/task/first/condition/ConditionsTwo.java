package com.task.first.condition;

import java.util.Scanner;

//define max [ min(a, b), min(c, d)]

public class ConditionsTwo {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int min1;
        int min2;
        int maxRes;

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert value of 'a' :");
             a = scan.nextInt();
            System.out.println("Insert value of 'b' :");
             b = scan.nextInt();
            System.out.println("Insert value of 'c' :");
             c = scan.nextInt();
            System.out.println("Insert value of 'd' :");
             d = scan.nextInt();
        }
        min1 = a < b ? a : b;
        min2 = c < d ? c : d;
        maxRes = min1 > min2 ? min1 : min2;

        System.out.println(maxRes);
    }

}

