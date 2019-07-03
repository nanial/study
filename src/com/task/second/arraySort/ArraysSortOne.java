package com.task.second.arraySort;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами
// первого, при этом не используя дополнительный массив

public class ArraysSortOne {

        public static void main(String[] args) {
            int [] arr1 = {1, 11, 15, 86, 95, 32, 32, 45, 57, 89, 10};//for example
            int [] arr2 = {115, 66, 54, 12, 32, 78, 95};
            int k = 8;
            int [] resArray = new int[arr1.length + arr2.length];

            for (int i = 0; i < resArray.length; i++) {
                if (i < k) {
                    resArray[i] = arr1[i];
                }
                else if (i < k + arr2.length) {
                    resArray[i] = arr2[i - k];
                }
                else {
                    resArray[i] = arr1[i - k + 1];
                }
            }
            print(resArray);
        }

        private static void print(int [] arr) {
            for (int i : arr) {
                System.out.format("%2d ", i);
            }
        }
    }