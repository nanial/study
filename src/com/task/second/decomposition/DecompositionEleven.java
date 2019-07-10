package com.task.second.decomposition;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

public class DecompositionEleven {

    public static void main(String[] args) {
        checkCount(12, 2128);
    }
    private static void checkCount(int a, int b){
        if(getDigits(a) > getDigits(b)){
            System.out.println("'a' contains more digits then 'b'");
        }
        else if (getDigits(a) < getDigits(b)){
            System.out.println("'b' contains more digits then 'a'");
        }
        else {
            System.out.println("'a' and 'b' contain same number of digits");
        }
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



