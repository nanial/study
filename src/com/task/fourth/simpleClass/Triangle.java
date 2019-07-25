package com.task.fourth.simpleClass;

//Описать класс, представляющий треугольник. Предусмотреть методы для
//создания объектов, вычисления площади, периметра и точки пересечения медиан.

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    private Triangle() {
    }

    private Triangle(int side1, int side2, int side3) {

        if(side1 + side2 > side3 || side1 + side3 > side2
                || side2 + side3 > side1) {

            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    private Triangle createTriangle(int side1, int side2, int side3){

        return new Triangle(side1, side2, side3);
    }

    private int getPerimeter(){

            return side1 + side2 + side3;
    }

    private  double getSquare(){

            double halfPerim = (side1 + side2 + side3) / 2;

        return Math.sqrt(halfPerim * (halfPerim - side1) *
            (halfPerim - side2) * (halfPerim - side3));
    }

    private void medianPoint(int x1, int y1, int x2, int y2, int x3, int y3){

        if(((x1-x3)/(x2-x3)) != ((y1-y3)/(y2-y3))){

            int medianPointX = (x1 + x2 + x3) / 3;
            int medianPointY = (y1 + y2 + y3) / 3;
            System.out.println("(" + medianPointX + "," + medianPointY + ")");
        }
        else {
            System.out.println("The points are collinear");
        }
    }

    public static void main(String[] args) {

        new Triangle().medianPoint(1, 8, 3, 10, 5, 11);
        System.out.println(new Triangle(5, 9, 8).getSquare());
        System.out.println(new Triangle(3, 5, 4).getPerimeter());
    }
}
