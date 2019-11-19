package com.task.fifth.dragon.logic;

import com.task.fifth.dragon.bean.Treasure;
import com.task.fifth.dragon.bean.TypeOfTreasure;

import java.util.Random;

public class Grotto {

    private Treasure[] collectionOfTreasure = new Treasure[100];

    public Treasure[] fillingCollect(){

        for (int i = 0; i < collectionOfTreasure.length; i++) {

            Random r = new Random();
            collectionOfTreasure[i] =
                    (new Treasure((r.nextDouble() * 10),//weight
                            TypeOfTreasure.getTypeTreasure()));

            collectionOfTreasure[i].setCost((long) (collectionOfTreasure[i].getType().getPriceOfGramm() *
                                collectionOfTreasure[i].getWeight()));
        }

        return collectionOfTreasure;
    }

}
