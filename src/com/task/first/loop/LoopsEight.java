package com.task.first.loop;

//search duplicate into two numbers

import java.util.Scanner;

public class LoopsEight {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert value of 'a' :");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Insert value of 'a' :");
            }
            a = scan.nextInt();

            System.out.println("Insert value of 'b' :");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Insert value of 'b' :");
            }
            b = scan.nextInt();
        }
        while (a > 0){

            d = a % 10;//единицы
            a = a / 10;//сдвиг вправо, вытесняем единицы
            c = b;//

            while (c > 0){

                if (c % 10 == d){//единицы а и единицы b

                    System.out.print("Find duplicate(s): " + d + " ");
                }
                c = c / 10;//сдвиг вправо, вытесняем единицы
            }
        }
    }
}

