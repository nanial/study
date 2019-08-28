package com.task.fifth.oopCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Calendar {

    final private String[] constantHolidays = {"01/01", "07/01",
            "08/03", "01/05", "09/05", "03/07", "07/11", "25/12"};
    private int numOfYear;

    public Calendar(int numOfYear) {
        this.numOfYear = numOfYear;
    }

    SimpleDateFormat format = new SimpleDateFormat("dd/MM");

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

        holidays.addAll(Calendar.this.constHolAsDate());
        holidays.addAll(new TransientHolidays(this.numOfYear).getWeekEnds());
        holidays.add(Date.from(new TransientHolidays(this.numOfYear).getEasterDate().
                atStartOfDay(ZoneId.systemDefault()).toInstant()));
        holidays.add(new TransientHolidays(this.numOfYear).dayOfMemory());
        holidays.add(new TransientHolidays(this.numOfYear).ortodoxPasqua());

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
            Calendar.this.numOfYear = numOfYear;
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
                    weekEnd.add(Calendar.this.format.parse(s));
                } catch (ParseException pe){
                    System.out.println(pe.getMessage());
                }
            }
            return weekEnd;
        }

        public LocalDate getEasterDate() {
            int a = numOfYear % 19;
            int b = numOfYear % 4;
            int c = numOfYear % 7;
            int k = numOfYear / 100;
            int p = (13 + 8 * k) / 25;
            int q = k / 4;
            int M = (15 - p + k - q) % 30;
            int N = (4 + k - q) % 7;
            int d = (19 * a + M) % 30;
            int e = (2 * b + 4 * c + 6 * d + N) % 7;

            if (d == 29 && e == 6) {
                return (LocalDate.of(numOfYear, 3, 22).plusDays(d + e).minusDays(7));
            } else
                return LocalDate.of(numOfYear, 3, 22).plusDays(d + e);
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
            easterDate.setYear(numOfYear);
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
            return mem;
        }
    }
}