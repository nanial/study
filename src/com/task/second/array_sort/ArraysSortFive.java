package com.task.second.array_sort;

//Сортировка вставками. Дана последовательность чисел a1, a2...an. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1, a2...an - упорядоченная последовательность, т. е.
//a1<=a2<=a3....<=a(n-1)<=an. Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;

public class ArraysSortFive {

    public static void main(String[] args) {

        System.out.println(Arrays.toString
                (insertsSort(new int[]{-220,-115, -115, -99, -15, 166, 174, 182, 232, 820}, -5)));

    }

    private static int[] insertsSort(int[] arr, int insertElement) {

        int tempInsert = insertElement;

        int[] arrWithInsert = new int[arr.length + 1];

               while (binarySearch(arr, insertElement) == -1){
                   
                   insertElement--;
               }

               int temp = binarySearch(arr, insertElement);

                for (int j = 0; j < arrWithInsert.length; j++) {

                    if (j <= temp) {

                        arrWithInsert[j] = arr[j];
                    }
                    else if (j > temp + 1){

                        arrWithInsert[j] = arr[j - 1];
                    }
                    else {

                        arrWithInsert[temp + 1] = tempInsert;
                    }
                }

         return arrWithInsert;
    }

    private static int binarySearch(int [] arr, int value){

        int begin = 0;
        int end = arr.length - 1;

        while (begin <= end) {

            int middle = begin + (end - begin) / 2;

            if (arr[middle] < value){

                begin = middle + 1;
            }

            else if (arr[middle] > value) {

                end = middle - 1;
            }
            else {

                return middle;
            }
        }
        return -1;
    }
}
