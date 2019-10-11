package com.task.second.array_of_array;

//Отсортировать строки матрицы по убыванию значений элементов

public class ArraysOfArraysThirteen {

    public static void main(String[] args) {

        int n = 10;//for example
        int m = 10;
        int temp;
        int[][] arr = new int [n][m];

        for(var i : arr){

            for(int j = 0; j < i.length; j++){

                i[j] = (int) (Math.random() * 16);
                System.out.format("%4d", i[j]);
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        for (int i = 0; i < arr.length; i++) {

            for (var v: arr) {

                for (int j = 1; j < arr[i].length; j++) {

                    if (arr[i][j] > arr[i][j - 1]) {

                        temp = arr[i][j];
                        arr[i][j] = arr[i][j - 1];
                        arr[i][j - 1] = temp;
                    }
                }
            }
        }

        for(var i : arr){

            for(int j = 0; j < i.length; j++){

                System.out.format("%4d", i[j]);
            }
            System.out.println();
        }
    }
}
