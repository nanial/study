package com.task.second.arrayLinear;

// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class ArraysSix {

    public static void main(String[] args) {
        final int N = 10;
        double sum = 0;
        double [] a = new double [N];

        for (int i = 0; i < a.length; i++) {
            a [i] = Math.random() * 100 - 50;             // insert array

            for(int j = 2; j < i - 1; j++){             //verify divisors
                if(i % j != 0){                          // if number is simply
                    sum += a [i];
                }
            }
        }
        System.out.println("Sum is " + sum);
    }
}


