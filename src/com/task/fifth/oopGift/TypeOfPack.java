package com.task.fifth.oopGift;

import java.util.Random;

public enum TypeOfPack {

    BOX, CRAFT_PAPER, FILM, CORNET;

    public static TypeOfPack getTypePack(){

        TypeOfPack[] types = TypeOfPack.values();
        Random rand = new Random();
        return types[rand.nextInt(types.length)];
    }
}
