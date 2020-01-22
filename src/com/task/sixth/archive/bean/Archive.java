package com.task.sixth.archive.bean;

import com.task.sixth.archive.bean.Portfolio;

import java.util.ArrayList;

public class Archive {

    private ArrayList<Portfolio> portfolios = new ArrayList<>();


    public ArrayList<Portfolio> base(){

        portfolios.add(new Portfolio("Sergey", "Mozhenkov", 12,
                "Astronomy", 8.3));
        portfolios.add(new Portfolio("Andrey", "Luzhkov", 31,
                "Philosophy", 5.3));
        portfolios.add(new Portfolio("Vladislav", "Kutuzov", 52,
                "Geography", 9.0));
        portfolios.add(new Portfolio("Lev", "Ledniov", 48,
                "Chemistry", 8.1));
        portfolios.add(new Portfolio("Isaak", "Newton", 12,
                "Physics", 10.3));

        return portfolios;
    }
}
