package com.task.fourth.simpleClass;

//Составьте описание класса для представления времени. Предусмотрите
// возможности установки времени и изменения его отдельных полей (час,
// минута, секунда) с проверкой допустимости вводимых значений. В случае
// недопустимых значений полей поле устанавливается в значение 0.  Создать
// методы изменения времени на заданное количество часов, минут и секунд.

public class Timer {

    private  int hour;
    private  int minute;
    private  int sec;
    private int max;
    private static int min = 0;


    public Timer() {
    }

    private Timer(int hour, int minute, int sec) {
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
    }


    private int getHour() {
        return hour;
    }

    private int getMinute() {
        return minute;
    }

    private int getSec() {
        return sec;
    }

    private void setSecond(int second){

        max = 59;
        if (second >= min && second <= max){
            this.sec = second;
        }
        else {
            this.sec = 0;
        }
    }
    private void setMinute(int minute){
        max = 59;
        if (minute >= min && minute <= max){
            this.minute = minute;
        }
        else {

            this.minute = 0;
        }
    }
    private void setHour(int hour){

        max = 23;

        if (hour >= min && hour <= max){
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }
    }

    @Override
    public String toString() {
        return "hour=" + hour +
                ", minute=" + minute +
                ", sec=" + sec;
    }

    private static void changeTime(int changeHour, int changeMinute, int changeSec, Timer time){

        time.setHour(time.getHour() + changeHour);
        time.setMinute(time.getMinute() + changeMinute);
        time.setSecond(time.getSec() + changeSec);
    }

    public static void main(String[] args) {

        Timer time = new Timer(13, 29, 26);
        changeTime(1, 2, 3, time);
        System.out.println(time.toString());
    }
}
