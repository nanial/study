package com.task.second.array_of_array;

//В числовой матрице поменять местами два столбца любых столбца,
// т. е. все элементы одного столбца поставить на соответствующие
// им позиции другого, а его элементы второго переместить в первый.
// Номера столбцов вводит пользователь с клавиатуры

import java.util.Scanner;

public class ArraysOfArraysEight {

    public static void main(String[] args) {

        int n = 5;//for   example
        int m = 6;
        int from;
        int to;
        int temp;
        int[][] arr = new int [n][m];

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                arr[i][j] = (int) (Math.random() * 100 - 50);
                System.out.format("%5d", arr[i][j]);
            }
            System.out.println();
        }

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {

            from = verify(scan, "Insert number of column 'from' number contains[0;5] :");
            to = verify(scan, "Insert number of column 'to' number contains[0;5] :");
        }

            for (int i = 0; i < arr.length; i++) {

                temp = arr[i][from];
                arr[i][from] = arr[i][to];
                arr[i][to] = temp;
            }

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {

                    System.out.format("%5d", arr[i][j]);
                }
                System.out.println();
            }

    }

    private static int verify(Scanner scan, String messageText) {
        int value;

        while (true) {
            System.out.println(messageText);

            if(!scan.hasNextInt()) {
                scan.next();
                continue;
            }

            value = scan.nextInt();

            if(value >= 0 && value <= 5) {
                break;
            }
        }

        return value;
    }
}




