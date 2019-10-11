package com.task.fourth.agrigation_tourist;

//Туристические путевки. Сформировать набор предложений клиенту по выбору
// туристической путевки различного типа (отдых, экскурсии, лечение, шопинг,
// круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок

public class Main {
    public static void main(String[] args) {
        TravelOffice smokTravel = new TravelOffice();
        System.out.println(smokTravel.clientsChoise(Transport.BUS,
                TravelType.EXCURSIONS, Meal.WITHOUT_MEAL, 9).toString());
        System.out.println(smokTravel.clientsChoiseExlusive(Transport.FERRY,
                TravelType.REAL_TRIP, Meal.BB, 23).toString());
    }
}
