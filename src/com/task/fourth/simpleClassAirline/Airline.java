package com.task.fourth.simpleClassAirline;

//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
// set- и get- методы и метод toString().
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {

    private String destination;
    private int nunOfRout;
    private TypeOfPlane typeOfPlane;
    private Date departure;
    private WeekDays day;

    public Airline(String destination, int nunOfRout, TypeOfPlane typeOfPlane, Date departure, WeekDays day) {
        this.destination = destination;
        this.nunOfRout = nunOfRout;
        this.typeOfPlane = typeOfPlane;
        this.departure = departure;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNunOfRout() {
        return nunOfRout;
    }

    public void setNunOfRout(int nunOfRout) {
        this.nunOfRout = nunOfRout;
    }

    public TypeOfPlane getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(TypeOfPlane typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public WeekDays getDay() {
        return day;
    }

    public void setDay(WeekDays day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return destination  + ", # " + nunOfRout +
                ", typeOfPlane is " + typeOfPlane +
                ", departure at " + getDateTime(departure) +
                ", on " + day;
    }
    public static String getDateTime(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(date);
    }
    public static void main(String[] args) {

        System.out.println(new Airline("Roma", 1456, TypeOfPlane.BOEING, new Date(999161649),
                WeekDays.FRIDAY));
    }
}
