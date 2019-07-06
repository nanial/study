package com.task.second.arraySort;

// Пусть даны две неубывающие последовательности действительных чисел
// a1<=a2<=a3....<=a(n-1)<=an и b1<=b2<=b3...<=b(m-1)<=bm. Требуется
//указать те места, на которые нужно вставлять элементы последовательности
//b1<=b2<=b3...<=b(m-1)<=bm в первую последовательность так, чтобы новая
// последовательность оставалась возрастающей

import java.util.Arrays;

public class ArraysSortSeven {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new double[]{-101, -11, 15, 86, 95, 220, 360},
                new double[]{-220,-115, -115, -99, -15, 166, 174, 182, 232, 820})));
    }
    private static double[] merge(double[] a, double[] b) {

        double[] resArr = new double[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        System.out.println("Indexes of result array are: ");
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                resArr[k] = a[i];
                i++;
            } else {
                resArr[k] = b[j];
                j++;
                System.out.print(k + " ");
            }
            k++;
        }

        while (i < a.length) {
            resArr[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length){
            resArr[k] = b[j];
            j++;
            System.out.print(k + " ");
            k++;
        }
        System.out.println();
        return resArr;
    }
}


