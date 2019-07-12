package com.task.second.decomposition;

//Два простых числа называются «близнецами», если они отличаются друг от друга на 2
//(например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где
// n - натуральное число больше 2. Для решения задачи использовать декомпозицию.

public class DecompositionThirteen {

    public static void main(String[] args) {
        printTwins(createArrSimpl(40));
    }

    private static int[] createArrSimpl(int n){
        int[] arr = new int[(2 * n - n + 1)/ 2];
        int indexSimple = 0;
        int notSimple = 0;

        for (int i = n; i <= 2 * n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    notSimple++;
                }
            }
            if (notSimple <= 2) {
                arr[indexSimple] = i;
                indexSimple++;
            }
            notSimple = 0;
        }
        return arr;
    }

    private static void printTwins(int[] arr){
       for(int i = 1; i < arr.length; i++){
            if(arr[i] != 0 && arr[i] == arr[i - 1] + 2){
                System.out.print(arr[i - 1] + " and " + arr[i] + " ");
            }
        }
    }
}




