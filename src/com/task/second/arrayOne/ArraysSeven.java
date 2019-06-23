package com.task.second.arrayOne;

//Даны действительные числа а1, ... , а2n,
// Найти max(a1 + a2n, ... an + an+1)

class ArrasSeven {

    public static void main(String[] args){

        int n = 20; //for example
        double max = 0;
        double [] arr = new double [2 * n];// initial array
        double [] halfArr = new double [n]; // result array

        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.random() * 100 - 50;
        }

        for (int i = 0; i < halfArr.length; i++){
            halfArr[i] = arr[i] + arr[arr.length - 1 - i]; // according to the conditions of task
        }

        for (Double d : halfArr){
            if(d > max){
                max = d;
            }
        }

        System.out.println("Max value is: " + max);
    }
}

