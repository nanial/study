package com.task.fifth.calendar.bean;

import java.text.SimpleDateFormat;

public class MyCalendar {

    final private String[] constantHolidays = {"01/01", "07/01",
            "08/03", "01/05", "09/05", "03/07", "07/11", "25/12"};

    private int numOfYear;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM");

    public MyCalendar(int numOfYear) {
        this.numOfYear = numOfYear;
    }

    public String[] getConstantHolidays() {
        return constantHolidays;
    }

    public int getNumOfYear() {
        return numOfYear;
    }

    public void setNumOfYear(int numOfYear) {
        this.numOfYear = numOfYear;
    }

    public class TransientHolidays {

        public TransientHolidays(int numOfYear) {
            MyCalendar.this.numOfYear = numOfYear;
        }

    }
}