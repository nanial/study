package com.task.first.condition;

import java.util.Scanner;

//define possibility of pass a brick through hole

public class ConditionsFour {

    public static void main(String[] args) {

        double brickX;
        double brickY;
        double brickZ;
        double holeX;
        double holeY;

        try(@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert dimensions of brick :");
            brickX = scan.nextDouble();
            brickY = scan.nextDouble();
            brickZ = scan.nextDouble();
            System.out.println("Insert dimensions of hole :");
            holeX = scan.nextInt();
            holeY = scan.nextInt();
        }

        if(((brickX <= holeX) && (brickY <= holeY))
                || ((brickX < holeX) &&  (brickZ < holeY))
                || ((brickY < holeX) && (brickZ < holeY))
                || ((brickX < holeY) && (brickY < holeX))
                || ((brickX < holeY) &&  (brickZ < holeX))
                || ((brickY < holeY) && (brickZ < holeX))) {
            System.out.println("The dimensions of hole allows pass the brick");
        }
        else {
            System.out.println("The dimensions of hole less than brick");
        }
    }

}

