package com.task.fifth.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class MyCalendar {

    final private String[] constantHolidays = {"01/01", "07/01",
            "08/03", "01/05", "09/05", "03/07", "07/11", "25/12"};
    private int numOfYear;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM");

    public MyCalendar(int numOfYear) {
        this.numOfYear = numOfYear;
    }

    private ArrayList<Date> constHolAsDate(){

        ArrayList<Date> constHol = new ArrayList<>();

        for (String s : constantHolidays) {
            try {
                constHol.add(format.parse(s));
            }
            catch (ParseException pe){
                System.out.println(pe.getMessage());
            }

        }
        return constHol;
    }
    public SortedSet<Date> allHoliday(){

        SortedSet<Date> holidays = new TreeSet<>();

        holidays.addAll(MyCalendar.this.constHolAsDate());
        holidays.addAll(new TransientHolidays(this.numOfYear).getWeekEnds());
        holidays.add(new TransientHolidays(this.numOfYear).dayOfMemory());

        return holidays;
    }

    public ArrayList<String> allHolToString(){

        ArrayList<String> allHolToString = new ArrayList<>();

        for (Date d : this.allHoliday()) {

            allHolToString.add(format.format(d));
        }
        return allHolToString;
    }

    class TransientHolidays {


        public TransientHolidays(int numOfYear) {
            MyCalendar.this.numOfYear = numOfYear;
        }

        public int dayOfYear(){

            if(numOfYear % 4 == 0){
                return 366;
            }
            else {
                return 365;
            }
        }

        public ArrayList<Date> getWeekEnds() {

            ArrayList<String> weekEnds = new ArrayList<>();
            ArrayList<Date>   weekEnd = new ArrayList<>();

            for (int i = 1; i < this.dayOfYear(); i++) {

                LocalDate date = LocalDate.ofYearDay(numOfYear, i);

                if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    weekEnds.add(date.getDayOfMonth() + "/" + date.getMonthValue());
                }
            }
            for (String s : weekEnds) {
                try {
                    weekEnd.add(MyCalendar.this.format.parse(s));
                } catch (ParseException pe){
                    System.out.println(pe.getMessage());
                }
            }
            return weekEnd;
        }

        public Date ortodoxPasqua() {

            Date easterDate = new Date();
            int a = numOfYear % 4;
            int b = numOfYear % 7;
            int c = numOfYear % 19;
            int d = (19 * c + 15) % 30;
            int e = (2 * a + 4 * b - d + 34) % 7;
            int month = (d + e + 114) / 31 - 1;
            int day = ((d + e + 114) % 31) + 14;

            easterDate.setMonth(month);
            easterDate.setDate(day);
            return easterDate;
        }

        public Date dayOfMemory() {

            Date mem = new Date();
            Date easter = ortodoxPasqua();

            if ((easter.getDate() + 9) > 30 && easter.getMonth() == 3) {

                mem.setMonth(easter.getMonth() + 1);
                mem.setDate((easter.getDate() + 9) - 30);

            } else if ((easter.getDate() + 9) > 31) {
                mem.setMonth(easter.getMonth() + 1);
                mem.setDate((easter.getDate() + 9) - 31);

            }
            mem.setYear(70);
            return mem;
        }
    }
}