package com.task.second.arrayOne;

//Даны действительные числа а1 ,а2 ,..., аn .
// Поменять местами наибольший и наименьший элементы

public class ArraysFour {
    public static void main(String[] args) {

        int n = 10;// for example
        int indexOfMin = 0;
        int indexOfMax = 0;
        double temp;
        double [] a = new double [n];

        for (int i = 0; i < a.length; i++) {
            a [i] = Math.random() * 100 - 50;
            if(a [indexOfMin] > a [i]){
                a [indexOfMin] = a [i];
                indexOfMin = i;
            }
            if (a [indexOfMax] < a [i]) {
                a [indexOfMax] = a[i];
                indexOfMax = i;
            }
        }
        System.out.println(a [indexOfMax] + " index "  +indexOfMax + " " +
                a [indexOfMin] + " index " + indexOfMin);

        temp = a[indexOfMax];
        a[indexOfMax] = a[indexOfMin];
        a[indexOfMin] = temp;

        System.out.println("after change " + a [indexOfMax] + " index "  +indexOfMax + " " +
                a [indexOfMin] + " index " + indexOfMin);

    }
}

