package com.task.first.loop;

//calculate sum of squares of first 100 integers

public class LoopsThree {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }

}

