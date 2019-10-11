package com.task.second.array_of_array;

//Найти положительные элементы главной диагонали квадратной матрицы

public class ArraysOfArraysTen {
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

        System.out.println("positive elements of diagonal are ");
        for(int i = 0; i < n; i++){
            if(arr[i][i] > 0) {
                System.out.print(arr[i][i] + " ");
            }
        }
        System.out.println();
    }
}






