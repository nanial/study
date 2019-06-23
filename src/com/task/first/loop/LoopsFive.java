package com.task.first.loop;

import java.util.Scanner;

import static java.lang.Math.pow;

//calculate sum of numbers whose modulus >= certain e
//the number may be represent 1/pow(2,n) + 1/pow(3,n)
//number belongs certain interval

public class LoopsFive {

    public static void main(String[] args) {

        double n;
        double e;
        double a;
        double sum = 0;

        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert value of 'n' :");
            n = scan.nextDouble();
            System.out.println("Insert value of 'e' :");
            e = scan.nextDouble();
        }

        for (int i = 0; i < n + 1; i++) {
            a = 1 / pow(2, n) + 1 / pow(3, n);
            if(Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println(sum);
    }

}

