package com.task.second.array_linear;

//Дана последовательность целых чисел n a1 ,a2...an.
// Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1 ,a2...an)

class ArraysEight {

    public static void main(String[] args){
        int n = 20;
        int min;
        int count = 0;
        int j = 0;
        int [] arr = new int[n];
        int[] resArr;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100 - 50);
            System.out.print(arr[i] + "  ");
        }

        min = arr[0];

        for(Integer i : arr){
            if(i < min){
                min = i;
            }
        }

        for (Integer i : arr){
            if(i == min){
                count++;
            }
        }

        resArr = new int[n - count];
        System.out.println();

        for(Integer i : arr){
            if (i != min){
                resArr[j] = i;
                System.out.print(resArr[j] + "  ");
                j++;
            }
        }
    }
}


