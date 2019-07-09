package com.task.second.decomposition;

//Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5];
//D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления суммы трех
//последовательно расположенных элементов массива с номерами от k до m.

public class DecompositionEight {

    public static void main(String[] args) {
        System.out.println(sumThree(new int[]{100, 20, 16, 23, 12, 51}, 2, 4));
        System.out.println(sumThree(new int[]{100, 20, 16, 23, 12, 51}, 0, 2));
        System.out.println(sumThree(new int[]{100, 20, 16, 23, 12, 51}, 3, 5));
    }

    private static int sumThree(int [] arr, int k, int m){
        int sum = 0;
        if ((m - k) == 2) {//equals 3 elements in sequence
            for (int i = k; i <= m; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }
}



