package com.task.second.arrayOfArray;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//1  1  1  1...1
//2  2  2  2...0
//3  3  3  0...0
//...............
//...............
//n-1 n-1 0 ....0
//n  0  0.......0


import java.util.Arrays;

public class ArraysOfArraysFive {

    public static void main(String [] args) {

        int n = 8;//for example
        int[][] arr = new int [n][n];

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n - i; j++){//reduces length of each single line by i
                    arr[i][j] = i + 1;//value of next line increases by 1
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}



