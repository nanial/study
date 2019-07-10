package com.task.second.decomposition;

//Вычислить площадь правильного шестиугольника со стороной а,
// используя метод вычисления площади треугольника.

public class DecompositionThree {

        public static void main(String[] args) {
            System.out.println(hexagonArea(5));
        }

        private static double triangleArea(int a) {
            return (a * a * Math.sqrt(3)) / 4;//here is equilateral triangle, works for this type of triangle
        }

        private static double hexagonArea(int a){
            return 6 * triangleArea(a);
        }

}





