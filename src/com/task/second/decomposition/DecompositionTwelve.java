package com.task.second.decomposition;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//элементами которого являются числа, сумма цифр которых равна К и которые не больше N.

import java.util.ArrayList;
import java.util.Arrays;

public class DecompositionTwelve {

       private static int n = 15;
       private static int [] A = new int[n];
       private static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(valueSumGener( 12, 100)));
    }

    private static Object[] valueSumGener(int K, int N){//check sum of digital of number(K)
                                                     //and value of whole number(N)
        for (int i = 0; i < A.length; i++) {
             A[i] = (int)(Math.random() * (N + 1));
             if(getSum(A[i]) == K) {
                 arrayList.add(A[i]);
                 System.out.print(A[i] + "  ");
             }
        }
        System.out.println();
        return arrayList.toArray();
    }

    private static int getSum(int x){

        int sum = 0, n;
        n = getDigits(x);

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (x % (int) (Math.pow(10, n))
                    - x % (int) (Math.pow(10, n - 1)))
                    / (int) (Math.pow(10, n - 1));//divide number in unique digits
            n--;
        }

        for (int i : arr) {
            sum += i;//sum all unique digit in degrees
        }
        return sum;
    }

    private static int getDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
}



