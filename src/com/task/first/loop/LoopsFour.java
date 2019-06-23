package com.task.first.loop;

//calculate multiply of squares of first 200 integers

import java.math.BigInteger;

public class LoopsFour {

    public static void main(String[] args) {

        BigInteger muliplyOfSquare = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {
            muliplyOfSquare = muliplyOfSquare.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(muliplyOfSquare);
    }

}

