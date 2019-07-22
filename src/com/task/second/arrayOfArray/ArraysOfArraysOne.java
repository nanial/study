package com.task.second.arrayOfArray;

//Дана матрица. Вывести на экран все нечетные столбцы,
//у которых первый элемент больше последнего

public class ArraysOfArraysOne {

    public static void main(String [] args) {

        int n = 5;//for
        int m = 7;//example
        int[][] arr = new int [n][m];

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                arr[i][j] = (int) (Math.random() * 10 - 5);
                System.out.format("%4d", arr[i][j]);

            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                if(j % 2 == 0 && arr[0][j] > arr[arr.length - 1] [j]){
                    System.out.format("%4d", arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}



