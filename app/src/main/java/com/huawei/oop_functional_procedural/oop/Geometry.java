package com.huawei.oop_functional_procedural.oop;

public class Geometry {

    public static void main(String[] args) {
        Square square = new Square(20.2);
        System.out.println("square area : " + square.areaCalculate());

        Rectangle rectangle = new Rectangle(20.5, 12.5);
        System.out.println("rectangle area : " + rectangle.areaCalculate());

        Circle circle = new Circle(25.0);
        System.out.println("circle area : " + circle.areaCalculate());
    }
}
