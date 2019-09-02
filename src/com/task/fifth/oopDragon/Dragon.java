package com.task.fifth.oopDragon;

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

}
