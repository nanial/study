package com.task.second.decomposition;
//Найти все натуральные n-значные числа, цифры в которых образуют строго
// возрастающую последовательность (например, 1234, 5789). Для решения
// задачи использовать декомпозицию.

class DecompositionFifteen {
    public static void main(String[] args){
        int numberOrder = 4;//for example
        increaseSequence(numberOrder);
    }

    private static void increaseSequence(int n){

            int[] arr = new int[n];
            int j = 1;
            while(arr[arr.length - 1] < 9){
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = j + i;
                }

                int increase = 0;

                for(int i = 0; i < arr.length; i++){
                    increase += arr[i];
                    if(i == arr.length - 1){
                        continue;
                    }
                    increase *= 10;
                }

                System.out.println(increase);
                j++;
            }

    }
}