package com.task.first.linear;

import java.util.Scanner;

//print true if point(x,y) belongs certain aria
// (x >= -2 && x <= 2) && (y >= 0 && y <= 4) ||
// (x >= -4 && x <= 4) && (y >= -3 && y <= 0)

public class LinearSix {

    public static void main(String[] args) {

        int x;
        int y;

        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert value of 'x' :");
             x = scan.nextInt();
            System.out.println("Insert value of 'y' :");
             y = scan.nextInt();
        }

        if ((x >= -2 && x <= 2) && (y >= 0 && y <= 4)
                || (x >= -4 && x <= 4) && (y >= -3 && y <= 0)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }

}

