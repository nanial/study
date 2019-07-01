package com.task.second.arrayOfArray;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная
//из чисел 1, 2, 3,..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из
// двух больших диагоналей равны между собой. Построить такой квадрат.


public class ArraysOfArraysSixteen {

    public static void main(String[] args) {
        int n = 9;//or other odd
        int[][] magicSquare = new int[n][n];
        int number = 1;
        int row = 0;
        int column = n / 2;
        int tempRow;
        int tempColumn;

        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            tempRow = row;//save current position
            tempColumn = column;//----//----//---
            row --;//move to left
            column ++;//rise to up

            if (row == -1) {//if out
                row = n - 1;//move to right
            }
            if (column == n) {//if out
                column = 0;//move to up
            }
            if (magicSquare[row][column] != 0) {//verify is cell empty
                row = tempRow + 1;//move to right
                column = tempColumn;//still at same position

                if (row == -1) {
                    row = n - 1;
                }
            }
        }

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.format("%4d", magicSquare[i][j]);
            }
            System.out.println();
        }
    }
}
