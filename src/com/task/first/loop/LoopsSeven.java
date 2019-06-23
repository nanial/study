package com.task.first.loop;

//calculate all dividers of each natural number
//exclude '1' and same number

import java.util.Scanner;

public class LoopsSeven {

    public static void main(String[] args) {
        int m;
        int n;
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert value of interval from 'm' to 'n' " +
                    "'n' and 'm' are natural numbers:");
            m = scan.nextInt();
            n = scan.nextInt();
        }
        while(m <= n){

            System.out.print(m + " : ");

            for(int div = 2; div < m; div++ ){

                if(m % div == 0){
                    System.out.print(div + " ");

                }
            }
            System.out.println();
            m++;
        }

    }
}