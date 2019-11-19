package com.task.fifth.dragon.logic;

import com.task.fifth.dragon.bean.Treasure;

import java.util.ArrayList;

public interface DragonUtils {

    void visionOfTreasure();
    Treasure getMoreExpensive();
    ArrayList<Treasure> getTreasuresOfCertainSum(long certainSum);
}
