package com.task.fourth.agrigationTourist;

import java.util.ArrayList;

public class TravelOffice {
    private ArrayList<Voucher> vouchers = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();

    public TravelOffice() {
        base();
    }
    private void base(){

        vouchers.add(new Voucher( 9, Transport.BUS, TravelType.EXCURSIONS, Meal.WITHOUT_MEAL));
        vouchers.add(new Voucher( 24, Transport.TRAIN, TravelType.PILGRIMAGE, Meal.HB));
        vouchers.add(new Voucher(15, Transport.PLANE, TravelType.REST, Meal.ALL_INCLUSIVE));

        clients.add(new Client("Ivan", "Ivanov", 321456987));
        clients.add(new Client("Petr", "Petrov", 321479845));
        clients.add(new Client("Sydor", "Sydorov", 321657941));
    }

    public Voucher clientsChoise(Transport choiceTr, TravelType choiceType, Meal choiceMeal, int days ){

        Voucher voucherSearched = new Voucher();
        for (Voucher v : vouchers) {

            if(v.getTransport().equals(choiceTr) && v.getType().equals(choiceType)
                    && v.getMeal().equals(choiceMeal) && v.getCountOfDays() == days){
                voucherSearched = v;
                System.out.println("Congratulation, you choosed our special offer!");
            }
        }
        return voucherSearched;
    }
    public Voucher clientsChoiseExlusive(Transport choiceTr, TravelType choiceType, Meal choiceMeal, int days ){

        Voucher voucherSearched = new Voucher();

            voucherSearched.setTransport(choiceTr);
            voucherSearched.setType(choiceType);
            voucherSearched.setMeal(choiceMeal);
            voucherSearched.setCountOfDays(days);

        return voucherSearched;
    }

}
