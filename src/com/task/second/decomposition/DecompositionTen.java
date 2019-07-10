package com.task.second.decomposition;

//Дано натуральное число N. Написать метод(методы) для формирования
// массива, элементами которого являются цифры числа N.

import java.util.Arrays;

public class DecompositionTen {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(511497014)));
    }

    private static int [] fillArray(int N){
        int n = getDigits(N);
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (N % (int) (Math.pow(10, n))
                    - N % (int) (Math.pow(10, n - 1)))
                    / (int) (Math.pow(10, n - 1));//divide number in unique digit
            n--;
        }
        return arr;
    }
    private static int getDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
}



