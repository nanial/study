package com.task.fifth.oopDragon;

import java.util.Random;

public class Grotto {

    private Dragon patronDragon;

    private Treasure[] collectionOfTreasure = new Treasure[100];

    public Treasure[] fillingCollect(){

        for (int i = 0; i < collectionOfTreasure.length; i++) {

            Random r = new Random();
            collectionOfTreasure[i] =
                    new Treasure(r.nextLong(), r.nextDouble(), TypeOfTreasure.DIAMONDS);
        }
        return collectionOfTreasure;
    }
}
