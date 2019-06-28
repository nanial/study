package com.task.second.arrayOfArray;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

public class ArraysOfArraysFifteen {
    public static void main(String[] args) {

        int n = 10;//for example
        int m = 16;
        int[][] arr = new int [n][m];
        int max = arr[0][0];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int) (Math.random() * 101 - 50);
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                        if (max < arr[i][j]) {
                            max = arr[i][j];
                        }
                }
        }
        System.out.println("-------------------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 != 0){
                    arr[i][j] = max;
                }
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
