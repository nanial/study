package com.task.second.array_linear;
//В массиве целых чисел с количеством элементов n найти
// наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.


class ArraysNine {

    public static void main(String[] args){

        int n = 20; // for example
        int [] arr = new int[n];// init array
        int [] popularNum = new int[arr.length];//array of popular number
        int valOfRes = arr [0];
        int minOfMostRes = popularNum [0];

        for (int i = 0; i < arr.length; i++){

            arr[i] = (int) (Math.random() * 10 - 5);
            System.out.print(arr[i] + "  ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            for (Integer j : arr) {

                if (arr[i] == j) {

                    popularNum [i]++;
                }
            }

        }

        for (int i = 0; i < popularNum.length; i++) {

            if (popularNum[i] > minOfMostRes) {

                minOfMostRes = popularNum[i];
                valOfRes = arr[i];
            }
            if ((minOfMostRes == popularNum[i]) && (arr[i] < valOfRes)) {

                valOfRes = arr[i];
            }
        }

        System.out.println(valOfRes);
    }
}

