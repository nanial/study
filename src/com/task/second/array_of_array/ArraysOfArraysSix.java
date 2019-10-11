package com.task.second.array_of_array;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//1  1  1....1  1 1
//0  1  1....1  1 0
//0  0  1....1  0 0
//.................
//.................
//0  0  1....1  0 0
//0  1  1....1  1 0
//1  1  1....1  1 1

import java.util.Arrays;

public class ArraysOfArraysSix {

    public static void main(String [] args) {

        int n = 8;//for example
        int[][] arr = new int [n][n];

        for(int i = 0; i < arr.length; i++){
            if(i <= (arr.length - 1) / 2) {
                for (int j = i; j < arr[i].length - i; j++) {//move in line by value of i in begin
                                                             //and stop until (length-i)
                    arr[i][j] = 1;
                }
            }
            else {
                for (int j = arr[i].length - i - 1; j < i + 1; j++) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}