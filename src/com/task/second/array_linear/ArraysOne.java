package com.task.second.array_linear;

//find sum of element aliquot K
//В массив A [N] занесены натуральные числа.
// Найти сумму тех элементов, которые кратны данному К.

import java.util.Random;

public class ArraysOne {
    public static void main(String[] args) {
        final int N = 100;//for example because final
        final int K = 6;// ---------//---//----------
        long sum = 0;
        int [] A = new int[N];

        for (int i = 0; i < N; i++){
            A[i] = Math.abs(new Random().nextInt(65536)-32768);
            if((A[i] % K) == 0){
                sum += A[i];
            }
        }
        System.out.println(sum);
    }
}
