package com.task.second.decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class DecompositionTwo {

        public static void main(String[] args) {
            System.out.println("The great common divisor is " + fourCommonDiv(104,320, 24,16));

    }

    private static int fourCommonDiv(int a, int b, int c, int d) {
        int temp1 = evqlide(a, b);
        int temp2 = evqlide(c, d);
        return evqlide(temp1, temp2);
    }

    private static int evqlide(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }


}


