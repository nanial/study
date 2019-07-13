package com.task.second.decomposition;

//Написать программу, определяющую сумму n - значных чисел, содержащих только
// нечетные цифры. Определить также, сколько четных цифр в найденной сумме.
// Для решения задачи использовать декомпозицию.

public class DecompositionSixteen {
    public static void main(String[] args) {

        int n = 6;
        System.out.println(getSum(n));
        System.out.println(getEvens(getSum(n)));

    }

    private static int getSum(int n) {

        int minDigit = (int) Math.pow(10, n - 1);
        int maxDigit = (int)Math.pow(10, n);
        int sum = 0;

        for (int i = minDigit; i < maxDigit; i++) {

            int temp = i;
            boolean isOdd = true;

            while (temp != 0) {

                if ((temp % 10) % 2 == 0) {
                    isOdd = false;
                    break;
                }
                temp /= 10;
            }
            if (isOdd) {
                sum += i;
            }
        }
        return sum;
    }

    private static int getEvens(int sum) {
        int count = 0;
        while (sum != 0) {
            if ((sum % 10) % 2 == 0) {
                count++;
            }
            sum /= 10;
        }
        return count;
    }
}
