package com.task.second.decomposition;

//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
//вычисления его площади, если угол между сторонами длиной X и Y— прямой

public class DecompositionNine {

        public static void main(String[] args) {

            double  X = 2;
            double Y = 3;
            double Z = 5;
            double T = 6;
            System.out.println(heron(X, Y, pythagoras(X, Y)) + heron(Z, T, pythagoras(X, Y)));
        }

        private static double pythagoras (double a, double b) {
            return  Math.sqrt((a * a) + (b * b));
        }

        private static double heron (double a, double b, double c){
            double halfPerim = (a + b + c) / 2;
            return Math.sqrt(halfPerim * (halfPerim - a) *
                    (halfPerim - b) * (halfPerim - c));
        }
}





