package com.task.second.decomposition;

//На плоскости заданы своими координатами n точек. Написать метод(методы),
//определяющие, между какими из пар точек самое большое расстояние.
//Указание. Координаты точек занести в массив.

public class DecompositionFour {

    public static void main(String[] args){
        int [][] points = new int[][]{{3, -124},{0, 11},{4, -217},{1, 10},{13, 3},{6, 52}};
        maxDistant(points);
    }

    private static void maxDistant(int [][] arr){
        double max = 0;
        double[] arrOfDistance = new double[arr.length];
        int[] resultPoint = new int[2];

        for(int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++){

                arrOfDistance[i] = Math.sqrt(Math.pow((arr[i][0] - arr[j][0]), 2)
                        + Math.pow((arr[i][1] - arr[j][1]), 2));

               if (arrOfDistance[i] > max){
                    max = arrOfDistance[i];
                    resultPoint[0] = i;
                    resultPoint[1] = j;
               }
            }
        }
        System.out.println("Max distant from point with index " + resultPoint[0] +
                " to point with index " + resultPoint[1]) ;
    }
}





