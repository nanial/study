package com.task.second.arrayOfArray;

//Матрицу 10x20 заполнить случайными числами от 0 до 15.
//Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз

public class ArraysOfArraysEleven {
    public static void main(String[] args) {

        int n = 10;
        int m = 20;
        int counter;
        int[][] arr = new int [n][m];

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){

                arr[i][j] = (int) (Math.random() * 16);
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Number '5' used 3 or more times in the line(s): ");

        for (int i = 0; i < arr.length; i++){
            counter = 0;
            for (int j = 0; j < arr[i].length; j++){

                if(arr[i][j] == 5){
                    counter++;
                }
            }
            if(counter >= 3){
                System.out.print((i + 1) + " ");
            }
        }
    }
}
