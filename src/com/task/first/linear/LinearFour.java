package com.task.first.linear;

import java.text.DecimalFormat;
import java.util.Scanner;

//change whole and fractional parts

public class LinearFour {

    public static void main(String[] args) {

        double numForInvers;
        double restPart;
        double numAfterInvers;
        int wholePart;

        DecimalFormat df = new DecimalFormat("###.###");

        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert value in format \"###.###\" :");
             numForInvers = scan.nextDouble();
        }

        wholePart = (int) numForInvers;
        restPart = Math.round(1000 * (numForInvers - wholePart));
        numAfterInvers = numForInvers / 1000 + restPart;

        System.out.println(df.format(numAfterInvers));

    }

}

