package com.task.second.decomposition;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class DecompositionSix {

    public static void main(String[] args) {
        System.out.println(simpleVer(7, 5, 11));
    }

    private static boolean simpleVer(int a, int b, int c) {
        boolean isSimple = true;

        if (evqlide(a, b) != 1 || evqlide(b, c) != 1
                || evqlide(a, c) != 1) {
            isSimple = false;
        }
        return isSimple;
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



