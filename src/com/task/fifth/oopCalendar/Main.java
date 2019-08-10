package com.task.fifth.oopCalendar;

//Создать класс Календарь с внутренним классом, с помощью объектов
// которого можно хранить информацию о выходных и праздничных днях

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
       /* Date date = new Date(0);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM");
        System.out.println(format.format(date));//return 01/01
        Date indep = new Date();

        String s = "03/07";
        try {
            indep = format.parse(s);//parse 3 july
        }
        catch (ParseException pe){}

        System.out.println(indep.toString());

        System.out.println(new Calendar.Year(2019).getEasterDate(2019));
        System.out.println(new Calendar.Year(2019).ortodoxPasqua(2019));
        new Calendar().printConst();
        System.out.println(new Calendar.Year(2019).dayOfMemory(2019));*/
       new Calendar.Year(2019).getWeekEnds();

    }

}
