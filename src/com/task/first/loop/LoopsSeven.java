package com.task.first.loop;

//Для каждого натурального числа в промежутке от m до n
// вывести  все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры

import java.util.Scanner;

public class LoopsSeven {

    public static void main(String[] args) {
        int m;
        int n;
        try(Scanner scan = new Scanner(System.in)) {

            System.out.println("Insert value of interval from 'm' to 'n' " +
                    "'n' and 'm' are natural numbers :");

            while (!scan.hasNextInt()) {
                System.out.println("Insert value of 'm' :");
                scan.next();
            }

            m = scan.nextInt();

            while (!scan.hasNextInt()) {
                System.out.println("Insert value of 'n' :");
                scan.next();
            }
            n = scan.nextInt();
        }

        if(n > m) {
            while (m <= n) {

                System.out.print(m + " : ");

                for (int div = 2; div < m; div++) {

                    if (m % div == 0) {
                        System.out.print(div + " ");

                    }
                }
                System.out.println();
                m++;
            }
        }
        else System.out.println("n must be great m ");

    }
}