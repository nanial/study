package com.task.second.arrayOfArray;

//Сформировать квадратную матрицу порядка N по правилу:
//A[I ,J]=sin(I^2-J^2)/N))
//и подсчитать количество положительных элементов в ней.


import java.util.Arrays;

public class ArraysOfArraysSeven {

    public static void main(String [] args) {

        int n = 8;//for example
        int counter = 0;
        double [][] arr = new double [n][n];

        for(int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Math.sin((Math.pow(i, 2) -
                        Math.pow(j, 2) / arr.length));

                if (arr[i][j] > 0) {
                    counter++;
                }
            }
           System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Number of positive member is " + counter);
    }
}



