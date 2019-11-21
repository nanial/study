package com.task.fifth.dragon.logic.impl;

import com.task.fifth.dragon.bean.Dragon;
import com.task.fifth.dragon.bean.Treasure;
import com.task.fifth.dragon.logic.api.DragonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DragonUtilsImpl implements DragonUtils {

    private Dragon dragon;

    public DragonUtilsImpl(Dragon dragon) {
        this.dragon = dragon;
    }

    public void visionOfTreasure(){

        for (Treasure t : dragon.getTreasures()) {
            System.out.println("The treasure id "+ t.getId() +
                    " costs " + t.getCost() + " denariy " + t.getType() + " weight " + t.getWeight());

        }
    }
    public Treasure getMoreExpensive(){

        long maxCost = 0;
        Treasure moreExpTreasure = new Treasure();

        for (Treasure t : dragon.getTreasures()) {

            if(t.getCost() > maxCost){
                maxCost = t.getCost();
            }
            if(t.getCost() == maxCost){
                moreExpTreasure = t;
            }
        }
        return moreExpTreasure;
    }

    public ArrayList<Treasure> getTreasuresOfCertainSum(long certainSum){

        long sum = 0;
        ArrayList<Treasure> treasuresOfCertainSum = new ArrayList<>();

        Arrays.sort(dragon.getTreasures(), Comparator.comparing(Treasure::getCost));

        for (Treasure t : dragon.getTreasures()) {

            sum += t.getCost();

            if(sum <= certainSum){

                treasuresOfCertainSum.add(t);
            }
        }
        return treasuresOfCertainSum;
    }

}
