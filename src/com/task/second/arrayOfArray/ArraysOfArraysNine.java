package com.task.second.arrayOfArray;

//Задана матрица неотрицательных чисел. Посчитать
//сумму элементов в каждом столбце. Определить,
//какой столбец содержит максимальную сумму

import java.util.Arrays;

public class ArraysOfArraysNine {

    public static void main(String[] args) {

            int n = 5;
            int m = 6;
            int [][] arr = new int[n][m];//init array
            int [] arrOfSum = new int[m];//temp array with sum
            int maxSum;
            int indexOfMaxCol = 0;

            for  (int i = 0; i < arr.length; i++){

                for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = (int) (Math.random() * 100);
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            for(int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    arrOfSum[j] += arr[i][j];
                }
            }
            System.out.println(Arrays.toString(arrOfSum));

            maxSum = arrOfSum[0];

            for(int i = 0; i < arrOfSum.length; i++){
                if (arrOfSum[i] > maxSum){
                    maxSum = arrOfSum[i];
                    indexOfMaxCol = i;
                }
            }
            System.out.println("Max sum of column on " + (indexOfMaxCol + 1) +" position");
    }
}



