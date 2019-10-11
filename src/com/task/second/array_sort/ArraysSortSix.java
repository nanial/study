package com.task.second.array_sort;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и a(i+1). Если ai < a(i+1),
//то продвигаются на один элемент вперед. Если ai > a(i+1) , то производится перестановка и сдвигаются
// на один элемент назад.Составить алгоритм этой сортировки

import java.util.Arrays;

public class ArraysSortSix {

        public static void main(String[] args) {

            System.out.println(Arrays.toString(sortShell(new int[]{423, 101, -11, 15, -86, 95, 220, 360,
                    115, -99, -15, 166, 174, -182, -820})));
        }

       private static int[] sortShell(int []arr){
                int temp;
                int i = 1;
                while (i < arr.length) {
                    if (arr[i - 1] > arr[i]) {
                        temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        if (i - 1 > 0) {//verify left limit of array
                            i--;
                        }
                    } else {
                        i++;
                    }
                }
            return arr;
        }
}


