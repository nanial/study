package com.task.second.array_of_array;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//1  2    3 ...n
//n n-1 n-2 ...1
//1  2    3 ...n
//n n-1 n-2 ...1
//1  2    3 ...n
//n n-1 n-2 ...1

public class ArraysOfArraysFour {

    public static void main(String [] args) {

        int n = 8;//for example
        int[][] arr = new int [n][n];

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                if(i % 2 == 0) {
                    arr[i][j] = j + 1;
                }
                else {
                    arr[i][j] = n - j;//value will equal length of array 1
                }
                System.out.format("%2d", arr[i][j]);
            }
            System.out.println();
        }
    }
}



