package com.task.second.arrayOne;

//Дан целочисленный массив с количеством элементов п. Сжать массив,
// выбросив из него каждый второй элемент (освободившиеся элементы
// заполнить нулями). Примечание. Дополнительный массив не использовать.

public class ArraysTen {

    public static void main(String[] args) {
        int n = 20;//for example
        int [] arr = new int [n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 10 - 5);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0 ){
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}



