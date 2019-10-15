package com.task.second.array_sort;

//Сортировка обменами. Дана последовательность чисел n .Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai  и a(i+1). Если ai > a(i+1) , то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок

import java.util.Arrays;

public class ArraysSortFour {
    private static int counter = 0;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(exchangedSort(new int[]{120, 380, 501, -11, 15, 86, 95, -220, 360})));
        System.out.println(counter);
    }

    private static int[] exchangedSort(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    counter++;
                }
            }
        }
        return arr;
    }
}
