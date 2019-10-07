package com.finalTask.harbor;

//Многопоточность. Порт . Корабли заходят в порт для разгрузки/загрузки контейнеров.
// Число контейнеров, находящихся в текущий момент в порту и на корабле,
// должно быть неотрицательным и превышающим заданную грузоподъемность судна и вместимость порта.
// В порту работает несколько причалов. ?У одного причала может стоять один корабль.?
// Корабль может загружаться у причала или разгружаться.


public class Main {

    public static void main(String[] args) {

        Port port = new Port(10000, true, 500);

        port.getShips().add(new Ship("ship#1", 1000, 50, port));
        port.getShips().add(new Ship("ship#2", 2000, 50, port));
        port.getShips().add(new Ship("ship#3", 3000, 50, port));
        port.getShips().add(new Ship("ship#4", 100, 50, port));
        port.getShips().add(new Ship("ship#5", 100, 50, port));
        port.getShips().add(new Ship("ship#6", 100, 50, port));
        port.getShips().add(new Ship("ship#7", 100, 50, port));
        port.getShips().add(new Ship("ship#8", 100, 50, port));
        port.getShips().add(new Ship("ship#9", 100, 50, port));


        //for (int i = 0; i < 8; i++) {

            port.getShips().forEach(ship -> {
                try {
                    ship.start();
                    ship.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        //}
    }
}
