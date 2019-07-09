package com.task.second.decomposition;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class DecompositionSeven {

    public static void main(String[] args) {
        System.out.println(sumFactorial());
    }


    private static int sumFactorial() {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if(i % 2 != 0){
                sum += factorial(i);
            }
        }
       return sum;
    }

    private static int factorial(int val){
        int k = 1;
        for (int i = 1; i <= val; i++){
            k *= i;
        }
        return k;
    }
}


