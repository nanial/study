package com.task.second.arraySort;

//Даны дроби p1/q1,p2/q2,...,pn/qn( pi , qi - натуральные). Составить программу, которая
// приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания

public class ArraysSortEight {

        public static void main(String[] args) {

        int[] numerator = new int[]{5,8,9,1,4,15,26,11};
        int[] denominator = new int[]{6,14,21,13,9,8,4,10};
        int minMultypl = getCommonMutl(denominator[0], denominator[1]);//if length of array equals 2

        print(numerator, denominator);

        for (int i = 2; i < denominator.length; i++) {           //commence from 2-element
            minMultypl = getCommonMutl(minMultypl, denominator[i]); //find unique divisor between elements
        }                                                       //compare each el-t and exist min divisor

        for (int i = 0; i < denominator.length; i++) {
            numerator[i] = numerator[i] * (minMultypl / denominator[i]);//make equals init fraction
            denominator[i] = minMultypl;//make same denominator
        }
        exchangeSort(numerator);
        print(numerator, denominator);
    }

    private static int getCommonMutl(int a, int b) {
        return (a * b) / evqlide(a, b);
    }

    private static int evqlide(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private static void exchangeSort(int[] numerator) {

        for (int i = numerator.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numerator[j] > numerator[j + 1]) {
                    int temp = numerator[j];
                    numerator[j] = numerator[j + 1];
                    numerator[j + 1] = temp;
                }
            }
        }
    }
    private static void print(int[] num, int[] denom){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "/" + denom[i] + "   ");
        }
        System.out.println();
    }
}


