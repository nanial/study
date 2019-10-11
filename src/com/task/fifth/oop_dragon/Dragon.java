package com.task.fifth.oop_dragon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Dragon {

    Grotto grotto = new Grotto();
    Treasure[] treasures = grotto.fillingCollect();

    public void visionOfTreasure(){


        for (Treasure t : treasures) {
            System.out.println("The treasure id "+ t.getId() +
                    " costs " + t.getCost() + " denariy " + t.getType() + " weight " + t.getWeight());

        }
    }
    public Treasure getMoreExpensive(){

        long maxCost = 0;
        Treasure moreExpTreasure = new Treasure();

        for (Treasure t : treasures) {

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

        Arrays.sort(treasures, Comparator.comparing(Treasure::getCost));

        for (Treasure t : treasures) {

                sum += t.getCost();

            if(sum <= certainSum){

                treasuresOfCertainSum.add(t);
            }
        }
        return treasuresOfCertainSum;
    }

}
