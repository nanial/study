package com.task.first.loop;

//represent char in numerical designation
// alphabet for example

public class LoopsSix {

    public static void main(String[] args) {
        char[] alphabet = {'a','b','c','d','e','f','g',
                'h','i','j','k','l','m','n','o','p','q',
                'r','s','t','u','v','w','x','y','z'};

        for (int i = 1; i < alphabet.length; i++) {

            System.out.println((int) alphabet [i]);
        }

    }

}

