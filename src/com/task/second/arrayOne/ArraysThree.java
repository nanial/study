package com.task.second.arrayOne;

//Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class ArraysThree {
    public static void main(String[] args) {
        final int N = 50;//for example
        int counterOfPositive = 0;
        int counterOfNegative = 0;
        int counterOfZero;
        double [] a = new double [N];

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 100 - 50;
            if(a[i] > 0){
                counterOfPositive++;
            }
            else if (a[i] < 0){
                counterOfNegative++;
            }
        }
        counterOfZero = a.length - counterOfNegative - counterOfPositive;

        System.out.println("Number of negative elements is " + counterOfNegative +
                " number of zero-elements is " + counterOfZero +
                " numbers of positive element is " + counterOfPositive);
    }
}
