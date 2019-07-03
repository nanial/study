package com.task.second.arraySort;

//Сортировка выбором. Дана последовательность чисел a1<=a2<=a3....<=a(n-1)<=an.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

import java.util.Arrays;

public class ArraysSortThree {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(selectedSort(new int[]{-101, -11, 15, 86, 95, 220, 360})));
    }

    private static int[] selectedSort(int[] arr) {
        int max;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }
}
