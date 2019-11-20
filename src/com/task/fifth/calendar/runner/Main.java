package com.task.fifth.calendar.runner;

//Создать класс Календарь с внутренним классом, с помощью объектов которого
// можно хранить информацию о выходных и праздничных днях.

import com.task.fifth.calendar.bean.MyCalendar;
import com.task.fifth.calendar.logic.MyCalendarUtils;
import com.task.fifth.calendar.logic.MyCalendarUtilsImpl;

public class Main {

    public static void main(String[] args) {

        MyCalendarUtils myCalendar = new MyCalendarUtilsImpl(new MyCalendar(2019));
        System.out.println(myCalendar.allHolToString());
    }
}
