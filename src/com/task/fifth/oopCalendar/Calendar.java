package com.task.fifth.oopCalendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar {

    final private String[] constantHolidays = {"01/01", "07/01",
            "08/03", "01/05", "09/05", "03/07", "07/11", "25/12"};

    private String [] transientHoliday;
    public Calendar() {
    }

    static class Year{

        private int numOfYear;
        private Date easter;
        private Date catholicEaster;
        private Date dayOfMemory;
        final private WeekDays saturday = WeekDays.SATURDAY;
        final private WeekDays sunday = WeekDays.SUNDAY;
        private LocalDate date;
        public Year(int numOfYear) {
            this.numOfYear = numOfYear;
        }

        public void getWeekEnds() {

            for (int i = 1; i < 365; i++) {
                date = LocalDate.ofYearDay(numOfYear, i);
                if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    System.out.println(date.getDayOfMonth() + "/" + date.getDayOfMonth()date.getMonthValue());
                }
            }
        }

        public String getEasterDate(int year) {
            int a = year % 19;
            int b = year % 4;
            int c = year % 7;
            int k = year / 100;
            int p = (13 + 8 * k) / 25;
            int q = k / 4;
            int M = (15 - p + k - q) % 30;
            int N = (4 + k - q) % 7;
            int d = (19 * a + M) % 30;
            int e = (2 * b + 4 * c + 6 * d + N) % 7;

            if (d == 29 && e == 6) {
                return (LocalDate.of(year, 3, 22).plusDays(d + e).minusDays(7)).toString();
            } else
                return (LocalDate.of(year, 3, 22).plusDays(d + e)).toString();
        }
        public Date ortodoxPasqua(int year) {
            Date easterDate = new Date();
            int a = year % 4;
            int b = year % 7;
            int c = year % 19;
            int d = (19 * c + 15) % 30;
            int e = (2 * a + 4 * b - d + 34) % 7;
            int month = (d + e + 114) / 31 - 1;
            int day = ((d + e + 114) % 31) + 14;

            easterDate.setYear(year);
            easterDate.setMonth(month);
            easterDate.setDate(day);


            return easterDate;
        }
        public String dayOfMemory(int year) {
            
            Date mem = new Date();
            Date easter = ortodoxPasqua(year);
            
            if((easter.getDate() + 9)> 30 && easter.getMonth() == 3){
           
            mem.setMonth(easter.getMonth() + 1);
            mem.setDate((easter.getDate() + 9) - 30);            
            }
            else if ((easter.getDate() + 9)> 31){
            mem.setMonth(easter.getMonth() + 1);
            mem.setDate((easter.getDate() + 9) - 31);   
            }
            return mem.toString();
        }
    public  void printConst(){
        for (String s : constantHolidays) {
            System.out.println(s);
        }
    }
}
