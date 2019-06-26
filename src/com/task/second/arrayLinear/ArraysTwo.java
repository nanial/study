package com.task.second.arrayLinear;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
// большие данного Z, этим числом. Подсчитать количество замен.

import java.util.Random;
import java.util.Scanner;

public class ArraysTwo {
    public static void main(String[] args) {
        int n;
        int counter = 0;
        final double Z;

        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert number of element :");
            n = scan.nextInt();
            System.out.println("Insert value of 'Z' :");
            Z = scan.nextDouble();
        }

        double [] a = new double [n];

        for (int i = 0; i < n; i++) {
            a [i] = new Random().nextDouble() * 100 - 50;
            if(a[i] > Z){
                a[i] = Z;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
