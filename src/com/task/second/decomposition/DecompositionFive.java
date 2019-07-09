package com.task.second.decomposition;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на
//печать число, которое меньше максимального элемента массива, но больше всех других элементов).

public class DecompositionFive {

    public static void main(String[] args){
        int [] arr = {30, -71, 29, -82, 0, 56};
        int searchElement = 0;
        int maxElement = max(arr);

        for (int i : arr) {
            if(i > searchElement && i < maxElement){
                searchElement = i;
            }
        }
        System.out.println(searchElement);
    }

    private static int max(int [] arr){
        int max = 0;
        for (int i : arr) {
            if (max < i){
                max = i;
            }
        }
        return max;
    }
}



