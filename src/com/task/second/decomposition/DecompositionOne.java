package com.task.second.decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел: НОК(А,В) = (А*В)/НОД()А,В


public class DecompositionOne {

        public static void main(String[] args) {
            System.out.println("Minor of common multiplicity is " + getCommonMult(5, 9));
            System.out.println("The great common divisor is " + evqlide( 8,6));

    }

    private static int getCommonMult(int a, int b) {

            return (a * b) / evqlide(a, b);
    }

    private static int evqlide(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }


}


