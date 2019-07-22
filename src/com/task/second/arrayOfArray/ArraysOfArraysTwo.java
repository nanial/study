package com.task.second.arrayOfArray;

//Дана квадратная матрица. Вывести на экран элементы,
//стоящие на диагонали

public class ArraysOfArraysTwo {
    public static void main(String[] args) {

        int n = 5;//for   example
        int[][] arr = new int [n][n];

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                arr[i][j] = (int) (Math.random() * 100 - 50);
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("diagonal is ");

        for(int i = 0; i < n; i++){

            System.out.print(arr[i][i] + " ");
        }

        System.out.println();

        System.out.println("other diagonal is ");

        for(int i = (arr.length-1), j = 0; i >= 0; i--, j++){

            System.out.print(arr[i][j] + " ");
        }
    }
}





