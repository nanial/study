package com.task.fifth.dragon.runner;

//Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Приложение должно быть объектно-, а не процедурно-ориентированным.
//• Каждый класс должен иметь отражающее смысл название и информативный состав.
//• Наследование должно применяться только тогда, когда это имеет смысл.
//• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//• Классы должны быть грамотно разложены по пакетам.
//• Консольное меню должно быть минимальным.
//• Для хранения данных можно использовать файлы.
//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//выбора сокровищ на заданную сумму.

import com.task.fifth.dragon.bean.Dragon;
import com.task.fifth.dragon.logic.api.DragonUtils;
import com.task.fifth.dragon.logic.impl.DragonUtilsImpl;

public class Main {

    public static void main(String[] args) {

        DragonUtils patronDragon = new DragonUtilsImpl(new Dragon());
        patronDragon.visionOfTreasure();
        System.out.println(patronDragon.getMoreExpensive().toString());
        System.out.println(patronDragon.getTreasuresOfCertainSum(16));
    }
}
