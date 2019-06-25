package com.task.second.arrayOfArray;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class ArraysOfArraysThree {
    public static void main(String[] args) {

        int n = 5;//for example
        int k = 3; // number of row
        int p = 4;// number of column
        int[][] arr = new int [n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = (int) (Math.random() * 100 - 50);
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Column 'p' is ");
        for (int i = 0; i < n; i++){
            System.out.format("%4d", arr[i][p - 1]);
        }
        System.out.println();

        System.out.println("Row 'k' is ");
        for(int i = 0; i < n; i++){
            System.out.format("%4d", arr[k - 1][i]);
        }

    }
}






