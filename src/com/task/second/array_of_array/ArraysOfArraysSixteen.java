package com.task.second.array_of_array;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная
//из чисел 1, 2, 3,..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из
// двух больших диагоналей равны между собой. Построить такой квадрат.


import java.util.Scanner;

public class ArraysOfArraysSixteen {

    public static void main(String[] args) {
        int n;
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert dimension of square :");
            n = scan.nextInt();
        }
        if (n % 2 != 0) {
            print(magicSquareOdd(n));
        } else if (n % 4 == 0) {
           print(magicSquareDoublyEven(n));
        } else {
            print(magicSquareSingleEven(n));
        }
    }

    private static int[][] magicSquareDoublyEven(int n) {

        int bits = 0b1001011001101001;
        int mult = n / 4;  // how many multiples of 4
        int[][] magicSquare = new int[n][n];

        for (int row = 0, i = 0; row < n; row++) {
            for (int column = 0; column < n; column++, i++) {
                int bitPos = column / mult + (row / mult) * 4;
                magicSquare[row][column] = (bits & (1 << bitPos)) != 0 ? i + 1 : n * n - i;
            }
        }
        return magicSquare;
    }

    private static int[][] magicSquareOdd(int n) {

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
            row--;//move to left
            column++;//rise to up

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
        return magicSquare;
    }

    private static int[][] magicSquareSingleEven(int n) {

        int halfN = n / 2;
        int[][] subSquare = magicSquareOdd(halfN);
        int[] quadrantFactors = {0, 2, 3, 1};
        int[][] magicSquare = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                int quadrant = (row / halfN) * 2 + (column / halfN);
                magicSquare[row][column] = subSquare[row % halfN][column % halfN];
                magicSquare[row][column] += quadrantFactors[quadrant] * ((n * n) / 4);
            }
        }

        int nColsLeft = halfN / 2;
        int nColsRight = nColsLeft - 1;

        for (int row = 0; row < halfN; row++) {
            for (int column = 0; column < n; column++) {
                if (column < nColsLeft || column >= n - nColsRight
                        || (column == nColsLeft && row == nColsLeft)) {

                    if (column == 0 && row == nColsLeft) {
                        continue;
                    }
                    int temp = magicSquare[row][column];
                    magicSquare[row][column] = magicSquare[row + halfN][column];
                    magicSquare[row + halfN][column] = temp;
                }
            }
        }
        return magicSquare;
    }
    private static void print (int [][] magicSquare){

        for (int [] i : magicSquare) {
            for (int j : i) {
                System.out.format("%4d", j);
            }
            System.out.println();
        }
    }
}