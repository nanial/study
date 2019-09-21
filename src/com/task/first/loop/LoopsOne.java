package com.task.first.loop;

import java.util.Scanner;

//calculate sum from 1 to n

public class LoopsOne {

    public static void main(String[] args) {

        int n;
        int sum = 0;

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert value of 'n' :");

            while (!scan.hasNextInt()) {
                System.out.println("Insert value of 'n' :");
                scan.next();
            }
            n = scan.nextInt();
        }

        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}

