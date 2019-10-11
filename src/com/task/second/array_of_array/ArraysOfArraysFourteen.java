package com.task.second.array_of_array;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.

import java.util.Arrays;


public class ArraysOfArraysFourteen {
    public static void main(String[] args) {

        int n = 10;//for example
        int m = 10;//because is reachable on square matrix
        int[][] arr = new int [n][m];


        for(int i = 0; i < arr.length; i++){

            for (int j = i; j < arr[i].length; j++){
                arr[i][j] = 1;
            }
        }

        for(var i : arr){

            System.out.println(Arrays.toString(i));
        }
    }
}


