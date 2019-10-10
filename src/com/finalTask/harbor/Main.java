package com.finalTask.harbor;

//Многопоточность. Порт . Корабли заходят в порт для разгрузки/загрузки контейнеров.+
// Число контейнеров, находящихся в текущий момент в порту и на корабле,
// должно быть неотрицательным и превышающим заданную грузоподъемность судна и вместимость порта.
// В порту работает несколько причалов.+ У одного причала может стоять один корабль.+
// Корабль может загружаться у причала или разгружаться.+


public class Main {

    public static void main(String[] args) {

        Port port = new Port(10000, 800, 5);

        port.getShips().add(new Ship("ship#1", 1000, 500,
                50, 20, port));
        port.getShips().add(new Ship("ship#2", 2000, 700,
                50, 10, port));
        port.getShips().add(new Ship("ship#3", 3000, 1000,
                50, 12, port));
        port.getShips().add(new Ship("ship#4", 1000, 200,
                50, 22, port));
        port.getShips().add(new Ship("ship#5", 1500, 350,
                50, 3, port));
        port.getShips().add(new Ship("ship#6", 1900, 600,
                50, 6, port));
        port.getShips().add(new Ship("ship#7", 3100, 900,
                50, 9, port));
        port.getShips().add(new Ship("ship#8", 7500, 180,
                50, 11, port));
        port.getShips().add(new Ship("ship#9", 900, 120,
                50, 96, port));


        port.getShips().forEach(ship -> {

            int numOfDocks = port.getNumOfdocks();

            try {

                if (numOfDocks != 0) {

                    ship.start();
                    ship.join();
                    numOfDocks--;

                } else {
                    ship.wait();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }

}
