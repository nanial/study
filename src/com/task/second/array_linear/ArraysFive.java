package com.task.second.array_linear;

// Даны целые числа а1 ,а2 ,..., аn .
// Вывести на печать только те числа, для которых аi > i.

import java.util.Random;

public class ArraysFive {

    public static void main(String[] args) {
        int n = 100;//for example
        int [] a = new int [n];

        for (int i = 0; i < a.length; i++) {
            a [i] = new Random().nextInt(30) - 10;//for example

            if(a[i] > i){
                System.out.println(a[i] + " greater then its index " + i);

            }
        }
    }
}
