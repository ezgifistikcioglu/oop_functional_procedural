package com.huawei.oop_functional_procedural.procedural;

public class Geometry {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Square square = new Square(10.2);
        System.out.println("square area : " + areaCalculate(square));


        Rectangle rectangle = new Rectangle(10.5, 12.5);
        System.out.println("rectangle area : " + areaCalculate(rectangle));

        Circle circle = new Circle(15.0);
        System.out.println("circle area : " + areaCalculate(circle));
    }

    public static double areaCalculate(Object shape) {
        double result = 0;
        if (shape instanceof Square) {
            Square square = (Square) shape;
            result = square.side * square.side;
        }else if (shape instanceof  Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            result = rectangle.height * rectangle.width;
        }else if (shape instanceof  Circle){
            Circle circle = (Circle) shape;
            result = PI * circle.radius * circle.radius;
        }
        return result;
    }
}
