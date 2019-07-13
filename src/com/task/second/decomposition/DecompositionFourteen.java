package com.task.second.decomposition;
//Натуральное число, в записи которого n цифр, называется числом Армстронга,
// если сумма его цифр,возведенная в степень n, равна самому числу. Найти все числа
// Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

import java.util.Scanner;

class DecompositionFourteen {
    public static void main(String[] args){

        System.out.println("Input number for control");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int [] arr = new int[k + 1];
        for (int i = 1; i < arr.length; i++) {
            armstrong(i);
        }

    }
    private static void armstrong(int k){

            int result = 0;
            int n;
            int degrees;
            n = getDigits(k);
            degrees = n;

                int[] arr = new int[n];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (k % (int) (Math.pow(10, n))
                            - k % (int) (Math.pow(10, n - 1)))
                            / (int) (Math.pow(10, n - 1));//divide number in unique digit
                    n--;
                }

                for (int i : arr) {
                    result += (int) (Math.pow(i, degrees));//sum all unique digit in degrees
                }

                if (result == k)//compare result and initial number
                    System.out.println(result + " Is armstrong's number" );
                else System.out.println(k + " Isn't armstrong's number");
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